package com.ixcorp.app.bankapi.controllers;

import com.ixcorp.app.bankapi.application.DTO.OperacionDTO;
import com.ixcorp.app.bankapi.application.response.ServiceResult;
import com.ixcorp.app.bankapi.application.service.OperacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/operacion")
public class OperacionController {

    @Autowired
    private OperacionService operacionService;

    @PostMapping("/retiros")
    public ResponseEntity<ServiceResult> retiroCuenta(@RequestBody OperacionDTO operacionDTO) {
        try {

            ServiceResult result = new ServiceResult();

            return new ResponseEntity<ServiceResult>(result, HttpStatus.CREATED);

        } catch (Exception ex) {
            ex.printStackTrace();
            throw ex;
        }
    }

    @PostMapping("/tranferencia")
    public ResponseEntity<ServiceResult> tranferenciaCuenta(@RequestBody OperacionDTO operacionDTO) {
        try {

            ServiceResult result = new ServiceResult();
            //   cuentaService.createCuenta(cuentaDTO);

            return new ResponseEntity<ServiceResult>(result, HttpStatus.CREATED);

        } catch (Exception ex) {
            ex.printStackTrace();
            throw ex;
        }
    }

    @PostMapping("/deposito")
    public ResponseEntity<ServiceResult> depositoCuenta(@RequestBody OperacionDTO operacionDTO) {
        try {

            ServiceResult result = new ServiceResult();
            //   cuentaService.createCuenta(cuentaDTO);

            return new ResponseEntity<ServiceResult>(result, HttpStatus.CREATED);

        } catch (Exception ex) {
            ex.printStackTrace();
            throw ex;
        }
    }

    @GetMapping("/listOperacion")
    public ResponseEntity<ServiceResult> getAllCliente() {
        try {

            ServiceResult serviceResult = new ServiceResult();

            List<OperacionDTO> operacionDTOList = operacionService.listarOperacion();
            serviceResult.setData(operacionDTOList);

            return new ResponseEntity<>(serviceResult, HttpStatus.FOUND);

        } catch (Exception ex) {
            ex.printStackTrace();
            throw ex;
        }
    }
}
