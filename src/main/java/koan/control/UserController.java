package koan.control;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import koan.pojo.Users;
import koan.service.IUserService;

@Controller
@RequestMapping("/uc")
public class UserController {
	
	@Autowired
	private IUserService userService;
	
	@RequestMapping(value="login",method=RequestMethod.POST)
	public String islogin(Users users,HttpServletRequest request) {
		System.out.println(users);
		Users user = userService.islogin(users);
		if(user==null) {
			return "login";
		}
		request.getSession().setAttribute("myusers", users);
		return "suc";
	}
}
