package com.coforge.githubJavaEx.GithubJavaProject.dao;

import java.util.Scanner;

import com.coforge.githubJavaEx.GithubJavaProject.beanClass.Employee;


public class EmployeeDaoImpl implements EmployeeDao{
	private Employee e=null;
	Scanner sc=new Scanner(System.in);
	public EmployeeDaoImpl() {
		e=new Employee();
	}
	public void addEmp() {
		
		e.setEmpId(sc.nextInt());
		e.setEmpName(sc.next());
		e.setEmpPhone(sc.nextLong());
		e.setEmpEmail(sc.next());
	}

	public void displayEmp() {
		System.out.println(e.getEmpId());
		System.out.println(e.getEmpName());
		System.out.println(e.getEmpPhone());
		System.out.println(e.getEmpEmail());
		
	}

}
