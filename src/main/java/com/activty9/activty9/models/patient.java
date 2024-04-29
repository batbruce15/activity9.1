package com.activty9.activty9.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class patient {
    private int id;

    private String nom;

    private String prenom;

    private String sexe;

    private Date date_naissance;

    private String numero_telephone;

    private String adresse;
}
