package com.lus.dawm.eshop.model;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serial;
import java.io.Serializable;
import java.sql.Date;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Client extends Utilisateur implements Serializable{

	/**
	 * 
	 */
	@Serial
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String email, adresse;
	private Date dateNaissance;
	@OneToMany(mappedBy = "client")
	private List<Commande> commandes;
	@Transient
	private Panier panier;


}
