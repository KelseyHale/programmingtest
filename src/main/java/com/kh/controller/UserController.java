package com.kh.controller;
import com.kh.service.UserService;
import com.kh.domain.User;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
	@Autowired
	private UserService userService;
	
	@RequestMapping("/user/list")
	public void userList(Model model) {
		List<User> userList = userService.findAll();
		model.addAttribute("userList", userList);
	}

}
