package com.mh.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mh.Entity.Employee;


public class DaoImpl implements DaoInterface
{
	@Autowired
	HibernateTemplate hibernateTemplate;
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Transactional
	public void insert(Employee emp) 
	{
		hibernateTemplate.save(emp);
	}
	
	@Transactional
	public Boolean login(int id)
	{
		System.out.println("id="+id);
		Employee emp= hibernateTemplate.get(Employee.class,id);
		if(emp==null) 
		{
			return false;
		}
		return true;
	}
	

}
