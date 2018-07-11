package myspring.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import myspring.di.vo.UserVO;
import myspring.user.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping("/getUserList.do")
	public ModelAndView getUserList() {
		List<UserVO> list = userService.getUserList();
		return new ModelAndView("userList.jsp","userListKey",list);
	}
	
	@RequestMapping("/getUser.do")
	public String getUser(@RequestParam String userid, Model model) {
		UserVO userInfo = userService.getUser(userid);
		model.addAttribute("userKey", userInfo);
		return "userDetail.jsp";
	}
	
	
}