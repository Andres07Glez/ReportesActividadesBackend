package mx.edu.unpa.ReportesActividades.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.edu.unpa.ReportesActividades.repository.DevOpsRepository;

@Service
public class DevOpsImpl implements DevOpsService{

	@Autowired
	private DevOpsRepository devOpsReposistory;
	
}
