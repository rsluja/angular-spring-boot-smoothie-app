package com.example.smoothies.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SmoothieRepository extends JpaRepository<Smoothie, Long> {


}
