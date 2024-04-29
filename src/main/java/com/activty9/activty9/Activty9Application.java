package com.activty9.activty9;

import com.activty9.activty9.mappers.*;
import com.activty9.activty9.models.consultation;
import com.activty9.activty9.models.patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@SpringBootApplication
@RequestMapping("/patients")
public class Activty9Application {
	public static void main(String[] args) {
		SpringApplication.run(Activty9Application.class, args);
	}
	@Autowired
	patientMapper pMapper;
	@Autowired
	consultationMapper cMapper;
	@Autowired
	ligneConsultationMapper lMapper;
	@Autowired
	rendezVousMapper rMapper;
	@Autowired
	traitementMapper tMapper;

	// TODO : récupérer la liste de tous les patients puis afficher leurs noms done
	@GetMapping("/getall")
	public List<patient> getAllPatients(){
		return pMapper.getAll();
	}

	// TODO : rechercher les patients ayant le nom "Yahi" puis leurs prénoms
	@GetMapping("/nom/{nom_utilisateur}")
	public List<patient> getPatientByName(@PathVariable String nom_utilisateur) {
		return pMapper.getByName(nom_utilisateur);
	}

	// TODO : créer un nouveau patient (valeurs au choix)  PUIS enregistrer-le
	@PostMapping("/add")
	public void createPatient(@RequestBody patient pat) {
		System.out.println("test");
		pMapper.insert(pat);
	}

	// TODO : rechercher la consultation ayant id=3
	@GetMapping("/{id}")
	public consultation getConsultationByIdById(@PathVariable int id) {
		return cMapper.getById(id);
	}
}
