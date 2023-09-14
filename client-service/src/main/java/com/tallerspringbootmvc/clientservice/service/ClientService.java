package com.tallerspringbootmvc.clientservice.service;

import com.tallerspringbootmvc.clientservice.dto.client.ClientRequestDTO;
import com.tallerspringbootmvc.clientservice.dto.client.ClientResponseDTO;

public interface ClientService {

    ClientResponseDTO createClient(ClientRequestDTO requestDTO);
}