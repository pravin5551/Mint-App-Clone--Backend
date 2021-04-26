package com.mintApp.Backend.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Technology extends CrudRepository<Technology, Integer> {



}
