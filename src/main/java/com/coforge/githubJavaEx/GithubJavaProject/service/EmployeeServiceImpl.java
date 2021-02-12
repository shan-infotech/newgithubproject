package com.coforge.githubJavaEx.GithubJavaProject.service;

import com.coforge.githubJavaEx.GithubJavaProject.dao.EmployeeDao;
import com.coforge.githubJavaEx.GithubJavaProject.dao.EmployeeDaoImpl;

public class EmployeeServiceImpl implements EmployeeService{
	private EmployeeDaoImpl ed=null;
	
	public EmployeeServiceImpl() {
		ed=new EmployeeDaoImpl();
	}

	public void addEmp() {
		ed.addEmp();
	}

	public void displayEmp() {
		ed.displayEmp();
	}
	

}
