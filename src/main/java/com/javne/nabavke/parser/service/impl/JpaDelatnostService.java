package com.javne.nabavke.parser.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javne.nabavke.parser.model.Delatnost;
import com.javne.nabavke.parser.repository.DelatnostRepository;
import com.javne.nabavke.parser.service.DelatnostService;

@Service
@Transactional
public class JpaDelatnostService implements DelatnostService {
	
	@Autowired
	DelatnostRepository delatnostRepository;
	
	@Override
	public Delatnost findOne(Integer id) {
		return delatnostRepository.findOne(id);
	}

	@Override
	public List<Delatnost> findAll() {
		return (List<Delatnost>) delatnostRepository.findAll();
	}

	@Override
	public Delatnost save(Delatnost delatnost) {
		return delatnostRepository.save(delatnost);
	}

	@Override
	public void delete(Delatnost delatnost) {
		delatnostRepository.delete(delatnost);
	}

}
