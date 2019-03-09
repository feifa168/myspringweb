package com.ft.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
//import org.springframework.web.servlet.mvc.Controller;

@Controller
public class HelloController /*implements Controller*/ {

    @RequestMapping("/hello")
    public ModelAndView handleRequest(javax.servlet.http.HttpServletRequest httpServletRequest, javax.servlet.http.HttpServletResponse httpServletResponse) throws Exception {
        System.out.println(httpServletRequest.getMethod() + ", " + httpServletRequest.getRequestURI() + ", " + httpServletRequest);
        System.out.println(httpServletResponse);
        ModelAndView mav = new ModelAndView("index");
        mav.addObject("message", "Hello Spring MVC");
        return mav;
    }
    @RequestMapping("/test")
    public ModelAndView handleRequest2(javax.servlet.http.HttpServletRequest httpServletRequest, javax.servlet.http.HttpServletResponse httpServletResponse) throws Exception {
        System.out.println(httpServletRequest.getMethod() + ", " + httpServletRequest.getRequestURI() + ", " + httpServletRequest);
        System.out.println(httpServletResponse);
        ModelAndView mav = new ModelAndView("test");
        mav.addObject("message", "Hello Spring MVC");
        return mav;
    }
}
