package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.entity.Empresa;
import com.example.demo.util.CustomRepository;

@Repository
public interface EmpresaRepository extends CustomRepository<Empresa, Long>{
	
}
