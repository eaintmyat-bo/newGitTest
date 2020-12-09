package sg.edu.iss.demo.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import sg.edu.iss.demo.model.User;
import sg.edu.iss.demo.service.UserImplementation;
import sg.edu.iss.demo.service.UserInterface;

@Controller
public class UserController {
		//smthsmthsmtdafdadsfh
	//just adding to see smth
		@Autowired
		UserInterface uservice;
		@Autowired
		public  void setUserImplementation(UserImplementation uimpl) {
			// TODO Auto-generated method stub
			this.uservice= uimpl;

		}
		
		@RequestMapping(path="/login")
		public String login(Model model)
		{   int m=2;//to test
			User u=new User();
			model.addAttribute("user",u);
			return "loginform";
			
		}
		
		@RequestMapping(path="/authenticate")
		public String auntheticate(@ModelAttribute("user") User user,Model model,HttpSession sessiondata)
		{
		if(	uservice.authenticate(user))
		{  
			User u=uservice.findByName(user.getUserName());
			sessiondata.setAttribute("usesession", user);
			return "welcome";}
		else
		{return "login";}
			
		}
}
