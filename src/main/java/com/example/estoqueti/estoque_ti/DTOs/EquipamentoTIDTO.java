package com.example.estoqueti.estoque_ti.DTOs;

public class EquipamentoTIDTO {

    private String nome;
    private String tipo;
    private int quantEmEstoque;

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

    public EquipamentoTIDTO() {

    }

}