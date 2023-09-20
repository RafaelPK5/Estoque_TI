package com.example.estoqueti.estoque_ti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.estoqueti.estoque_ti.Models.EquipamentoTI;
import com.example.estoqueti.estoque_ti.repositoriy.EquipamentoTIRepository;

@Service
public class EquipamentoTIService {
    
    @Autowired
    private EquipamentoTIRepository repository;

    public List<EquipamentoTI> listarTodosEquipamentos() {
        return repository.findAll();
    }

    public List<EquipamentoTI> listarEquipamentosPorTipo(String tipo) {
        return repository.findByTipo(tipo);
    }

    public void adicionarEquipamento(EquipamentoTI equipamentoTI) {
        repository.save(equipamentoTI);
    }
}
