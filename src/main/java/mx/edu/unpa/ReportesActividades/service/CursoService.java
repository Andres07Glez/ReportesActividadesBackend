package mx.edu.unpa.ReportesActividades.service;

import mx.edu.unpa.ReportesActividades.domain.Curso;

public interface CursoService {
	public Iterable<Curso> findAll();
	
	public Curso save(Curso curso);   

}