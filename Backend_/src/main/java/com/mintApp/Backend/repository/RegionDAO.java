package com.mintApp.Backend.repository;


import com.mintApp.Backend.entity.Region;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegionDAO extends CrudRepository<Region, Integer> {
}
