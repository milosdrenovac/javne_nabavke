package com.javne.nabavke.parser.service;

import java.util.List;
import com.javne.nabavke.parser.model.KategorijaNarucioca;

public interface KategorijaNaruciocaService {
	KategorijaNarucioca findOne(Integer id);
	List<KategorijaNarucioca> findAll();
	KategorijaNarucioca save(KategorijaNarucioca kateogrijaNamrucioca);
	void delete(KategorijaNarucioca kateogrijaNamrucioca);
}
