package com.lus.dawm.eshop.repository;


import com.lus.dawm.eshop.model.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategorieRepository extends JpaRepository<Categorie, Long> {
}
