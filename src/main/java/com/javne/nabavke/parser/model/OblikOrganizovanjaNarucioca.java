package com.javne.nabavke.parser.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="oblik_organizovanja_narucioca")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OblikOrganizovanjaNarucioca {
	
	@Id
	@Column(name="id_oblika_organizovanja_narucioca")
	private int id;
	
	private String naziv;
}
