package com.example.SpringMvcFirstApp.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.SpringMvcFirstApp.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

	public List<User> findByUserName(String userName);

	public List<User> findByUserCity(String userCity);

	public List<User> findByuserAgeGreaterThan(int userAge);

	public List<User> findByUserAgeGreaterThanEqual(int userAge);

	public List<User> findByUserAgeLessThan(int userAge);

	public List<User> findByUserAgeLessThanEqual(int userAge);

	public List<User> findByUserNameAndUserAge(String userName, int userAge);

	public List<User> findByUserNameOrUserCity(String userName, String userCity);

	public List<User> findByUserAgeBetween(int userAge1, int userAge2);

	public List<User> findByUserAgeAfter(int age);

	public List<User> findByUserAgeBefore(int age);

	// public User findByUserAgeIsNull(Object id);

	
	
	// custom queries - HQL
	@Query("from User where userId=:userId")
	public User findUserByUserId(int userId);

	@Query("from User where userName=:userName")
	public User findUserByUserName(String userName);

	@Query("from User where userCity=:userCity and userAge>=:userAge")
	public List<User> findUsersByCityAndAge(String userCity, int userAge);

	
	
	// SQL
	@Query(value = "select * from user_details where user_city=:user_city", nativeQuery = true)
	public List<User> findUsersByCity(String user_city);

	
	
	
	
	
	
	
}
