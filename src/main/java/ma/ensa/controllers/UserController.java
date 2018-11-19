package ma.ensa.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import ma.ensa.entities.User;
import ma.ensa.repository.UserRepository;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins="http://localhost:4200",allowedHeaders="*")
public class UserController {
	
	@Autowired
	private UserRepository userrepository;
	
	@GetMapping("/users")
	public List<User> getUsers(){
		return userrepository.findAll();
	}
	
	@GetMapping("/user/{EmailID}")
	public Object getUser(@PathVariable String EmailID){
		return userrepository.findById(EmailID);
	}
	
	@DeleteMapping("/user/{EmailID}")
	public boolean deleteUser(@PathVariable String EmailID){
		User user=userrepository.getOne(EmailID);
		userrepository.delete(user);;
		return true;
	}


	@PutMapping("/user")
	public User UpdateUser(@RequestBody User user){
		return userrepository.save(user);
	}
	@PostMapping("/user")
	public User CreateUser(@RequestBody User user){
		return userrepository.save(user);
	}
	
}
