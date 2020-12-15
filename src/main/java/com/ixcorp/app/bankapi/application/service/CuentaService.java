package com.ixcorp.app.bankapi.application.service;

import com.ixcorp.app.bankapi.application.DTO.CuentaDTO;

import java.util.List;

public interface CuentaService {

    CuentaDTO createCuenta(CuentaDTO cuentaDTO);
    CuentaDTO updateCuenta(CuentaDTO cuentaDTO);
    CuentaDTO getCuentaId(Long id);
    List<CuentaDTO> listarCuenta();
}
