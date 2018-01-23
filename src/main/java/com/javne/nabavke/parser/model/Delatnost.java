package com.javne.nabavke.parser.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="delatnost")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Delatnost {
	
	@Id
	@Column(name="id_delatnosti")
	private int id;
	
	private String Naziv;
}
