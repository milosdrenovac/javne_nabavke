package com.javne.nabavke.parser.service.parsedata;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.springframework.beans.factory.annotation.Autowired;

import com.javne.nabavke.parser.service.DelatnostService;

public class ParseEntry {
	
	@Autowired
	static DelatnostService delatnostService;
	
	public static void parse(String fileUrl) throws IOException{
		URL url = new URL(fileUrl);
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();

        try (	
        		BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                Reader reader = Files.newBufferedReader(Paths.get(fileUrl));
                CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT
                        .withFirstRecordAsHeader()
                        .withIgnoreHeaderCase()
                        .withTrim());
            ) {
                Iterable<CSVRecord> csvRecords = csvParser.getRecords();

                for (CSVRecord csvRecord : csvRecords) {

                    String sifra = csvRecord.get(0);
                    String nazivDokumenta = csvRecord.get(1);

                    System.out.println("Record No - " + csvRecord.getRecordNumber());
                    System.out.println("---------------");
                    System.out.println("Name : " + sifra);
                    System.out.println("Email : " + nazivDokumenta);
                    System.out.println("---------------\n\n");
                }
            }
        
	}
}
