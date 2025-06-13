package mx.edu.unpa.ReportesActividades.domain;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "tbl_distribution")
public class Distribution implements Serializable{
	private static final long serialVersionUID = 1L;
	
	
	@Id
	
private int actividad_id; // Identificador único
private String actividad_nombre; // Nombre de la actividad académica
private int horas_ciclo_oct_feb; // Horas dedicadas en el ciclo Octubre-Febrero
private int horas_ciclo_mar_jul; // Horas dedicadas en el ciclo Marzo-Julio
private int horas_verano; // Horas dedicadas en Verano (Julio-Septiembre)

}
