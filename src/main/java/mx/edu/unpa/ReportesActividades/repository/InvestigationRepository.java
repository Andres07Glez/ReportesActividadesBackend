package mx.edu.unpa.ReportesActividades.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mx.edu.unpa.ReportesActividades.domain.Investigation;

@Repository
public interface InvestigationRepository extends JpaRepository<Investigation,Integer>{

}
