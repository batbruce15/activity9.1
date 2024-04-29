package com.activty9.activty9.mappers;

import com.activty9.activty9.models.patient;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface patientMapper {
    List<patient> getAll();
    patient getById(int id);

    List<patient> getByName(String nom_utilisateur);

    void insert(patient pat);
}
