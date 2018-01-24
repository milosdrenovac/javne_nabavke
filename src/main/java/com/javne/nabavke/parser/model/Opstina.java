package com.javne.nabavke.parser.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="opstina")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Opstina {
	
	@Id
	@Column(name = "idOpstine")
	private int id;
	
	private String naziv;

}
