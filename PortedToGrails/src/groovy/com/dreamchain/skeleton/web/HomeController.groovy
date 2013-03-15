package com.dreamchain.skeleton.web;


import com.dreamchain.skeleton.model.User;
import com.dreamchain.skeleton.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    UserService userService;
	
	private static Logger log = LoggerFactory.getLogger(HomeController.class);

	
	@RequestMapping(method=RequestMethod.GET, value=["/", "/home.action"])
	public String showHomePage (ModelAndView mv) {
        println( "find all with gorm" )
        println( User.findAll() )
        new User(name:'Emil', address:'address', email:'e@e.se').save(flush:true)

        log.info("Hit controller");
        System.out.println("found users: " + userService.findAll().getUsers());
        log.info("found users: " + userService.findAll());
		
		return "/home";
	}
}
