package com.mintApp.Backend.repository;


import com.mintApp.Backend.entity.Newsarticle;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NewsDAO extends CrudRepository<Newsarticle, Integer> {


//    @Query("select n,r.regionname from Newsarticle n inner join Region r on r.regionid=n.regid")


    @Query("select n from Newsarticle n where n.region= ?1 ORDER By newsid desc")
    Iterable<Newsarticle> findAllByRegion(String name);

    @Query("select n from Newsarticle n order by newsid desc")
    Iterable<Newsarticle> findAllNewsDesc();
}