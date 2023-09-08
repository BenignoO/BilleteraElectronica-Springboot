package com.tallerspringbootmvc.clientservice.model.mapper;

public interface ClientMapper {

    // DTO ---> Entity
    ClientEntity toEntity(ClientRequestDTO dto);

    // Entity ---> DTO
    ClientResponseDTO toDTO(ClientEntity entity);
}
