package com.javne.nabavke.parser.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="entry")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Entry {
	@Id
	private int sifraNabavke;
 	private String nazivDokumenta;
	private String nazivNarucioca;
	private int maticniBroj;
	private int pib;
	@ManyToOne(fetch=FetchType.LAZY)
	private Mesto mesto;
	@ManyToOne(fetch=FetchType.LAZY)
	private Opstina opstina;
	@ManyToOne(fetch=FetchType.LAZY)
	private VrstaPostupka vrstaPostupka;
	private String predmetNabavke;
	private String vrstaPredmeta;
	private String opstiRecnikNabavki;
	private String kontaktOsoba;
	private String telefon;
	private LocalDate datumPoslednjeIzmene;
	@ManyToOne(fetch=FetchType.LAZY)
	private Delatnost delatnost;
	@ManyToOne(fetch=FetchType.LAZY)
	private OblikOrganizovanjaNarucioca oblikOrgNarucioca;
	@ManyToOne(fetch=FetchType.LAZY)
	private OblikSvojine oblikSvojine;
	@ManyToOne(fetch=FetchType.LAZY)
	private KategorijaNarucioca kategorija;
	private boolean pozivZaPodnosenjePonuda;
	private boolean pozivZaPodnosenjePrijava;
	private boolean obavestenjeOSistemuDinamickeNabavke;
	private boolean pozivZaUcesceNaKonkursZaDizajn;
	private boolean obavestenjeOPriznavanjuKvalifikacije;
	private boolean obavestenjeOPriznavanjuKvalifikacijeURestriktivnomPostupku;
	private boolean podaciOObjaviIDodeliUgovora;
	private boolean obavestenjeOZakljucenomOkvirnomSporazumu;
	private boolean obavestenjeOZakljucenomUgovoru;
	private boolean obavestenjeORezultatuKonkursa;
	private boolean obavestenjeOObustaviPostupkaJavneNabavke;
	private boolean podaciOIzmeniUgovoraOJavnojNabavci;
	private boolean konkursnaDokumentacija;
	private boolean obavestenjeOProduzenjuRoka;
	private boolean pregovarackiBezPonuda;
	private boolean obavestenjeOZastitiPrava;
	private boolean misljenjeUpraveJN;
	private boolean odlukaOPriznavanjuKvalifikacije;
	private boolean odlukaOIskljucenjuKandidata;
	private boolean odlukaODodeliUgovora;
	private boolean odlukaODodeliOkvirnogSporazuma;
	private boolean obavestenjeOPonistenjuPostupka;
	private boolean odlukaOObustaviPostupka;
	private boolean odlukaONastavkuPostupka;
	private boolean odlukaKomisijeOZakljucenjuUgovora;
	private boolean obavestenjeOPriznavanjuKvalifikacijeOpste;
	private String Link;

}
