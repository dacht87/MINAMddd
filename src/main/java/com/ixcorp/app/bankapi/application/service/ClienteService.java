package com.ixcorp.app.bankapi.application.service;

import com.ixcorp.app.bankapi.application.DTO.ClienteDTO;

import java.util.List;

public interface ClienteService {

    ClienteDTO createCliente(ClienteDTO clienteDTO);
    ClienteDTO updateCliente(ClienteDTO clienteDTO);
    ClienteDTO getClienteId(Long id);
    List<ClienteDTO> listarCliente();
}
