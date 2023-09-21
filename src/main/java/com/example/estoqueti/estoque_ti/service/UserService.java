package com.example.estoqueti.estoque_ti.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.estoqueti.estoque_ti.Models.Users;
import com.example.estoqueti.estoque_ti.repositoriy.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public Optional<Users> login(String Nick) {
        return repository.findByNickName(Nick);
    }

    public Users criarLogin(Users user) {
        return repository.save(user);
    }

    public boolean verificarCredenciais(String nickName, String senha) {
        Optional<Users> usuarioOptional = repository.findByNickName(nickName);
    
        if (usuarioOptional.isPresent()) {
            Users user = usuarioOptional.get();
            if (nickName.equals(user.getNickName()) && senha.equals(user.getSenha())) {
                return true;
            }
        }
        return false;
    }
    
}
