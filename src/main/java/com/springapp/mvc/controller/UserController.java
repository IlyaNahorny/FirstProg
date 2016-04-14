package com.springapp.mvc.controller;

import com.springapp.mvc.models.User;
import com.springapp.mvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by dulik on 13.04.2016.
 */
@Controller
@RequestMapping("/")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.GET)
    public String printWelcome(ModelMap model) {
//        List<User> users = userService.getAllUsers();
//        model.addAttribute("users",users);

        model.addAttribute("users",userService.getAllUsers());
        return "home";
    }

    @RequestMapping(value = "/insert", method = RequestMethod.GET)
    public String insert() {
        userService.insert(new User("test","test","test",20,"test","test"));
        return "hello";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String redirectLogin(){
//        userService.getAllUsers();
        return "login";
    }

    @RequestMapping(value = "/registration_page", method = RequestMethod.POST)
    public String redirectRegistration(){
        return "registration";
    }

    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public String validRegistration(ModelMap model,HttpServletRequest request){
        User user = new User(
                (String) request.getParameter("firstName"),
                (String) request.getParameter("lastName"),
                (String) request.getParameter("city"),
                Integer.parseInt(request.getParameter("age")),
                (String) request.getParameter("username"),
                (String) request.getParameter("password")

        );
        userService.insert(user);
        return "login";
    }

}
