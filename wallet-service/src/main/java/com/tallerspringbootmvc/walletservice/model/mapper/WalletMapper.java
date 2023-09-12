package com.tallerspringbootmvc.walletservice.model.mapper;

import com.tallerspringbootmvc.walletservice.dto.WalletRequestDTO;
import com.tallerspringbootmvc.walletservice.model.WalletEntity;
import jakarta.validation.constraints.NotNull;

public interface WalletMapper {
    WalletRequestDTO toDTO(@NotNull WalletEntity entity);

    WalletEntity toEntity(@NotNull WalletRequestDTO requestDTO);
}
