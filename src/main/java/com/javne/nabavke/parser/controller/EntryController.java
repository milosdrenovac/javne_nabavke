package com.javne.nabavke.parser.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.javne.nabavke.parser.model.Entry;
import com.javne.nabavke.parser.service.EntryService;
import com.javne.nabavke.parser.service.parsedata.ParseEntry;

@RestController
@RequestMapping(value = "api/entry")
public class EntryController {
	
	@Autowired
	EntryService entryService;
	
	@Autowired
	ParseEntry parse;
	
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Entry>> GetEntry() throws IOException {
		
		List<Entry> entryFromWeb = parse.parseEntry("http://portal.ujn.gov.rs/OpenD/OpenData_2018.csv");
		System.out.println(entryFromWeb.size());
		List<Entry> entryInDB = entryService.findAll();
		
		if (entryFromWeb.removeAll(entryInDB) || entryInDB.isEmpty()){
			for (Entry entry : entryFromWeb) {
				entryService.save(entry);
				entryInDB.add(entry);
				System.out.println("NOV UPIS " + entry);
			}
		}
			
		return new ResponseEntity<>(entryInDB, HttpStatus.OK);
	}
}
