package com.tallerspringbootmvc.walletservice.model.mapper;

import com.tallerspringbootmvc.walletservice.dto.WalletRequestDTO;
import com.tallerspringbootmvc.walletservice.model.WalletEntity;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

@Component
@Validated
public class WalletMapperImp  implements WalletMapper{

    @Override
    public WalletRequestDTO toDTO(WalletEntity entity) {
        return null;
    }

    @Override
    public WalletEntity toEntity(WalletRequestDTO requestDTO) {
        return null;
    }
}
