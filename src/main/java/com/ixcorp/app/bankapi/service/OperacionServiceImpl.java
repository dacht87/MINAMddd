package com.ixcorp.app.bankapi.service;

import com.ixcorp.app.bankapi.domain.Cuenta;
import com.ixcorp.app.bankapi.domain.Operacion;
import com.ixcorp.app.bankapi.dto.CuentaDTO;
import com.ixcorp.app.bankapi.dto.OperacionDTO;
import com.ixcorp.app.bankapi.repository.OperacionRepository;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OperacionServiceImpl implements OperacionService {

    @Autowired
    private OperacionRepository operacionRepository;

    @Override
    public OperacionDTO createDeposito(OperacionDTO operacionDTO) {
        try {

            ModelMapper modelMapper = new ModelMapper();

            Operacion operacion = modelMapper.map(operacionDTO, Operacion.class);
            operacionRepository.save(operacion);

            return operacionDTO;

        } catch (Exception ex) {
            ex.printStackTrace();
            throw ex;
        }
    }

    @Override
    public OperacionDTO createRetiro(OperacionDTO operacionDTO) {
        try {

            ModelMapper modelMapper = new ModelMapper();

            Operacion operacion = modelMapper.map(operacionDTO, Operacion.class);
            operacionRepository.save(operacion);

            return operacionDTO;

        } catch (Exception ex) {
            ex.printStackTrace();
            throw ex;
        }
    }

    @Override
    public OperacionDTO createTranferencia(OperacionDTO operacionDTO) {
        try {

            ModelMapper modelMapper = new ModelMapper();

            Operacion operacion = modelMapper.map(operacionDTO, Operacion.class);
            operacionRepository.save(operacion);

            return operacionDTO;

        } catch (Exception ex) {
            ex.printStackTrace();
            throw ex;
        }
    }

    @Override
    public List<OperacionDTO> listarOperacion() {
        try {

            List<Operacion> operacions = operacionRepository.findAll();
            ModelMapper modelMapper = new ModelMapper();
            modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
            List<OperacionDTO> operacionDTOList = new ArrayList<>();
            for (Operacion operacion : operacions) {
                OperacionDTO operacionDTO = modelMapper.map(operacion, OperacionDTO.class);
                operacionDTOList.add(operacionDTO);
            }
            return operacionDTOList;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw ex;
        }
    }
}
