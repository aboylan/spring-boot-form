package com.bolsadeideas.springboot.form.app.services;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bolsadeideas.springboot.form.app.models.domain.Pais;

@Service
public class PaisServicerImpl implements PaisService {

	private List<Pais> lista;

	public PaisServicerImpl() {
		this.lista = Arrays.asList(new Pais(1, "ES", "Espana"), new Pais(2, "MX", "Mexico"), new Pais(3, "CL", "Chile"),
				new Pais(4, "AR", "Argentina"), new Pais(5, "PE", "Peru"), new Pais(6, "CO", "Colombia"),
				new Pais(7, "VE", "Venezuela"));
	}

	@Override
	public List<Pais> listar() {
		return lista;
	}

	@Override
	public Pais oibtenerPorid(Integer id) {
		Pais resultado = null;
		for (Pais pais : lista) {
			if (id == pais.getId()) {
				resultado = pais;
				break;
			}
		}
		return resultado;
	}

}
