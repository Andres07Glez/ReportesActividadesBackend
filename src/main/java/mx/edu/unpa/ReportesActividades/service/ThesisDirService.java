package mx.edu.unpa.ReportesActividades.service;

import java.util.Optional;

import mx.edu.unpa.ReportesActividades.domain.ThesisDir;

public interface ThesisDirService {
	public Iterable<ThesisDir> findAll();
	//public Page<Teacher> findAll(Pageable pageable);
	public Optional<ThesisDir> findById(int id);
	public ThesisDir save(ThesisDir thesis);
	public void deleteById(int id);
}
