package com.tallerspringbootmvc.walletservice.model.mapper;

import com.tallerspringbootmvc.walletservice.dto.WalletRequestDTO;
import com.tallerspringbootmvc.walletservice.dto.WalletResponseDTO;
import com.tallerspringbootmvc.walletservice.model.WalletEntity;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

@Component
@Validated
public class WalletMapperImp  implements WalletMapper{

    @Override
    public WalletResponseDTO toDTO(WalletEntity entity) {

        return WalletResponseDTO.builder()
                .walletId(entity.getWalletId())
                .balance(entity.getBalance())
                .currency(entity.getCurrency())
                .build();
    }

    @Override
    public WalletEntity toEntity(WalletRequestDTO requestDTO) {

        return WalletEntity.builder()
                .clientDocumentNumber(requestDTO.clientDocumentNumber())
                .build();
    }
}
