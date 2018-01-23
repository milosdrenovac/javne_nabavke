package com.javne.nabavke.parser.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javne.nabavke.parser.model.Opstina;
import com.javne.nabavke.parser.repository.OpstinaRepository;
import com.javne.nabavke.parser.service.OpstinaService;

@Service
@Transactional
public class JpaOpstinaService implements OpstinaService {
	
	@Autowired
	OpstinaRepository opstinaRepository;
	
	@Override
	public Opstina findOne(Integer id) {
		return opstinaRepository.findOne(id);
	}

	@Override
	public List<Opstina> findAll() {
		return (List<Opstina>) opstinaRepository.findAll();
	}

	@Override
	public Opstina save(Opstina opstina) {
		return opstinaRepository.save(opstina);
	}

	@Override
	public void delete(Opstina opstina) {
		opstinaRepository.delete(opstina);
	}

}
