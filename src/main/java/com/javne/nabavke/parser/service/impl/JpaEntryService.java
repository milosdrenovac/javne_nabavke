package com.javne.nabavke.parser.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javne.nabavke.parser.model.Entry;
import com.javne.nabavke.parser.repository.EntryRepository;
import com.javne.nabavke.parser.service.EntryService;

@Service
@Transactional
public class JpaEntryService implements EntryService{
	@Autowired
	EntryRepository entryRepository;
	
	@Override
	public Entry findOne(Integer id) {
		return entryRepository.findOne(id);
	}

	@Override
	public List<Entry> findAll() {
		return (List<Entry>) entryRepository.findAll();
	}

	@Override
	public Entry save(Entry entry) {
		return entryRepository.save(entry);
	}

	@Override
	public void delete(Entry entry) {
		entryRepository.delete(entry);
	}
	
}
