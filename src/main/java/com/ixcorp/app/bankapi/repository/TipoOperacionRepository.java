package com.ixcorp.app.bankapi.repository;

import com.ixcorp.app.bankapi.domain.TipoOperacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoOperacionRepository extends JpaRepository<TipoOperacion,Long> {

}
