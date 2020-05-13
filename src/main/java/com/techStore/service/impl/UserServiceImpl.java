package com.techStore.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techStore.domain.User;
import com.techStore.domain.security.PasswordResetToken;
import com.techStore.repository.PasswordResetTokenRepository;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private PasswordResetTokenRepository passwordResetTokenRepository;
	
	@Override
	public PasswordResetToken getPasswordResetToken(final String token) {
	
		return passwordResetTokenRepository.findByToken(token);
	}

	@Override
	public void createPasswordResetTokenForUser(final User user,final String token) {
		final PasswordResetToken myToken= new PasswordResetToken(token,user);
		passwordResetTokenRepository.save(myToken);
		
	}

}
