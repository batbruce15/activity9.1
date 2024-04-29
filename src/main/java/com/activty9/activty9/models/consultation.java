package com.activty9.activty9.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class consultation {
    private int id;

    private String motif;

    private Timestamp date_consultation;

    private int id_patient;
}
