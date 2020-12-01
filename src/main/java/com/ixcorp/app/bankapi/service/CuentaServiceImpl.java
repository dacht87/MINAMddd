package com.ixcorp.app.bankapi.service;

import com.ixcorp.app.bankapi.domain.Cuenta;
import com.ixcorp.app.bankapi.dto.CuentaDTO;
import com.ixcorp.app.bankapi.repository.CuentaRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CuentaServiceImpl implements  CuentaService {

    @Autowired
    private CuentaRepository cuentaRepository;

    @Override
    public CuentaDTO createCuenta(CuentaDTO cuentaDTO) {

        try {

            ModelMapper modelMapper = new ModelMapper();

            Cuenta cuenta = modelMapper.map(cuentaDTO, Cuenta.class);
            cuentaRepository.save(cuenta);

            return cuentaDTO;

        } catch (Exception ex) {
            ex.printStackTrace();
            throw ex;
        }
    }

    @Override
    public CuentaDTO updateCuenta(CuentaDTO cuentaDTO) {

        try {

            ModelMapper modelMapper = new ModelMapper();

            Cuenta cuenta = modelMapper.map(cuentaDTO, Cuenta.class);
            cuentaRepository.save(cuenta);

            return cuentaDTO;

        } catch (Exception ex) {
            ex.printStackTrace();
            throw ex;
        }
    }

    @Override
    public CuentaDTO getCuentaId(Long id) {
        try {

            ModelMapper modelMapper = new ModelMapper();

            Optional<Cuenta> cuenta = cuentaRepository.findById(id);

            CuentaDTO cuentaDTO = modelMapper.map(cuenta.get(), CuentaDTO.class);
            return cuentaDTO;

        } catch (Exception ex) {
            ex.printStackTrace();
            throw ex;
        }
    }

    @Override
    public List<CuentaDTO> listarCuenta() {

        try {

            List<Cuenta> cuentas = cuentaRepository.findAll();
            ModelMapper modelMapper = new ModelMapper();
            List<CuentaDTO> cuentaDTOList = new ArrayList<>();
            for (Cuenta cuenta : cuentas) {
                CuentaDTO cuentaDTO = modelMapper.map(cuenta, CuentaDTO.class);
                cuentaDTOList.add(cuentaDTO);
            }
            return cuentaDTOList;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw ex;
        }
    }
}
