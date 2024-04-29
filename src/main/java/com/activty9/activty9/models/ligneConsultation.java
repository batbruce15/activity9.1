package com.activty9.activty9.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class ligneConsultation {
    private int id;
    private int id_consultation;
    private int id_traitement;
    private String posologie;
    private String unite_temps;
    private String quantite;
}
