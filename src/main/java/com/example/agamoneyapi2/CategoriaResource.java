package com.example.agamoneyapi2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.agamoneyapi2.repository.CategoriaRepository;

import com.example.agamoneyapi2.model.Categoria;

import java.util.List;

@RestController
@RequestMapping("/categorias")
public class CategoriaResource {
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	

	public List<Categoria> listar() {
		return categoriaRepository.findAll();
	}
}
