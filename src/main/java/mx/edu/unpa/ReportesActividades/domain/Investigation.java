package mx.edu.unpa.ReportesActividades.domain;

import java.io.Serializable;
import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "tbl_investigacion")
public class Investigation implements Serializable{
	private static final long serialVersionUID = 1L;
	
	
	@Id
	
	private int investigacion_Id;
	private String titulo;
	private char responsabilidad;
	private String fase_aprobacion;
	private int instancia_principal;
	private LocalDate fecha_inicio;
	private LocalDate fecha_terminacion;
	private LocalDate fecha_terminacionReprogramada;
	private int porcentaje_avanceGlobal;
	
	
}