package com.tallerspringbootmvc.clientservice.dto.client;

import jakarta.validation.constraints.*;
import lombok.Builder;

@Builder
public record ClientRequestDTO(
        @Pattern(regexp = "[0-9]{8}") @NotEmpty @NotBlank String documentNumber,
        @NotEmpty @NotBlank String phoneNumber,
        @Email String email
) {
}
