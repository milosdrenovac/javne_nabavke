package com.javne.nabavke.parser.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.javne.nabavke.parser.model.Mesto;
import com.javne.nabavke.parser.service.MestoService;
import com.javne.nabavke.parser.service.parsedata.ParseEntry;

@RestController
@RequestMapping(value = "api/mesto")
public class MestoController {
	
	@Autowired
	MestoService mestoService;
	
	@Autowired
	ParseEntry parse;
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Mesto>> getMesta() throws IOException {
		
		List<Mesto> parseMesta = parse.parseMesta("http://portal.ujn.gov.rs/OpenD/Mesto_UJN_2015.csv");
		List<Mesto> mestaUBazi = mestoService.findAll();
		
		if (parseMesta.removeAll(mestaUBazi)){
			for (Mesto mesto : parseMesta) {
				mestoService.save(mesto);
				mestaUBazi.add(mesto);
				System.out.println("NOVO MESTO " + mesto);
			}
		}
			
		return new ResponseEntity<>(mestaUBazi, HttpStatus.OK);
	}
	
	
}
