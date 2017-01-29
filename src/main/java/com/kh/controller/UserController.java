package com.kh.controller;

import com.kh.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService userService;
	
	@RequestMapping("/user/list")
	public void userList(Model model) {
		List<User> userList = userService.findAll();
		model.addAttribute("carList", carList);
	}

}
