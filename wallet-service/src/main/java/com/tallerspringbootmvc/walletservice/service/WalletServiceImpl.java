package com.tallerspringbootmvc.walletservice.service;

import com.tallerspringbootmvc.walletservice.dto.WalletRequestDTO;
import com.tallerspringbootmvc.walletservice.model.mapper.WalletMapper;
import com.tallerspringbootmvc.walletservice.repository.WalletRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class WalletServiceImpl implements WalletService{

    private final WalletRepository walletRepository;
    private final WalletMapper walletMapper;
    @Override
    public void createWallet(WalletRequestDTO requestDTO) {

    }
}
