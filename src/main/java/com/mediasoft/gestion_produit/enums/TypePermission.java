package com.mediasoft.gestion_produit.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum TypePermission {

    ADMINISTRATEUR_CREATE,
    ADMINISTRATEUR_READ,
    ADMINISTRATEUR_UPDATE,
    ADMINISTRATEUR_DELETE,
    ADMINISTRATEUR_CREATE_DONNEE_DE_BASE,
    ADMINISTRATEUR_DELETE_DONNEE_DE_BASE,


    MANAGER_CREATE,
    MANAGER_READ,
    MANAGER_UPDATE,
    MANAGER_CREATE_UTILISATEUR,
    MANAGER_DELETE_UTILISATEUR,

    UTILISATEUR_CREATE,
    UTILISATEUR_READ,
    UTILISATEUR_UPDATE,
    UTILISATEUR_DELETE;

    private String libelle;


}