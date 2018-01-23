package com.javne.nabavke.parser.service;

import java.util.List;

import com.javne.nabavke.parser.model.Delatnost;

public interface DelatnostService {
	Delatnost findOne(Integer id);
	List<Delatnost> findAll();
	Delatnost save(Delatnost delatnost);
	void delete (Delatnost delatnost);
}
