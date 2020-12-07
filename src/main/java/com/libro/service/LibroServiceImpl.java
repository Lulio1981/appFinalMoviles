package com.libro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.libro.entity.Libro;
import com.libro.repository.LibroRepository;

@Service
public class LibroServiceImpl implements LibroService {

	@Autowired
	private LibroRepository repository;
	
	@Override
	public List<Libro> listaLibros() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public List<Libro> listaLibroPorTipo(int tipo) {
		// TODO Auto-generated method stub
		return repository.listaPorNombre(tipo);
	}

}
