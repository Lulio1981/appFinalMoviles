package com.libro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.libro.entity.TipoLibro;
import com.libro.repository.TipoLibroRepository;

@Service
public class TipoLibroServiceImpl implements TipoLibroService {

	@Autowired
	private TipoLibroRepository repository;
	
	@Override
	public List<TipoLibro> listaTipoLibro() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
