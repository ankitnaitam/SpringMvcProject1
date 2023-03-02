package com.example.SpringMvcFirstApp.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.example.SpringMvcFirstApp.model.User;

public interface UserServiceI {

	public int saveUser(User user);

	public List<User> saveMultipleUser(List<User> list);

	public User getSingleUser(int id);

	public List<User> getAllUser();

	public List<User> getAllUserById(List<Integer> list);

	public boolean userExistsOrNot(int id);

	public long countNumOfUsers();

	public void deleteSingleRecord(int id);

	public void deleteSingleObject(User user);

	public boolean deleteAllRecordsById(List<Integer> list);

	public boolean deleteAllUsers();

	public Page<User> userPagination(User user);

	public List<User> sortingUsers(User user);

	public List<User> getByUserName(String userName);
	
	public List<User> getByUserCity(String userCity);
	
	public List<User> getByuserAgeGreaterThan(int userAge);
	
	public List<User> getByUserAgeGreaterThanEqual(int userAge);
	
	public List<User> getByUserAgeLessThan(int userAge);
	
	public List<User> getByUserAgeLessThanEqual(int userAge);
	
	public List<User> getByUserNameAndUserAge(String userName, int userAge);
	
	public List<User> getByUserNameOrUserCity(String userName, String userCity);
	
	public List<User> getByUserAgeBetween(int userAge1, int userAge2);
	
	public List<User> getByUserAgeAfter(int age);
	
	public List<User> getByUserAgeBefore(int age);
	
	//public User getByUserAgeIsNull(int userId);
	
	//custom queries
	public User getUserByUserId(int userId);
	
	public User getUserByUserName(String userName);
	
	public List<User> getUsersByCityAndAge(String userCity, int userAge);
	
	public List<User> getUsersByCity_Sql(String city);
	
	
	
	
}
