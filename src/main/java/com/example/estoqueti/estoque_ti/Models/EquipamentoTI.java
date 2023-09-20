package com.example.estoqueti.estoque_ti.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "equip_ti")
public class EquipamentoTI {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String tipo;
    private int quantEmEstoque;

    public EquipamentoTI(String nome, String tipo, int quantEmEstoque) {
        this.nome = nome;
        this.tipo = tipo;
        this.quantEmEstoque = quantEmEstoque;
    }

    public EquipamentoTI() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getQuantEmEstoque() {
        return quantEmEstoque;
    }

    public void setQuantEmEstoque(int quantEmEstoque) {
        this.quantEmEstoque = quantEmEstoque;
    }

}
