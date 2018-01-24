package com.javne.nabavke.parser.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="vrsta_postupkaa")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class VrstaPostupka {
	
	@Id
	@Column(name="id_vrste_postupka")
	private int id;
	
	private String naziv;
}
