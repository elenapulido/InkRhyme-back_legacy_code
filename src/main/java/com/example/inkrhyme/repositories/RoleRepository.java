package com.example.inkrhyme.repositories;

import com.example.inkrhyme.model.ERole;
import com.example.inkrhyme.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
