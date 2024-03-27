package com.lus.dawm.eshop.serviceImpl;

import com.lus.dawm.eshop.model.Commande;
import com.lus.dawm.eshop.repository.CommandeRepository;
import com.lus.dawm.eshop.service.CommandeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommandeServiceImpl implements CommandeService {

    @Autowired
    private CommandeRepository commandeRepository;

    @Override
    public List<Commande> findAll() {
        return commandeRepository.findAll();
    }

    @Override
    public Commande findById(Long id) {
        return commandeRepository.findById(id).orElse(null);
    }

    @Override
    public Commande save(Commande commande) {
        return commandeRepository.save(commande);
    }
    @Override
    public void delete(Long id) {
        Commande commande = new Commande();
        commande.setId(id);
        commandeRepository.delete(commande);
    }
}
