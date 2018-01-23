package com.javne.nabavke.parser;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.javne.nabavke.parser.service.parsedata.ParseEntry;

@SpringBootApplication
public class App {
	
    public static void main( String[] args ) {
        
    	SpringApplication.run(App.class, args);
    	try {
			ParseEntry.parse("http://portal.ujn.gov.rs/OpenD/Tekuci_Mesec.csv");
		} catch (IOException e) {
			e.printStackTrace();
		}
    	
    }
}
