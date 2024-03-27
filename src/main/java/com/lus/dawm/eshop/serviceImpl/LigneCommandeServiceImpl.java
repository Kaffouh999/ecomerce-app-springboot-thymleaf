package com.lus.dawm.eshop.serviceImpl;

import com.lus.dawm.eshop.model.LigneCommade;
import com.lus.dawm.eshop.repository.LigneCommadeRepository;
import com.lus.dawm.eshop.service.LigneCommadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LigneCommandeServiceImpl implements LigneCommadeService {

    @Autowired
    private LigneCommadeRepository ligneCommandeRepository;

    @Override
    public List<LigneCommade> findAll() {
        return ligneCommandeRepository.findAll();
    }

    @Override
    public LigneCommade findById(Long id) {
        return ligneCommandeRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(LigneCommade ligneCommade) {
        ligneCommandeRepository.delete(ligneCommade);
    }

    @Override
    public void save(LigneCommade ligneCommade) {
        ligneCommandeRepository.save(ligneCommade);
    }

    @Override
    public void update(LigneCommade ligneCommade) {
        ligneCommandeRepository.save(ligneCommade);
    }
}
