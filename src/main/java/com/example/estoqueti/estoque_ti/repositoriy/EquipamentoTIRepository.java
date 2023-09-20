package com.example.estoqueti.estoque_ti.repositoriy;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.estoqueti.estoque_ti.Models.EquipamentoTI;

@Repository
public interface EquipamentoTIRepository extends JpaRepository<EquipamentoTI, Long>{

    @Query("SELECT e FROM EquipamentoTI e WHERE e.tipo = :tipo")
    List<EquipamentoTI> findByTipo(String tipo);
}
