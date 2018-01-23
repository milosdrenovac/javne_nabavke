package com.javne.nabavke.parser.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.javne.nabavke.parser.model.VrstaPostupka;

@Repository
public interface VrstaPostupkaRepository extends PagingAndSortingRepository<VrstaPostupka, Integer>{

}
