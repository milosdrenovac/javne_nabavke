package com.javne.nabavke.parser.service;

import java.util.List;

import com.javne.nabavke.parser.model.Opstina;

public interface OpstinaService {
	Opstina findOne(Integer id);
	List<Opstina> findAll();
	Opstina save(Opstina opstina);
	void delete(Opstina opstina);
}
