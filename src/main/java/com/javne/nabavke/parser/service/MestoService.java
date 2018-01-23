package com.javne.nabavke.parser.service;

import java.util.List;

import com.javne.nabavke.parser.model.Mesto;

public interface MestoService {
	Mesto findOne(Integer id);
	List<Mesto> findAll();
	Mesto save(Mesto mesto);
	void delete(Mesto mesto);
}
