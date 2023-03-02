package com.example.SpringMvcFirstApp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;

import com.example.SpringMvcFirstApp.model.User;
import com.example.SpringMvcFirstApp.service.UserServiceI;

@Controller
public class UserController {

	@Autowired
	private UserServiceI userServiceI;

	public String saveUser(User user) {

		int saveUser1 = userServiceI.saveUser(user);
		String msg = "Data with User_Id " + user.getUserId() + " have been saved successfully :" + saveUser1;
		return msg;
	}

	public String saveMultipleUser(List<User> list) {

		List<User> saveMultipleUser = userServiceI.saveMultipleUser(list);

		String msg = "All data with User_Id " + saveMultipleUser;

		return msg;

	}

	public String getSingleUser(int id) {

		User user1 = userServiceI.getSingleUser(id);
		String msg = "UserData :" + user1;

		return msg;

	}

	public List<User> getAllUser() {

		List<User> allUser = userServiceI.getAllUser();

		return allUser;

	}

	public List<User> getAllUserById(List<Integer> list) {

		List<User> allUserById = userServiceI.getAllUserById(list);
		return allUserById;

	}

	public String userExistsOrNot(int id) {
		boolean byId = userServiceI.userExistsOrNot(id);
		if (byId) {
			return "User with entered Id exists";
		}
		return "User with entered Id does not exists";
	}

	public long countNumOfUsers() {

		long numOfUsers = userServiceI.countNumOfUsers();

		return numOfUsers;
	}

	public void deleteSingleRecord(int id) {

		userServiceI.deleteSingleRecord(id);

	}

	public void deleteSingleObject(User user) {

		userServiceI.deleteSingleObject(user);
	}

	public String deleteAllRecordsById(List<Integer> list) {

		userServiceI.deleteAllRecordsById(list);

		return "Records Deleted";

	}

	public String deleteAllUsers() {

		boolean deleteAllUsers = userServiceI.deleteAllUsers();
		if (deleteAllUsers) {
			return "All records deleted successfully";
		} else {
			return "records not deleted";
		}
	}

	public Page<User> userPagination(User user) {

		Page<User> userPagination = userServiceI.userPagination(user);

		return userPagination;
	}

	public List<User> sortingUsers(User user) {

		List<User> sortingUsers = userServiceI.sortingUsers(user);

		return sortingUsers;
	}

	public List<User> getByUserName(String userName) {

		List<User> byUserName = userServiceI.getByUserName(userName);
		return byUserName;
	}

	public List<User> getByUserCity(String userCity) {
		List<User> list = userServiceI.getByUserCity(userCity);
		return list;
	}

	public List<User> getByuserAgeGreaterThan(int userAge) {
		List<User> byUserAgeLessThan = userServiceI.getByuserAgeGreaterThan(userAge);
		return byUserAgeLessThan;
	}

	public List<User> getByUserAgeGreaterThanEqual(int userAge) {
		List<User> ageGreaterThanEqual = userServiceI.getByUserAgeGreaterThanEqual(userAge);
		return ageGreaterThanEqual;
	}

	public List<User> getByUserAgeLessThan(int userAge) {

		List<User> userAgeLessThan = userServiceI.getByUserAgeLessThan(userAge);
		return userAgeLessThan;
	}

	public List<User> getByUserAgeLessThanEqual(int userAge) {

		List<User> ageLessThanEqual = userServiceI.getByUserAgeLessThanEqual(userAge);
		return ageLessThanEqual;

	}

	public List<User> getByUserNameAndUserAge(String userName, int userAge) {
		List<User> byUserNameAndUserAge = userServiceI.getByUserNameAndUserAge(userName, userAge);
		return byUserNameAndUserAge;
	}

	public List<User> getByUserNameOrUserCity(String userName, String userCity) {

		List<User> byUserNameOrUserCity = userServiceI.getByUserNameOrUserCity(userName, userCity);
		return byUserNameOrUserCity;

	}

	public List<User> getByUserAgeBetween(int userAge1, int userAge2) {

		List<User> userAgeBetween = userServiceI.getByUserAgeBetween(userAge1, userAge2);
		return userAgeBetween;

	}

	public List<User> getByUserAgeAfter(int age) {

		List<User> byUserAgeAfter = userServiceI.getByUserAgeAfter(age);
		return byUserAgeAfter;
	}

	public List<User> getByUserAgeBefore(int age) {
		List<User> findByUserAgeBefore = userServiceI.getByUserAgeBefore(age);
		return findByUserAgeBefore;
	}

//	public String getByUserAgeIsNull(int userId) {
//		
//		User ageIsNull = userServiceI.getByUserAgeIsNull(userId);
//		
//		return "Data is Null";
//		
//	}
	
	public User getUserByUserId(int userId) {
		
		User user = userServiceI.getUserByUserId(userId);
		return user;
	}
	
	public User getUserByUserName(String userName) {
		
		User byUserName = userServiceI.getUserByUserName(userName);
		return byUserName;
	}
	
	public List<User> getUsersByCityAndName(String userCity, int userAge){
		
		List<User> byCityAndAge = userServiceI.getUsersByCityAndAge(userCity, userAge);
		return byCityAndAge;
		}
	
	public List<User> getUsersByCity_Sql(String city){
		List<User> byCity = userServiceI.getUsersByCity_Sql(city);
		return byCity;
		}
	
	
}
