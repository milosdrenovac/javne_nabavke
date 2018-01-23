package com.javne.nabavke.parser.service;

import java.util.List;

import com.javne.nabavke.parser.model.Entry;


public interface EntryService {
	Entry findOne(Integer id);
	List<Entry> findAll();
	Entry save(Entry entry);
	void delete(Entry entry);
}
