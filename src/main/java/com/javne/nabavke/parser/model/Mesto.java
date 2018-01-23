package com.javne.nabavke.parser.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="mesto")
@Data
@NoArgsConstructor
public class Mesto {
	
	@Id
	@Column(name = "idMesta")
	private int id;
	
	private String Naziv;
}
