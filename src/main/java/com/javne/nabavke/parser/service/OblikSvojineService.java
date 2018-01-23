package com.javne.nabavke.parser.service;

import java.util.List;

import com.javne.nabavke.parser.model.OblikSvojine;

public interface OblikSvojineService {
	OblikSvojine findOne(Integer id);
	List<OblikSvojine> findAll();
	OblikSvojine save(OblikSvojine oblikSvojine);
	void delete(OblikSvojine obliSvojine);
}
