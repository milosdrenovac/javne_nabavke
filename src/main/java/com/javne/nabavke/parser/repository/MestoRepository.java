package com.javne.nabavke.parser.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.javne.nabavke.parser.model.Mesto;

@Repository
public interface MestoRepository extends PagingAndSortingRepository<Mesto, Integer>{

}
