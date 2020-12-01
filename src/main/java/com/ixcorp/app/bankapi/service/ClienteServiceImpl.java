package com.ixcorp.app.bankapi.service;

import com.ixcorp.app.bankapi.config.ObjectMapperUtils;
import com.ixcorp.app.bankapi.domain.Cliente;
import com.ixcorp.app.bankapi.dto.ClienteDTO;
import com.ixcorp.app.bankapi.dto.OperacionDTO;
import com.ixcorp.app.bankapi.repository.ClienteRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public ClienteDTO createCliente(ClienteDTO clienteDTO) {
        try {

            ModelMapper modelMapper = new ModelMapper();

            Cliente cliente = modelMapper.map(clienteDTO, Cliente.class);
            clienteRepository.save(cliente);

            return clienteDTO;

        } catch (Exception ex) {
            ex.printStackTrace();
            throw ex;
        }
    }

    @Override
    public ClienteDTO updateCliente(ClienteDTO clienteDTO) {
        try {

            ModelMapper modelMapper = new ModelMapper();

            Cliente cliente = modelMapper.map(clienteDTO, Cliente.class);
            clienteRepository.save(cliente);

            return clienteDTO;

        } catch (Exception ex) {
            ex.printStackTrace();
            throw ex;
        }
    }

    @Override
    public ClienteDTO getClienteId(Long id) {
        try {

            ModelMapper modelMapper = new ModelMapper();

            Optional<Cliente> cliente = clienteRepository.findById(id);

            ClienteDTO clienteDTO = modelMapper.map(cliente.get(), ClienteDTO.class);
            return clienteDTO;

        } catch (Exception ex) {
            ex.printStackTrace();
            throw ex;
        }
    }

    @Override
    public List<ClienteDTO> listarCliente() {
        try {

            List<Cliente> clientes = clienteRepository.findAll();
            List<ClienteDTO> clienteDTOList = ObjectMapperUtils.mapAll(clientes, ClienteDTO.class);

            return clienteDTOList;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw ex;
        }
    }
}
