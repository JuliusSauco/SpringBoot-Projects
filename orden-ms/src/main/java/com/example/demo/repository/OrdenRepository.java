package com.example.demo.repository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entidad.Orden;
import com.example.demo.util.CustomRepository;

@Repository
public interface OrdenRepository extends CustomRepository<Orden, Long> {
	
	List<Orden> findByFecha(Date fecha);
	
	@Query( "SELECT o FROM Orden o where fechaEnvio >= ?1")
	List<Orden> despuesDeUnaFecha(Date fecha);

}
