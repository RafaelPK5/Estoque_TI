package com.example.estoqueti.estoque_ti.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.estoqueti.estoque_ti.DTOs.EquipamentoTIDTO;
import com.example.estoqueti.estoque_ti.Models.EquipamentoTI;
import com.example.estoqueti.estoque_ti.service.EquipamentoTIService;

@RestController
@RequestMapping("/TI/equip")
public class EquipamentoTIController {

    @Autowired
    private EquipamentoTIService equipTIService;

    @GetMapping("/todos")
    public List<EquipamentoTI> listarTodosEquipamentos() {
        return equipTIService.listarTodosEquipamentos();
    }

    @GetMapping("/{tipo}")
    public List<EquipamentoTI> listarEquipamentosPorTipo(@PathVariable String tipo) {
        return equipTIService.listarEquipamentosPorTipo(tipo);
    }

    @PostMapping("/adicionar")
    public void adicionarEquipamento(@RequestBody EquipamentoTIDTO equipamentoTI) {
        EquipamentoTI equipTI = new EquipamentoTI();
        equipTI.setNome(equipamentoTI.getNome());
        equipTI.setTipo(equipamentoTI.getTipo());
        equipTI.setQuantEmEstoque(equipamentoTI.getQuantEmEstoque());
        equipTIService.adicionarEquipamento(equipTI);
    }
}