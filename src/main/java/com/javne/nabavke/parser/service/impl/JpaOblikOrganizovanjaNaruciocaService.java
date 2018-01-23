package com.javne.nabavke.parser.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javne.nabavke.parser.model.OblikOrganizovanjaNarucioca;
import com.javne.nabavke.parser.repository.OblikOrganizovanjaNaruciocaRepository;
import com.javne.nabavke.parser.service.OblikOrganizovanjaNaruciocaService;

@Service
@Transactional
public class JpaOblikOrganizovanjaNaruciocaService implements
		OblikOrganizovanjaNaruciocaService {
	@Autowired
	OblikOrganizovanjaNaruciocaRepository oblikOrgNarRepo;
	
	@Override
	public OblikOrganizovanjaNarucioca findOne(Integer id) {
		return oblikOrgNarRepo.findOne(id);
	}

	@Override
	public List<OblikOrganizovanjaNarucioca> findAll() {
		return (List<OblikOrganizovanjaNarucioca>) oblikOrgNarRepo.findAll();
	}

	@Override
	public OblikOrganizovanjaNarucioca save(
			OblikOrganizovanjaNarucioca oblikOrganizovanjaNarucioca) {
		return oblikOrgNarRepo.save(oblikOrganizovanjaNarucioca);
	}

	@Override
	public void delete(OblikOrganizovanjaNarucioca oblikOrganizovanjaNarucioca) {
		oblikOrgNarRepo.delete(oblikOrganizovanjaNarucioca);
	}

}
