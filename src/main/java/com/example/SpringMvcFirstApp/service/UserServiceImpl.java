package com.example.SpringMvcFirstApp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.SpringMvcFirstApp.model.User;
import com.example.SpringMvcFirstApp.repository.UserRepository;

@Service
public class UserServiceImpl implements UserServiceI {

	@Autowired
	private UserRepository userRepository;

	@Override
	public int saveUser(User user) {
		User user1 = userRepository.save(user);
		return user1.getUserId();
	}

	@Override
	public List<User> saveMultipleUser(List<User> list) {
		Iterable<User> saveAll = userRepository.saveAll(list);
		return (List<User>) saveAll;
	}

	@Override
	public User getSingleUser(int id) {
		Optional<User> findById = userRepository.findById(id);
		return findById.get();
	}

	@Override
	public List<User> getAllUser() {
		Iterable<User> findAll = userRepository.findAll();
		return (List<User>) findAll;
	}

	@Override
	public List<User> getAllUserById(List<Integer> list) {
		Iterable<User> findAllById = userRepository.findAllById(list);
		return (List<User>) findAllById;
	}

	@Override
	public boolean userExistsOrNot(int id) {
		boolean byId = userRepository.existsById(id);
		return byId;
	}

	@Override
	public long countNumOfUsers() {
		long totalUsers = userRepository.count();
		return totalUsers;
	}

	@Override
	public void deleteSingleRecord(int id) {

		boolean existsById = userRepository.existsById(id);

		if (existsById) {
			userRepository.deleteById(id);
			System.out.println("Entered Id " + id + " deleted successfully");
		} else {
			System.out.println("Entered Id " + id + " does not exists");
		}
	}

	@Override
	public void deleteSingleObject(User user) {
		int userId = user.getUserId();
		boolean existsById = userRepository.existsById(userId);
		if (existsById) {
			userRepository.delete(user);
			System.out.println("Data Deleted successfully using Object");
		} else {
			System.out.println("Does not exists");
		}
	}

	@Override
	public boolean deleteAllRecordsById(List<Integer> list) {

		userRepository.deleteAllById(list);

		return true;

	}

	@Override
	public boolean deleteAllUsers() {
		Iterable<User> findAll = userRepository.findAll();
		if (findAll != null) {
			userRepository.deleteAll();
			return true;
		} else {
			System.out.println("Records not available");
			return false;
		}
	}

	@Override
	public Page<User> userPagination(User user) {
		PageRequest pageRequest = PageRequest.of(2, 2);
		Page<User> findAll = userRepository.findAll(pageRequest);

		for (User p : findAll) {
			System.out.println(p);
		}
		return findAll;

	}

	@Override
	public List<User> sortingUsers(User user) {
		List<User> sortAll = userRepository.findAll(Sort.by("userId").descending());
		// by-default its ascending but if want to mention then we can as
		// (Sort.by("byAnyVariableRefType").ascending);
		return sortAll;
	}

	@Override
	public List<User> getByUserName(String userName) {
		List<User> byUserName = userRepository.findByUserName(userName);
		return byUserName;
	}

	@Override
	public List<User> getByUserCity(String userCity) {
		List<User> list = userRepository.findByUserCity(userCity);
		return list;
	}

	@Override
	public List<User> getByuserAgeGreaterThan(int userAge) {
		List<User> findByUserAgeLessThan = userRepository.findByuserAgeGreaterThan(userAge);
		return findByUserAgeLessThan;
	}
	
	@Override
	public List<User> getByUserAgeGreaterThanEqual(int userAge) {
		List<User> userAgeGreaterThanEqual = userRepository.findByUserAgeGreaterThanEqual(userAge);
		return userAgeGreaterThanEqual;
	}

	@Override
	public List<User> getByUserAgeLessThan(int userAge) {
		List<User> ageLessThan = userRepository.findByUserAgeLessThan(userAge);
		return ageLessThan;
	}

	@Override
	public List<User> getByUserAgeLessThanEqual(int userAge) {
		List<User> userAgeLessThanEqual = userRepository.findByUserAgeLessThanEqual(userAge);
		return userAgeLessThanEqual;
	}

	@Override
	public List<User> getByUserNameAndUserAge(String userName, int userAge) {
		List<User> findByUserNameAndUserAge = userRepository.findByUserNameAndUserAge(userName, userAge);
		return findByUserNameAndUserAge;
	}

	@Override
	public List<User> getByUserNameOrUserCity(String userName, String userCity) {
		List<User> findByUserNameOrUserCity = userRepository.findByUserNameOrUserCity(userName, userCity);
		return findByUserNameOrUserCity;
	}

	@Override
	public List<User> getByUserAgeBetween(int userAge1, int userAge2) {
		List<User> findByUserAgeBetween = userRepository.findByUserAgeBetween(userAge1, userAge2);
		return findByUserAgeBetween;
	}

	@Override
	public List<User> getByUserAgeAfter(int age) {
		List<User> findByUserAgeAfter = userRepository.findByUserAgeAfter(age);
		return findByUserAgeAfter;
	}

	@Override
	public List<User> getByUserAgeBefore(int age) {
		List<User> findByUserAgeBefore = userRepository.findByUserAgeBefore(age);
		return findByUserAgeBefore;
	}

//	@Override
//	public User getByUserAgeIsNull(int userId) {
//		Optional<User> id = userRepository.findById(userId);
//		User ageIsNull = userRepository.findByUserAgeIsNull(id);
//		return ageIsNull;
//	}

	@Override
	public User getUserByUserId(int userId) {
		User user = userRepository.findUserByUserId(userId);
		return user;
	}

	@Override
	public User getUserByUserName(String userName) {
		User byUserName = userRepository.findUserByUserName(userName);
		return byUserName;
	}

	@Override
	public List<User> getUsersByCityAndAge(String userCity, int userAge) {
		List<User> usersByCityAndAge = userRepository.findUsersByCityAndAge(userCity, userAge);
		return usersByCityAndAge;
	}

	@Override
	public List<User> getUsersByCity_Sql(String city) {
		List<User> usersByCity = userRepository.findUsersByCity(city);
		return usersByCity;
	}

}
