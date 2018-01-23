
package com.javne.nabavke.parser.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javne.nabavke.parser.model.VrstaPostupka;
import com.javne.nabavke.parser.repository.VrstaPostupkaRepository;
import com.javne.nabavke.parser.service.VrstaPostupkaService;

@Service
@Transactional
public class JpaVrstaPostupkaService implements VrstaPostupkaService {
	
	@Autowired
	VrstaPostupkaRepository vrstaPostupkaRepository;
	
	@Override
	public VrstaPostupka findOne(Integer id) {
		return vrstaPostupkaRepository.findOne(id);
	}

	@Override
	public List<VrstaPostupka> findAll() {
		return (List<VrstaPostupka>) vrstaPostupkaRepository.findAll();
	}

	@Override
	public VrstaPostupka save(VrstaPostupka vrstaPostupka) {
		return vrstaPostupkaRepository.save(vrstaPostupka);
	}

	@Override
	public void delete(VrstaPostupka vrstaPostupka) {
		vrstaPostupkaRepository.delete(vrstaPostupka);
	}

}
