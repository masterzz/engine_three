package com.unicom.engine_three.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.unicom.engine_three.model.User;

@Mapper
public interface UserMapper {
	User getUserByName(String username);

	User getUserByNameAndPassword(String username, String password);

	User getUserByNameAndPassword(User user);

	void updateUser(User user);
	
	
	// adder by xwt
	List<User> getUserAll();
	
	void updateUserInfo(User user);
	
	void deleteMoreUser(int[] user_id);

	void insert(User user);

	
	
	
	
}
