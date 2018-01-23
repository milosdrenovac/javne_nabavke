package com.javne.nabavke.parser.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="opstina")
@Data
@NoArgsConstructor
public class Opstina {
	
	@Id
	@Column(name = "idOpstine")
	private int id;
	
	private String naziv;

}
