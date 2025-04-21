package mx.edu.unpa.ReportesActividades.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mx.edu.unpa.ReportesActividades.domain.Curso;
import mx.edu.unpa.ReportesActividades.repository.CursoRepository;


@Service
public class CursoServiceImpl implements CursoService{
	
	@Autowired
	private CursoRepository cursoRepository;

	@Override
	public Iterable<Curso> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Curso save(Curso student) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
