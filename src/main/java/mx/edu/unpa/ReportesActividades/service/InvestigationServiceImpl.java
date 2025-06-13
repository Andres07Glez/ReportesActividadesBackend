package mx.edu.unpa.ReportesActividades.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

//import jakarta.transaction.Transactional;
import mx.edu.unpa.ReportesActividades.domain.Investigation;
import mx.edu.unpa.ReportesActividades.repository.InvestigationRepository;

@Service 
public class InvestigationServiceImpl implements InvestigationService { 

    @Autowired 
    private InvestigationRepository investigationRepository; 

    @Override 
    //@Transactional(readOnly=true) 
    @Transactional(readOnly=true)
    public Iterable<Investigation> findAll() {
        // TODO Auto-generated method stub
        return investigationRepository.findAll();
    }
    
    @Override 
    @Transactional(readOnly=true)
    public Optional<Investigation> findById(String id) {
        // TODO Auto-generated method stub
        return investigationRepository.findById(id);
    }

    @Override 
    @Transactional
    public Investigation save(Investigation investigation) {
        // TODO Auto-generated method stub
        return investigationRepository.save(investigation);
    }
    
    @Override
    @Transactional
    public void deleteById(String id) {
    	 // TODO Auto-generated method stub
    	investigationRepository.deleteById(id);
    }

}