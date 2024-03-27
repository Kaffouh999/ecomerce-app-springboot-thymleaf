package com.lus.dawm.eshop.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;
import java.sql.Date;
import java.util.List;


@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Commande implements Serializable {

	/**
	 * 
	 */
	@Serial
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Date dateCreation, dateLivraison;
	private String adresseLivraison;
	@ManyToOne
	private Client client;
	@OneToMany(mappedBy = "commande")
	private List<LigneCommade> ligneCommades;


}
