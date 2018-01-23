package com.javne.nabavke.parser.service;

import java.util.List;

import com.javne.nabavke.parser.model.VrstaPostupka;

public interface VrstaPostupkaService {
	VrstaPostupka findOne(Integer id);
	List<VrstaPostupka> findAll();
	VrstaPostupka save(VrstaPostupka vrstaPostupka);
	void delete(VrstaPostupka vrstaPostupka);
}
