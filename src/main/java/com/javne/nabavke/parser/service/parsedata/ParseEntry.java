package com.javne.nabavke.parser.service.parsedata;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;



import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.javne.nabavke.parser.model.Entry;
import com.javne.nabavke.parser.model.Mesto;
import com.javne.nabavke.parser.service.DelatnostService;
import com.javne.nabavke.parser.service.KategorijaNaruciocaService;
import com.javne.nabavke.parser.service.MestoService;
import com.javne.nabavke.parser.service.OblikOrganizovanjaNaruciocaService;
import com.javne.nabavke.parser.service.OblikSvojineService;
import com.javne.nabavke.parser.service.OpstinaService;
import com.javne.nabavke.parser.service.VrstaPostupkaService;

@Component
public class ParseEntry {
	
	@Autowired
	MestoService mestoService;
	@Autowired
	OpstinaService opstinaService;
	@Autowired
	VrstaPostupkaService vrstaPostupkaService;
	@Autowired
	DelatnostService delatnostService;
	@Autowired
	OblikOrganizovanjaNaruciocaService oblikOrganizovanjaNaruciocaService;
	@Autowired
	OblikSvojineService oblikSvojineService;
	@Autowired
	KategorijaNaruciocaService kategorijaNaruciocaService;
	
	public List<Mesto> parseMesta(String fileUrl) throws IOException{
		URL url = new URL(fileUrl);
        List<Mesto> svaMesta = new ArrayList<Mesto>();
        try (	
        		BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
                CSVParser csvParser = new CSVParser(br, CSVFormat.DEFAULT
                        .withFirstRecordAsHeader()
                        .withIgnoreHeaderCase()
                        .withTrim());
            ) {
                Iterable<CSVRecord> csvRecords = csvParser.getRecords();
                for (CSVRecord csvRecord : csvRecords) {
                	Mesto mesto = new Mesto(Integer.parseInt(csvRecord.get(0)), csvRecord.get(1));  
                	svaMesta.add(mesto);
                }
            }
		return svaMesta;
        
	}
	
	public List<Entry> parseEntry(String fileUrl) throws IOException {
		URL url = new URL(fileUrl);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-d HH:mm:ss");
		List<Entry> allEntry = new ArrayList<>();
        try (	
        		BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
                CSVParser csvParser = new CSVParser(br, CSVFormat.DEFAULT
                        .withFirstRecordAsHeader()
                        .withIgnoreHeaderCase()
                        .withTrim()); 
            ) {
                Iterable<CSVRecord> csvRecords = csvParser.getRecords();
                for (CSVRecord csvRecord : csvRecords) {
                	Entry entry = new Entry(Integer.parseInt(csvRecord.get(0)), csvRecord.get(1), csvRecord.get(2), Integer.parseInt(csvRecord.get(3)), 
                				Integer.parseInt(csvRecord.get(4)), 
                				mestoService.findOne(Integer.parseInt(csvRecord.get(5))), 
                				opstinaService.findOne(Integer.parseInt(csvRecord.get(6))),
                				vrstaPostupkaService.findOne(Integer.parseInt(csvRecord.get(7))),
                				csvRecord.get(8), csvRecord.get(9), csvRecord.get(10), csvRecord.get(11), csvRecord.get(12), 
                				LocalDate.parse(csvRecord.get(13), formatter), 
	                			delatnostService.findOne(Integer.parseInt(csvRecord.get(14))), 
	                			oblikOrganizovanjaNaruciocaService.findOne(Integer.parseInt(csvRecord.get(15))), 
	                			oblikSvojineService.findOne(Integer.parseInt(csvRecord.get(16))), 
	                			kategorijaNaruciocaService.findOne(Integer.parseInt(csvRecord.get(17))), 
	                			Boolean.parseBoolean(csvRecord.get(18)), Boolean.parseBoolean(csvRecord.get(19)), Boolean.parseBoolean(csvRecord.get(20)), 
	                			Boolean.parseBoolean(csvRecord.get(21)), Boolean.parseBoolean(csvRecord.get(22)), Boolean.parseBoolean(csvRecord.get(23)), 
	                			Boolean.parseBoolean(csvRecord.get(24)), Boolean.parseBoolean(csvRecord.get(25)), Boolean.parseBoolean(csvRecord.get(26)), 
	                			Boolean.parseBoolean(csvRecord.get(27)), Boolean.parseBoolean(csvRecord.get(28)), Boolean.parseBoolean(csvRecord.get(29)), 
	                			Boolean.parseBoolean(csvRecord.get(30)), Boolean.parseBoolean(csvRecord.get(31)), Boolean.parseBoolean(csvRecord.get(32)), 
	                			Boolean.parseBoolean(csvRecord.get(33)), Boolean.parseBoolean(csvRecord.get(34)), Boolean.parseBoolean(csvRecord.get(35)), 
	                			Boolean.parseBoolean(csvRecord.get(36)), Boolean.parseBoolean(csvRecord.get(37)), Boolean.parseBoolean(csvRecord.get(38)), 
	                			Boolean.parseBoolean(csvRecord.get(39)), Boolean.parseBoolean(csvRecord.get(40)), Boolean.parseBoolean(csvRecord.get(41)),
	                			Boolean.parseBoolean(csvRecord.get(42)), Boolean.parseBoolean(csvRecord.get(43)), csvRecord.get(44)); 
                	allEntry.add(entry);
                }
            }
		return allEntry;
	}
}
