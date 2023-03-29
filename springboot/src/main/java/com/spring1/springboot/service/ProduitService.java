package com.spring1.springboot.service;
import org.springframework.data.domain.Page;

import java.util.List;

import com.spring1.springboot.entities.Produit;
public interface ProduitService {
    Produit saveProduit(Produit p);
    Produit updateProduit(Produit p);
    void deleteProduit(Produit p);
    void deleteProduitById(Long id);
    Produit getProduit(Long id);
    List<Produit> getAllProduits();
    Page<Produit> getAllProduitsParPage(int page, int size);
}
