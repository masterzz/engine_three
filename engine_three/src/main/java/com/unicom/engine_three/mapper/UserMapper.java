package com.unicom.engine_three.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.unicom.engine_three.model.User;

@Mapper
public interface UserMapper {
	User getUserByName(String username);

	User getUserByNameAndPassword(String username, String password);

	User getUserByNameAndPassword(User user);
}
