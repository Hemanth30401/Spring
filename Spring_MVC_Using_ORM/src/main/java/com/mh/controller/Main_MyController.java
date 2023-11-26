package com.mh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.mh.Dao.DaoInterface;
import com.mh.Entity.Employee;
import com.mh.Service.ServiceInterface;

@Controller
public class Main_MyController
{
	@Autowired
	ServiceInterface serviceInterface;
	
	public ServiceInterface getServiceInterface() 
	{
		return serviceInterface;
	}

	public void setServiceInterface(ServiceInterface serviceInterface) {
		this.serviceInterface = serviceInterface;
	}

	@RequestMapping("Start")
	public String o1() {
		return "Welcome";
	}
	
	@RequestMapping(path="/EmpReg")
	public String o2()
	{
		return "EmployeeReg";
	}
	@RequestMapping("/enter")
	public String o3(@ModelAttribute("employee")Employee employee) {
		serviceInterface.insertS(employee);
		return "Welcome";
	}
	
	@RequestMapping("/home")
	public String o4(@RequestParam("Eid")int id)
	{
		if(serviceInterface.loginS(id)) {
		return "Home";
		}
		else
			return "Welcome";
	}
	
	
}
