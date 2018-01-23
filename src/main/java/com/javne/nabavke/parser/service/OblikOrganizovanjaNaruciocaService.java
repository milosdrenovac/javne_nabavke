package com.javne.nabavke.parser.service;

import java.util.List;

import com.javne.nabavke.parser.model.OblikOrganizovanjaNarucioca;;

public interface OblikOrganizovanjaNaruciocaService {
	OblikOrganizovanjaNarucioca findOne(Integer id);
	List<OblikOrganizovanjaNarucioca> findAll();
	OblikOrganizovanjaNarucioca save(OblikOrganizovanjaNarucioca oblikOrganizovanjaNarucioca);
	void delete(OblikOrganizovanjaNarucioca oblikOrganizovanjaNarucioca);
	
}
