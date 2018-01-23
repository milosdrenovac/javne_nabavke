package com.javne.nabavke.parser.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="oblik_svojine")
@Data
@NoArgsConstructor
public class OblikSvojine {
	
	@Id
	@Column(name="id_oblika_svojine")
	private int id;
	
	private String naziv;
	
}
