package com.lus.dawm.eshop.service;

import com.lus.dawm.eshop.model.Commande;

import java.util.List;

public interface CommandeService {
    public List<Commande> findAll();

    public Commande findById(Long id);

    public Commande save(Commande commande);

    public void delete(Long id);

}
