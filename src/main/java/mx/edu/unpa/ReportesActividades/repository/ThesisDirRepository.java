package mx.edu.unpa.ReportesActividades.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mx.edu.unpa.ReportesActividades.domain.ThesisDir;

@Repository
public interface ThesisDirRepository extends JpaRepository<ThesisDir,Integer>{

}
