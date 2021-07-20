package com.example.repository;

import java.util.List;

import com.example.entity.User;

public interface UserRepository {

	void save(User user);

	List<User> findAll();

	List<User> findByMobile(String mobile);

}
