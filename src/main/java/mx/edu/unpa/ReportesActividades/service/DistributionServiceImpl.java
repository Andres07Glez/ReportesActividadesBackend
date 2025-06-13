package mx.edu.unpa.ReportesActividades.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

//import jakarta.transaction.Transactional;
import mx.edu.unpa.ReportesActividades.domain.Distribution;
import mx.edu.unpa.ReportesActividades.repository.DistributionRepository;

@Service 
public class DistributionServiceImpl implements DistributionService { 

    @Autowired 
    private DistributionRepository distributionRepository; 

    @Override 
    //@Transactional(readOnly=true) 
    @Transactional(readOnly=true)
    public Iterable<Distribution> findAll() {
        // TODO Auto-generated method stub
        return distributionRepository.findAll();
    }
    
    @Override 
    @Transactional(readOnly=true)
    public Optional<Distribution> findById(String id) {
        // TODO Auto-generated method stub
        return distributionRepository.findById(id);
    }

    @Override 
    @Transactional
    public Distribution save(Distribution distribution) {
        // TODO Auto-generated method stub
        return distributionRepository.save(distribution);
    }
    
    @Override
    @Transactional
    public void deleteById(String id) {
    	 // TODO Auto-generated method stub
    	distributionRepository.deleteById(id);
    }

}