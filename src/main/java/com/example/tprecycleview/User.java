package com.example.tprecycleview;

import java.util.Date;

public class User {
    private int idEtudiant;
    private String nomEt;
    private String prenomEt;
    private int cin;
    private String ecole;
    private Date dateNaissance;

    public int getIdEtudiant() {
        return idEtudiant;
    }

    public String getNomEt() {
        return nomEt;
    }

    public String getPrenomEt() {
        return prenomEt;
    }

    public int getCin() {
        return cin;
    }

    public String getEcole() {
        return ecole;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    @Override
    public String toString() {
        return "User{" +
                "idEtudiant=" + idEtudiant +
                ", nomEt='" + nomEt + '\'' +
                ", prenomEt='" + prenomEt + '\'' +
                ", cin=" + cin +
                ", ecole='" + ecole + '\'' +
                ", dateNaissance=" + dateNaissance +
                '}';
    }
}
