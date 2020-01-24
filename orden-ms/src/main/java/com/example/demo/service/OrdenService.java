package com.example.demo.service;

import java.util.Date;

import com.example.demo.entidad.Orden;

public interface OrdenService {
	public Orden guardar(Orden orden);

	public Iterable<Orden> listarOrdenesPorFecha(Date fechaEnvio);
}
