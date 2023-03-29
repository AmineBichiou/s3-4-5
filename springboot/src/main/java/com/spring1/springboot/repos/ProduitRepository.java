package com.spring1.springboot.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.spring1.springboot.entities.Produit;
public interface ProduitRepository extends JpaRepository<Produit, Long> {
}