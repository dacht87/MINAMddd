package com.ixcorp.app.bankapi.service;


import com.ixcorp.app.bankapi.dto.OperacionDTO;

import java.util.List;

public interface OperacionService {
    OperacionDTO createDeposito(OperacionDTO operacionDTO);
    OperacionDTO createRetiro(OperacionDTO operacionDTO);
    OperacionDTO createTranferencia(OperacionDTO operacionDTO);
    List<OperacionDTO> listarOperacion();
}
