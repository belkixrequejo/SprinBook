package com.pucese.aplicacion.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pucese.aplicacion.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

	public Optional<User> findByUsername(String username);
	public Optional<User> findByEmail(String email);
	public Optional<User> findByResetToken(String resetToken);
	public Optional<User> findByCelular(String celular);
	
 }
