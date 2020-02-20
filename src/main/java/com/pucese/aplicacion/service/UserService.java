package com.pucese.aplicacion.service;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.pucese.aplicacion.Exception.UsernameOrIdNotFound;
import com.pucese.aplicacion.dto.ChangePasswordForm;
import com.pucese.aplicacion.entity.User;

public interface UserService {

	public Iterable<User> getAllUsers();

	public User createUser(User user) throws Exception;

	public User getUserById(Long id) throws Exception;
	
	public User updateUser(User user) throws Exception;
	
	public void deleteUser(Long id) throws UsernameOrIdNotFound;
	
	public User changePassword(ChangePasswordForm form) throws Exception;
	
	public User Email(User form) throws Exception;
	public User Whatsaap(User form) throws Exception;
	
	public Optional<User> findUserByEmail(String email);
	public Optional<User> findUserByCelular(String celular);
    public Optional<User> findUserByResetToken(String resetToken);
    public void save(User user);
}
