package mx.edu.unpa.ReportesActividades.service;

import mx.edu.unpa.ReportesActividades.domain.Investigation;

public interface InvestigationService {
	public Iterable<Investigation> findAll();
	
	public Investigation save(Investigation investigacion);   

}