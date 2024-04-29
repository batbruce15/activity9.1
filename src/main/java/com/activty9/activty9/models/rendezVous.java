package com.activty9.activty9.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
@AllArgsConstructor
@Data
@NoArgsConstructor
public class rendezVous {
    private int id;
    private Timestamp dateRdv;
    private int id_patient;
}
