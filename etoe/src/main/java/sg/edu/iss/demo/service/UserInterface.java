package sg.edu.iss.demo.service;

import java.util.List;

import sg.edu.iss.demo.model.RoleType;
import sg.edu.iss.demo.model.User;

public interface UserInterface {

	//create signatures
	public void createUser(User user);
	public void updateUser(User user);
	public List<User> listAllUser();
	public void deleteUser(User user);
	public RoleType getRole(User user);
	public boolean authenticate(User user);//to check if the user username and password matches
	public User findByName(String name);	
}
