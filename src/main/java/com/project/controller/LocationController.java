package com.project.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.project.dao.LoginDao;

@Controller
public class LocationController {
	@Autowired
	LoginDao infoLog;
	
	@RequestMapping(value="/location.html")
	public ModelAndView locationView()
	{
		try
		{
			infoLog.logActivities("in LocationController: ");
			ModelAndView mv= new ModelAndView();
			mv.setViewName("LocationView");
			mv.addObject("status", "true");
			return mv;
		}
		catch(Exception e)
		{
			infoLog.logActivities("in LocationController: "+e);
			ModelAndView mv= new ModelAndView();
			mv.setViewName("failure");
			mv.addObject("error",e);
			return mv;
		}
	}
}
