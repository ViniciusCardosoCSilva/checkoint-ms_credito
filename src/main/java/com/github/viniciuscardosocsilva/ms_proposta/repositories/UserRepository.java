package com.github.viniciuscardosocsilva.ms_proposta.repositories;

import com.github.viniciuscardosocsilva.ms_proposta.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
