package com.example.estoqueti.estoque_ti.repositoriy;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.estoqueti.estoque_ti.Models.Users;

public interface UserRepository extends JpaRepository<Users, Long>{
    
    
    Optional<Users> findByNickName(String nickName);
}
