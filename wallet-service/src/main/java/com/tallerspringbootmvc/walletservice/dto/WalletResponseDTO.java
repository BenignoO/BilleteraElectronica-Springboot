package com.tallerspringbootmvc.walletservice.dto;

import java.math.BigDecimal;

public record WalletResponseDTO(
        Long walletId,
        BigDecimal balance,
        String currency
) {
}
