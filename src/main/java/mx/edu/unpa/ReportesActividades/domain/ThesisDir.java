package mx.edu.unpa.ReportesActividades.domain;

import java.io.Serializable;
import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="tbl_Thesis_Direction")
public class ThesisDir implements Serializable{/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String titulo;
	private String nombreEstudiante;
	private char gradoObtener;
	private int porcAvance;
	private LocalDate fechaRegistro;
	private LocalDate fechaTerminacion;
	private LocalDate fechaReproTerminacion;
	

}
