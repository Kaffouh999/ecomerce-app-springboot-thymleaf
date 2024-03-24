package com.lus.dawm.eshop.model;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

@Data
public class Utilisateur implements Serializable {

	/**
	 * 
	 */
	@Serial
	private static final long serialVersionUID = 1L;

	protected Long id;
	protected String nom, prenom, username, pwd;


}
