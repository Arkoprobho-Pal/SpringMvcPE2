package com.stackroute;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class UserController {
    @RequestMapping("/process")
    public /*String*/ModelAndView InputUser(HttpServletRequest request, HttpServletResponse response)
    {/*
        int i=Integer.parseInt(request.getParameter("t1"));
        int j=Integer.parseInt(request.getParameter("t2"));*/
        User user=new User();
        user.setName(request.getParameter("MyName"));
        user.setPassword(request.getParameter("Password"));
        //creating model object to pass the value
        ModelAndView modelAndView=new ModelAndView();
        //which view i want to call
        modelAndView.setViewName("Display.jsp");
        //what object i want to pass
        modelAndView.addObject("username",user);
        //return "Display.jsp";
        return modelAndView;
    }
}
