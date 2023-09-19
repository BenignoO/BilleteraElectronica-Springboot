package com.tallerspringbootmvc.clientservice.service;

import com.tallerspringbootmvc.clientservice.dto.client.ClientRequestDTO;
import com.tallerspringbootmvc.clientservice.dto.client.ClientResponseDTO;
import com.tallerspringbootmvc.clientservice.dto.wallet.WalletRequestDTO;
import com.tallerspringbootmvc.clientservice.dto.wallet.WalletResponseDTO;
import com.tallerspringbootmvc.clientservice.model.ClientEntity;
import com.tallerspringbootmvc.clientservice.model.mapper.ClientMapper;
import com.tallerspringbootmvc.clientservice.repository.ClientRepository;
import com.tallerspringbootmvc.clientservice.utils.WalletAPIClient;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Slf4j
@Service
@RequiredArgsConstructor
public class ClientServiceImpl implements ClientService {

    private final ClientRepository clientRepository;
    private final ClientMapper clientMapper;
    private final WalletAPIClient apiClient;

    @Override
    public void createClient(ClientRequestDTO requestDTO) {
        log.info("clientservice createClient");
        if (Objects.isNull(requestDTO))
            throw new RuntimeException("El Cliente no puede ser nulo.");

        ClientEntity client = clientMapper.toEntity(requestDTO);

        WalletRequestDTO walletRequestDTO = WalletRequestDTO.builder()
                .clientDocumentNumber(client.getDocumentNumber())
                .build();

        apiClient.createWallet(walletRequestDTO);

        clientRepository.save(client);
    }

    @Override
    public WalletResponseDTO getBalance(String documentNumber) {
        if (documentNumber.trim().isEmpty())
            throw new RuntimeException("Número de documento no válido.");

        return apiClient.getBalance(documentNumber).getBody();
    }
}
