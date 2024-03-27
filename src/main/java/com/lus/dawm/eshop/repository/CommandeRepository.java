package com.lus.dawm.eshop.repository;

import com.lus.dawm.eshop.model.Commande;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommandeRepository extends JpaRepository<Commande,Long> {
}
