package com.coforge.githubJavaEx.GithubJavaProject;

import java.util.Scanner;

import com.coforge.githubJavaEx.GithubJavaProject.service.EmployeeServiceImpl;

public class App 
{
    public static void main( String[] args )
    {
        EmployeeServiceImpl e=new EmployeeServiceImpl();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1 for Addemp and 2 for DispEmp");
        switch (sc.nextInt()) {
		case 1:e.addEmp();
			 
		case 2:e.displayEmp();
		   break;

		default:System.out.println("Requesting you to Enter Only 1 or 2 ");
			break;
		}
    }
}
