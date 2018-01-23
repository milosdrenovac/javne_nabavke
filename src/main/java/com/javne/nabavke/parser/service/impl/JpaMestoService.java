package com.javne.nabavke.parser.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javne.nabavke.parser.model.Mesto;
import com.javne.nabavke.parser.repository.MestoRepository;
import com.javne.nabavke.parser.service.MestoService;

@Service
@Transactional
public class JpaMestoService implements MestoService {
	
	@Autowired
	MestoRepository mestoRepository;
	
	@Override
	public Mesto findOne(Integer id) {
		return mestoRepository.findOne(id);
	}

	@Override
	public List<Mesto> findAll() {
		return (List<Mesto>) mestoRepository.findAll();
	}

	@Override
	public Mesto save(Mesto mesto) {
		return mestoRepository.save(mesto);
	}

	@Override
	public void delete(Mesto mesto) {
		mestoRepository.delete(mesto);
	}

}
