package com.ixcorp.app.bankapi.application.serviceImpl;

import com.ixcorp.app.bankapi.application.service.OperacionService;
import com.ixcorp.app.bankapi.domain.entities.Operacion;
import com.ixcorp.app.bankapi.application.DTO.OperacionDTO;
import com.ixcorp.app.bankapi.infrastructure.repository.OperacionRepository;
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
