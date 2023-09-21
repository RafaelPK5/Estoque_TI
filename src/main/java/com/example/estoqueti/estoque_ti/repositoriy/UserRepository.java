package com.example.estoqueti.estoque_ti.repositoriy;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.estoqueti.estoque_ti.Models.Users;

public interface UserRepository extends JpaRepository<Users, Long>{
    
    @Query("SELECT u FROM Users u WHERE u.nickName = :nickName")
    Optional<Users> findByNickName(@Param("nickName") String nickName);
}
