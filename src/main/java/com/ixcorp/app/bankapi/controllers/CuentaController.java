package com.ixcorp.app.bankapi.controllers;

import com.ixcorp.app.bankapi.application.DTO.CuentaDTO;
import com.ixcorp.app.bankapi.application.response.ServiceResult;
import com.ixcorp.app.bankapi.application.service.CuentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/cuentas")
public class CuentaController {

    @Autowired
    private CuentaService  cuentaService;

    @PostMapping("/create")
    public ResponseEntity<CuentaDTO> createCuenta(@RequestBody CuentaDTO cuentaDTO) {
        try {

            cuentaService.createCuenta(cuentaDTO);

            return new ResponseEntity<>(cuentaDTO, HttpStatus.CREATED);

        } catch (Exception ex) {
            ex.printStackTrace();
            throw ex;
        }
    }

    @PostMapping("/update")
    public ResponseEntity<CuentaDTO> updateCuenta(@RequestBody CuentaDTO cuentaDTO) {
        try {

            cuentaService.updateCuenta(cuentaDTO);

            return new ResponseEntity<>(cuentaDTO, HttpStatus.CREATED);

        } catch (Exception ex) {
            ex.printStackTrace();
            throw ex;
        }
    }

    @GetMapping("/listCuenta")
    public ResponseEntity<ServiceResult> getAllCuenta() {
        try {

            ServiceResult serviceResult = new ServiceResult();

            List<CuentaDTO> cuentaDTOList = cuentaService.listarCuenta();
            serviceResult.setData(cuentaDTOList);

            return new ResponseEntity<>(serviceResult, HttpStatus.FOUND);

        } catch (Exception ex) {
            ex.printStackTrace();
            throw ex;
        }
    }
}
