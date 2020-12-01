package com.ixcorp.app.bankapi.repository;

import com.ixcorp.app.bankapi.domain.Cuenta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CuentaRepository extends JpaRepository<Cuenta,Long> {
}
