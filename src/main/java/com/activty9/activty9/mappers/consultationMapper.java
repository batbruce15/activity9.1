package com.activty9.activty9.mappers;

import com.activty9.activty9.models.consultation;
import com.activty9.activty9.models.patient;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface consultationMapper {
    List<consultation> getAll();
    consultation getById(int id);

    List<consultation> getByName(String nom_utilisateur);

    void insert(consultation con);
}
