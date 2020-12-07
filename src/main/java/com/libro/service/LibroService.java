package com.libro.service;

import java.util.List;

import com.libro.entity.Libro;


public interface LibroService {

	
	public List<Libro> listaLibros();
	
	public List<Libro> listaLibroPorTipo(int tipo);
}
