package com.graficoeweb.workshopmongo.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.graficoeweb.workshopmongo.domain.User;

@RestController
@RequestMapping(value="/users")
public class UserResource {
	 
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<User>> findAll() {
		User maria = new User("1", "Maria", "maria@gmail.com");
		User eduardo = new User("2", "Eduardo", "eduardo@yahoo.com");
		List<User> list = new ArrayList<>();
		list.addAll(Arrays.asList(maria, eduardo));
		return ResponseEntity.ok().body(list);
	}
}
