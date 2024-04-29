package com.activty9.activty9.mappers;

import com.activty9.activty9.models.patient;
import com.activty9.activty9.models.rendezVous;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface rendezVousMapper {
    List<rendezVous> getAll();
    rendezVous getById(int id);

    List<rendezVous> getByName(String nom_utilisateur);

    void insert(rendezVous rdv);
}
