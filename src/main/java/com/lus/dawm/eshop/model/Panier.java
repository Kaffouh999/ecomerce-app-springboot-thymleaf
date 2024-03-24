package com.lus.dawm.eshop.model;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.sql.Date;
import java.util.List;

@Data
public class Panier implements Serializable{

	/**
	 * 
	 */
	@Serial
	private static final long serialVersionUID = 1L;

	private Date dateCreation;

	private Client client;

	private List<LigneCommade> ligneCommades;


}
