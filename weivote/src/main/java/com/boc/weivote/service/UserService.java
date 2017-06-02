package com.boc.weivote.service;

import com.boc.weivote.entity.User;

public interface UserService {
	
	public int save(User user);
	
	public int update(User user);
	
	public User getUser(int userId);
}
