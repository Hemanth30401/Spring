package com.ch1.Repository;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages="com.ch1.Repository")
public class EmployeeConfig 
{
	@Bean("dataSource")
	public DataSource getDataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/workers");
		dataSource.setUsername("root");
		dataSource.setPassword("ROOT#30");
		return dataSource;
	}
	
	@Bean("JdbcTemplate")
	public JdbcTemplate getJdbcTemplate() {
		JdbcTemplate t = new JdbcTemplate();
		t.setDataSource(getDataSource());
		return t;
	}
}
