package com.javne.nabavke.parser.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javne.nabavke.parser.model.OblikSvojine;
import com.javne.nabavke.parser.repository.OblikSvojineRepository;
import com.javne.nabavke.parser.service.OblikSvojineService;

@Service
@Transactional
public class JpaOblikSvojineService implements OblikSvojineService {
	@Autowired
	OblikSvojineRepository oblikSvojineRepository;
	
	@Override
	public OblikSvojine findOne(Integer id) {
		return oblikSvojineRepository.findOne(id);
	}

	@Override
	public List<OblikSvojine> findAll() {
		return (List<OblikSvojine>) oblikSvojineRepository.findAll();
	}

	@Override
	public OblikSvojine save(OblikSvojine oblikSvojine) {
		return oblikSvojineRepository.save(oblikSvojine);
	}

	@Override
	public void delete(OblikSvojine obliSvojine) {
		oblikSvojineRepository.delete(obliSvojine);
	}

}
