package com.javne.nabavke.parser.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javne.nabavke.parser.model.KategorijaNarucioca;
import com.javne.nabavke.parser.repository.KategorijaNaruciocaRepository;
import com.javne.nabavke.parser.service.KategorijaNaruciocaService;

@Service
@Transactional
public class JpaKategorijaNaruciocaService implements KategorijaNaruciocaService{
	@Autowired
	KategorijaNaruciocaRepository kategorijaNaruciocaRepository;
	
	@Override
	public KategorijaNarucioca findOne(Integer id) {
		return kategorijaNaruciocaRepository.findOne(id);
	}

	@Override
	public List<KategorijaNarucioca> findAll() {
		return (List<KategorijaNarucioca>) kategorijaNaruciocaRepository.findAll();
	}

	@Override
	public KategorijaNarucioca save(KategorijaNarucioca kateogrijaNamrucioca) {
		return kategorijaNaruciocaRepository.save(kateogrijaNamrucioca);
	}

	@Override
	public void delete(KategorijaNarucioca kateogrijaNamrucioca) {
		kategorijaNaruciocaRepository.delete(kateogrijaNamrucioca);
	}

}
