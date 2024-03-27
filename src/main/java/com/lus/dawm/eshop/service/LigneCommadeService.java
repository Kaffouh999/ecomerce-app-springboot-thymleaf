package com.lus.dawm.eshop.service;

import com.lus.dawm.eshop.model.LigneCommade;

import java.util.List;

public interface LigneCommadeService {
    List<LigneCommade> findAll();
    LigneCommade findById(Long id);
    void delete(LigneCommade ligneCommade);
    void save(LigneCommade ligneCommade);
    void update(LigneCommade ligneCommade);

}


