package com.example.estoqueti.estoque_ti.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.estoqueti.estoque_ti.DTOs.LoginDTO;
import com.example.estoqueti.estoque_ti.DTOs.UserDTO;
import com.example.estoqueti.estoque_ti.Models.Users;
import com.example.estoqueti.estoque_ti.service.UserService;

@RestController
@RequestMapping("/TI")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/cadastro")
    public ResponseEntity<Users> cadastrarUser(@RequestBody UserDTO DTO){
        Users usuario = new Users();
        usuario.setNickName(DTO.getNickName());
        usuario.setNome(DTO.getNome());
        usuario.setEmail(DTO.getEmail());
        usuario.setSenha(DTO.getSenha());
        userService.criarLogin(usuario);
        return ResponseEntity.status(200).body(usuario);
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody LoginDTO login){
        boolean valid = userService.verificarCredenciais(login.getNickName(), login.getSenha());
        if(!valid){
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Usuário ou senha Incorreta! Tente novamente!");
        }
        return ResponseEntity.status(HttpStatus.OK).body("Acesso autorizado!");
    }
}
