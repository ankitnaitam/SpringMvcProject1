package com.example.SpringMvcFirstApp;

import java.util.ArrayList; 
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Page;

import com.example.SpringMvcFirstApp.controller.UserController;
import com.example.SpringMvcFirstApp.model.User;

@SpringBootApplication
public class SpringMvcFirstAppApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringMvcFirstAppApplication.class, args);
		UserController userController = context.getBean(UserController.class);

		// Save single data

//		User user1 = new User();
//		user1.setUserName("Ramesh");
//		user1.setCity("Pune");
//		user1.setAge(25);

//		String saveUser1 = userController.saveUser(user1);
//		System.out.println(saveUser1);

		// Multiple Data Saving 
/*		User user2=new User(); 
		user2.setUserName("Ram");
		user2.setUserCity("Mumbai");
		user2.setUserAge(21);

		User user3 = new User();
		user3.setUserName("Lakshman");
		user3.setUserCity("Nagpur");
		user3.setUserAge(18);

		User user4 = new User();
		user4.setUserName("Bajrang");
		user4.setUserCity("Dehli");
		user4.setUserAge(28);

		List<User> list = new ArrayList<>();
		list.add(user2);
		list.add(user3);
		list.add(user4);

		String multipleUser = userController.saveMultipleUser(list);
		System.out.println(multipleUser);

		// Get single user data
		/*
		 * String singleUser = userController.getSingleUser(3);
		 * System.out.println(singleUser);
		 */

		// Get All User Data
//		List<User> allUser = userController.getAllUser();
//		System.out.println(allUser);

		// Get all User by Id
//		List<Integer> list=new ArrayList<>();

//		list.add(2);
//		list.add(4);

//		List<User> allUserById = userController.getAllUserById(list);
//		System.out.println(allUserById);

		// Get User existance by id
//		String existsOrNot = userController.userExistsOrNot(2);
//		System.out.println(existsOrNot);

		// Count total Users
//		long countNumOfUsers = userController.countNumOfUsers();
//		System.out.println("Total Number of Users :"+countNumOfUsers);

		// Delete single record
//		userController.deleteSingleRecord(4);

		// Delete single record using Object
//		User user1=new User();
//		user1.setUserId(2);
//		userController.deleteSingleObject(user1);
		
		//Delete list of records
//		List<Integer> list=new ArrayList<>();
//		list.add(5);
//		list.add(7);
//		
//		String deleteAllRecordsById = userController.deleteAllRecordsById(list);
//		System.out.println(deleteAllRecordsById);
		
		//Delete All Records
//		String deleteAllUsers = userController.deleteAllUsers();
//		System.out.println(deleteAllUsers);
		
		//Pagination
//		User user=new User();
//		Page<User> userPagination = userController.userPagination(user);
//		System.out.println(userPagination);
		
		//Sorting
//		User user1=new User();
//		List<User> sortingUsers = userController.sortingUsers(user1);
//		System.out.println(sortingUsers);
		
		//Find by user Name -method level
//		List<User> user = userController.getByUserName("c");
//		System.out.println(user);
		
		//Find by user City
//		List<User> city = userController.getByUserCity("Nagpur");
//		System.out.println(city);
		
		//Find by userAge greater than
//		 List<User> ageGreaterThan = userController.getByuserAgeGreaterThan(43);
//		 System.out.println(ageGreaterThan);
		
		//userAge greater than equal
//		List<User> greaterThanEqual = userController.getByUserAgeGreaterThanEqual(30);
//		System.out.println(greaterThanEqual);
		
		
		//find by userAge less than
//		List<User> ageLessThan = userController.getByUserAgeLessThan(23);
//		System.out.println(ageLessThan);
		
		//userAge less than equal
//		System.out.println();
//		System.out.println();
//		List<User> lessThanEqual = userController.getByUserAgeLessThanEqual(22);
//		System.out.println(lessThanEqual);
		
		// using And operator
//		List<User> userNameAndUserAge = userController.getByUserNameAndUserAge("Jaddu", 22);
//		System.out.println(userNameAndUserAge);
		
		// using Or operator
//		List<User> userNameOrUserCity = userController.getByUserNameOrUserCity("Jaddu", "banglore");
//		System.out.println(userNameOrUserCity);
		
		// find by user age Between
//		List<User> userAgeBetween = userController.getByUserAgeBetween(18, 25);
//		System.out.println(userAgeBetween);
		
		// find by user age After
//		List<User> userAgeAfter = userController.getByUserAgeAfter(42);
//		System.out.println(userAgeAfter);
		
		// find by user age Before
//		List<User> userAgeBefore = userController.getByUserAgeBefore(22);
//		System.out.println(userAgeBefore);
		
		//isNull
//		String isNull = userController.getByUserAgeIsNull(4);
//		System.out.println(isNull);
		
		//Custom Queries
		//ById
//		User user = userController.getUserByUserId(4);
//		System.out.println(user);
//		
//		//By User Name
//		User user2 = userController.getUserByUserName("lakshman");
//		System.out.println(user2);
//		
//		//By User City and Age
//		List<User> users = userController.getUsersByCityAndName("kolkata", 40);
//		System.out.println(users);
		
		//By sql queries
		List<User> users = userController.getUsersByCity_Sql("kolkata");
		System.out.println(users);
		
		
	}

}
