package com.example.smoothies.repository;

import com.example.smoothies.model.ERole;
import com.example.smoothies.model.RoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<RoleEntity, Long> {

    Optional<RoleEntity> findByName(ERole name);
}
