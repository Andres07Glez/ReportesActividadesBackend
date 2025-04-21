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
	@Column(name = "curso_Id")
	private int cursoId;
	private String asignatura;
	private String carrera;
	private String semestre;
	@Column(name = "ciclo_Escolar")
	private String cicloEscolar;
	@Column(name = "horas_Semana")
	private int horasSemana;
	@Column(name = "numero_Alumnos")
	private int numeroAlumnos;
	
	
}

