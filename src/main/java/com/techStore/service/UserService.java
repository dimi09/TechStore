package com.techStore.service.impl;

import com.techStore.domain.User;
import com.techStore.domain.security.PasswordResetToken;

public interface UserService {

	PasswordResetToken getPasswordResetToken(final String token);
	
	void createPasswordResetTokenForUser(final User user, final String token);
}
