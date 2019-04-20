package com.udemy.n0rdy.oauth2demo.data.repository;

import com.udemy.n0rdy.oauth2demo.data.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {

    User findByName(String name);
}
