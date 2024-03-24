package com.lus.dawm.eshop.model;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

@Entity
@Data
public class Categorie implements Serializable {

	/**
	 * 
	 */
	@Serial
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String designation;
	private String description;

	@OneToMany(mappedBy = "categorie")
	private List<Product> products;

	@ManyToOne
	private Categorie parentCategorie;

	@OneToMany(mappedBy = "parentCategorie")
	private List<Categorie> subCategories;


}
