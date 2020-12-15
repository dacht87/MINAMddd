package com.ixcorp.app.bankapi.infrastructure.repository;

import com.ixcorp.app.bankapi.domain.entities.Cuenta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CuentaRepository extends JpaRepository<Cuenta,Long> {
}
