package com.examples.users.controller;

import org.apache.catalina.startup.ClassLoaderFactory.Repository;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.examples.users.bean.Users;

@RestController
@RequestMapping("/users")
public class UsersController {

	@GetMapping("/{number}")
	public Users getUser(@PathVariable long number) {
		return new Users(Integer.valueOf(""+number), "Meghana", "Password","Vidyanagar,Shimoga");
	}
	
	
	@RequestMapping(value = "/{number}", method = RequestMethod.POST)
	public Users Test(@RequestBody Users user) {
		Users response = new Users();
		response.setId(user.getId());
		response.setUsername(user.getUsername());
		response.setPassword(user.getPassword());
		response.setAddress(user.getAddress());
		return response;
	}
	/*
	 * @RequestMapping(value = "/number", method = RequestMethod.POST) public String
	 * createUser() { return "Product is saved successfully"; }
	 */
	
	/*
	 * @PostMapping("/users") public void createUser(@RequestBody User user) { User
	 * sevedUser=service.save(user); }
	 */
	
	/*
	 * @RequestMapping(value = "/persistPerson", method = RequestMethod.POST) public
	 * ResponseEntity<String> persistPerson(@RequestBody PersonDTO person) { if
	 * (personService.isValid(person)) { personRepository.persist(person); return
	 * ResponseEntity.status(HttpStatus.CREATED).build(); } return
	 * ResponseEntity.status(HttpStatus.I_AM_A_TEAPOT).build(); }
	 */
	
		/*
		 * @PostMapping("/users") User newEmployee(@RequestBody User newEmployee) {
		 * return Repository.this(newUser); }
		 */
}
