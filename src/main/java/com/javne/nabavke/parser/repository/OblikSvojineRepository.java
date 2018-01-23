package com.javne.nabavke.parser.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.javne.nabavke.parser.model.OblikSvojine;

@Repository
public interface OblikSvojineRepository extends PagingAndSortingRepository<OblikSvojine, Integer>{

}
