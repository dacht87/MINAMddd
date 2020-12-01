package com.ixcorp.app.bankapi.controllers;

import com.ixcorp.app.bankapi.config.ServiceResult;
import com.ixcorp.app.bankapi.dto.ClienteDTO;
import com.ixcorp.app.bankapi.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/clientes")
public class ClienteController {


    @Autowired
    private ClienteService clienteService;

    @PostMapping("/create")
    public ResponseEntity<ClienteDTO> createCliente(@RequestBody ClienteDTO clienteDTO) {
        try {

            clienteService.createCliente(clienteDTO);

            return new ResponseEntity<>(clienteDTO, HttpStatus.CREATED);

        } catch (Exception ex) {
            ex.printStackTrace();
            throw ex;
        }
    }

    @PostMapping("/update")
    public ResponseEntity<ServiceResult> updateCliente(@RequestBody ClienteDTO clienteDTO) {
        try {
            ServiceResult serviceResult = new ServiceResult();
            clienteService.updateCliente(clienteDTO);

            return new ResponseEntity<>(serviceResult, HttpStatus.CREATED);

        } catch (Exception ex) {
            ex.printStackTrace();
            throw ex;
        }
    }


    @GetMapping("/listCliente")
    public ResponseEntity<ServiceResult> getAllCliente() {
        try {

            ServiceResult serviceResult = new ServiceResult();

            List<ClienteDTO> clienteDTOList = clienteService.listarCliente();
            serviceResult.setData(clienteDTOList);

            return new ResponseEntity<>(serviceResult, HttpStatus.FOUND);

        } catch (Exception ex) {
            ex.printStackTrace();
            throw ex;
        }
    }

    @GetMapping("/getCliente/{id}")
    public ResponseEntity<ClienteDTO> geClienteId(@PathVariable("id") long id) {
        try {

            ClienteDTO clienteDTO = clienteService.getClienteId(id);

            return new ResponseEntity<>(clienteDTO, HttpStatus.FOUND);

        } catch (Exception ex) {
            ex.printStackTrace();
            throw ex;
        }
    }
}
