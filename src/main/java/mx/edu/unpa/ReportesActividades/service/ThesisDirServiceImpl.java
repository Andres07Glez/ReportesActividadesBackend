package mx.edu.unpa.ReportesActividades.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mx.edu.unpa.ReportesActividades.domain.ThesisDir;
import mx.edu.unpa.ReportesActividades.repository.ThesisDirRepository;

@Service
public class ThesisDirServiceImpl implements ThesisDirService{
	@Autowired
	private ThesisDirRepository thesisDirRepository;

	
	@Override
	@Transactional(readOnly=true)
	public Iterable<ThesisDir> findAll() {
		// TODO Auto-generated method stub
		return this.thesisDirRepository.findAll();
	}

	@Override
	@Transactional(readOnly=true)
	public Optional<ThesisDir> findById(int id) {
		// TODO Auto-generated method stub
		return this.thesisDirRepository.findById(id);
	}

	@Override
	@Transactional
	public ThesisDir save(ThesisDir thesis) {
		// TODO Auto-generated method stub
		return this.thesisDirRepository.save(thesis);
	}

	@Override
	@Transactional
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		this.thesisDirRepository.deleteById(id);
		
	}

}
