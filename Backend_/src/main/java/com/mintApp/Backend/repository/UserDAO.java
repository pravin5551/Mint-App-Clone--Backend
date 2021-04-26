package com.mintApp.Backend.repository;

import com.mintApp.Backend.entity.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDAO extends CrudRepository<User, Integer> {

    @Query("select u from User u where u.username = ?1")
    public User findUserByName(String name);

}
