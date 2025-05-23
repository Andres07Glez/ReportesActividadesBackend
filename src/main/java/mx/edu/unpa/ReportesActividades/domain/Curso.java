package mx.edu.unpa.ReportesActividades.domain;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "tbl_curso")
public class Curso implements Serializable{
	private static final long serialVersionUID = 1L;
	
	
	@Id
	private int cursoId;
	private String carrera;
	private String asignatura;
	private String semestre;
	private String cicloEscolar;
	private int horasSemana;
	private int numeroAlumnos;
	
}

