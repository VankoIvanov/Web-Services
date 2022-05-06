package com.example.webservices.repository;

import com.example.webservices.model.entity.RoleEntity;
import com.example.webservices.model.entity.RoleNameEnum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<RoleEntity, Long> {
Optional<RoleEntity>findByRole(RoleNameEnum name);
}
