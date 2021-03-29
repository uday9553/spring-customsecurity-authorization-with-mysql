package com.uday.config.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uday.config.security.model.Users;

import java.util.Optional;

public interface UsersRepository extends JpaRepository<Users, Integer> {
    Optional<Users> findByName(String username);
}
