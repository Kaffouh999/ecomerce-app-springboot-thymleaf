package com.lus.dawm.eshop.model;
import jakarta.persistence.*;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

@Entity
@Data
public class Product implements Serializable{

	/**
	 * 
	 */
	@Serial
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String designation, description;
	private int qte;

	@ManyToOne
	private Categorie categorie;

	@OneToMany(mappedBy = "product")
	private List<LigneCommade> ligneCommades;


}
