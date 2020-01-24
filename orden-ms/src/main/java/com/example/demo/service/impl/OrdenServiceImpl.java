package com.example.demo.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entidad.Orden;
import com.example.demo.repository.OrdenRepository;
import com.example.demo.service.OrdenService;

@Service
public class OrdenServiceImpl implements OrdenService {

	@Autowired
	private OrdenRepository ordenRepository;

	@Override
	public Orden guardar(Orden orden) {
		return ordenRepository.save(orden);
	}

	@Override
	public Iterable<Orden> listarOrdenesPorFecha(Date fechaEnvio) {
		// TODO Auto-generated method stub
		return ordenRepository.despuesDeUnaFecha(fechaEnvio);
	}

}
