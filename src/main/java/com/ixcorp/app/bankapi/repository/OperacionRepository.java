package com.ixcorp.app.bankapi.repository;

import com.ixcorp.app.bankapi.domain.Operacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OperacionRepository extends JpaRepository<Operacion,Long> {
}
