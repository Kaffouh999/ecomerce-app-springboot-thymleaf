package com.lus.dawm.eshop.service;

import com.lus.dawm.eshop.model.Utilisateur;

import java.util.List;

public interface UtilisateurService {
    public Utilisateur save(Utilisateur utilisateur);
    public Utilisateur findById(Long id);
    public Utilisateur update(Long id, Utilisateur utilisateur);
    public void delete(Long id);
    public List<Utilisateur> findAll();







}
