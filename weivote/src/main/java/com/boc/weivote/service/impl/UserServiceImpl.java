package com.boc.weivote.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boc.weivote.entity.User;
import com.boc.weivote.mapper.UserMapper;
import com.boc.weivote.service.UserService;
@Service
public class UserServiceImpl implements UserService{
	@Autowired
	UserMapper userMapper;
	
	@Override
	public int save(User user) {
		return 0;
	}

	@Override
	public int update(User user) {
		return 0;
	}

	@Override
	public User getUser(int userId) {
		return userMapper.selectByPrimaryKey(userId);
	}

}
