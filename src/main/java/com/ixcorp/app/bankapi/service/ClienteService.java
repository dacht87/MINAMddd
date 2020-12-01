package com.ixcorp.app.bankapi.service;

import com.ixcorp.app.bankapi.dto.ClienteDTO;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ClienteService {

    ClienteDTO createCliente(ClienteDTO clienteDTO);
    ClienteDTO updateCliente(ClienteDTO clienteDTO);
    ClienteDTO getClienteId(Long id);
    List<ClienteDTO> listarCliente();
}
