package mx.edu.unpa.ReportesActividades.service;

import mx.edu.unpa.ReportesActividades.domain.Distribution;

public interface DistributionService {
	public Iterable<Distribution> findAll();
	
	public Distribution save(Distribution distribution);   

}