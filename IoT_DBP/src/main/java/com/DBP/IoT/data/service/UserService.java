package com.DBP.IoT.data.service;

import com.DBP.IoT.businessCore.User.User;

public interface UserService {
	public User findUserByEmail(String email);
	public void saveUser(User user);
}
