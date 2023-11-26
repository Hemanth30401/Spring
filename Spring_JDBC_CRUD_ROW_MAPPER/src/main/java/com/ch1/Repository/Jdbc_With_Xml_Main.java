package com.ch1.Repository;

import java.util.Iterator;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ch1.Entity.Employee;

public class Jdbc_With_Xml_Main {

	public static void main(String[] args) 
	{
		ApplicationContext c = new AnnotationConfigApplicationContext(EmployeeConfig.class);
		Dao dao = c.getBean("DaoImpl",DaoImpl.class);
//		Employee emp = new Employee();
//		emp.setEname("Virat");
//		emp.setEid(5);
//		emp.setEgender("M");
//		int rows = dao.insertEmployee(emp);
//		System.out.println(rows +" rows updated successfully");
		
		int id=3;
		System.out.println("Employee with Eid " + id);
		Employee emp1 = dao.getOneEmployeeObject(id);
		System.out.println(emp1);
		
		System.out.println();
		System.out.println("All Employees are: ");
		List<Employee> list = dao.getEmployees();
		Iterator itr = list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
