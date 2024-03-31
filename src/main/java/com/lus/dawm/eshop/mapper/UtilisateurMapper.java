package com.lus.dawm.eshop.mapper;

import com.lus.dawm.eshop.dto.UserDTO;
import com.lus.dawm.eshop.model.Utilisateur;

public class UtilisateurMapper {

    public static UserDTO toUtilisateurDto(Utilisateur utilisateur) {
        return UserDTO.builder()
                .id(utilisateur.getId())
                .nom(utilisateur.getNom())
                .prenom(utilisateur.getPrenom())
                .build();
    }

    public static Utilisateur toUtilisateur(UserDTO utilisateurDto) {
        return Utilisateur.builder()
                .id(utilisateurDto.getId())
                .nom(utilisateurDto.getNom())
                .prenom(utilisateurDto.getPrenom())
                .build();
    }
}
