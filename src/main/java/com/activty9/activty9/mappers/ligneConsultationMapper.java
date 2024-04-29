package com.activty9.activty9.mappers;

import com.activty9.activty9.models.ligneConsultation;
import com.activty9.activty9.models.patient;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ligneConsultationMapper {
    List<ligneConsultation> getAll();
    patient getById(int id);

    List<ligneConsultation> getByName(String nom_utilisateur);

    void insert(ligneConsultation lcon);
}
