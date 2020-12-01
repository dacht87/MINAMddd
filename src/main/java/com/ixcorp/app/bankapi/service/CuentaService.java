package com.ixcorp.app.bankapi.service;

import com.ixcorp.app.bankapi.dto.CuentaDTO;
import org.springframework.stereotype.Service;

import java.util.List;

public interface CuentaService {

    CuentaDTO createCuenta(CuentaDTO cuentaDTO);
    CuentaDTO updateCuenta(CuentaDTO cuentaDTO);
    CuentaDTO getCuentaId(Long id);
    List<CuentaDTO> listarCuenta();
}
