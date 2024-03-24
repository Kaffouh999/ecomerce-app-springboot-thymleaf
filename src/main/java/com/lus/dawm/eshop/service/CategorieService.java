package com.lus.dawm.eshop.service;

import com.lus.dawm.eshop.model.Categorie;

import java.util.List;

public interface CategorieService {
    List<Categorie> getAllCategories();
    Categorie getCategorieById(Long id);
    Categorie saveCategorie(Categorie categorie);
    void deleteCategorie(Long id);
}
