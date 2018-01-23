package com.javne.nabavke.parser.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.javne.nabavke.parser.model.KategorijaNarucioca;

@Repository
public interface KategorijaNaruciocaRepository extends PagingAndSortingRepository<KategorijaNarucioca, Integer> {

}
