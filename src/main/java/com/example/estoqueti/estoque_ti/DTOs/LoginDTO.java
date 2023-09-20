package com.example.estoqueti.estoque_ti.DTOs;

public class LoginDTO {
    
    private String nickName;
    private String senha;
    public LoginDTO() {
    }
    public String getNickName() {
        return nickName;
    }
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }

    
}
