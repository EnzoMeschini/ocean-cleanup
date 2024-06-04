package com.ocean.cleanup.repository;

import com.ocean.cleanup.model.Lixo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LixoRepository extends JpaRepository<Lixo, Long> {
}
