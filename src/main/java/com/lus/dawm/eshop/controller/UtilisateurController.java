package com.lus.dawm.eshop.controller;

import com.lus.dawm.eshop.dto.UserDTO;
import com.lus.dawm.eshop.mapper.UtilisateurMapper;
import com.lus.dawm.eshop.model.Utilisateur;
import com.lus.dawm.eshop.service.UtilisateurService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/utilisateurs")
public class UtilisateurController {

    private final UtilisateurService utilisateurService;


    @GetMapping
    public List<UserDTO> getUtilisateurs() {
        return utilisateurService.findAll()
                .stream()
                .map(UtilisateurMapper::toUtilisateurDto)
                .toList();
    }

    @GetMapping("/{id}")
    public UserDTO getUtilisateur(@PathVariable Long id) {
        return UtilisateurMapper
                .toUtilisateurDto(utilisateurService.findById(id));
    }

    @DeleteMapping("/{id}")
    public void deleteUtilisateur(@PathVariable Long id) {
        utilisateurService.delete(id);
    }

    @PostMapping
    public UserDTO createUtilisateur(Utilisateur utilisateur) {
        return UtilisateurMapper
                .toUtilisateurDto(utilisateurService.save(utilisateur));
    }

    @PutMapping("/{id}")
    public UserDTO updateUtilisateur(@PathVariable Long id, Utilisateur utilisateur) {
        return UtilisateurMapper
                .toUtilisateurDto(utilisateurService.update(id, utilisateur));
    }

}
