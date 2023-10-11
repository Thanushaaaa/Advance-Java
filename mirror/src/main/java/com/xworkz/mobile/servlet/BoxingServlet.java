package com.xworkz.mobile.servlet;

import javax.servlet.http.HttpServlet;

public class BoxingServlet extends HttpServlet{
  
	String name="Arjun";
	String father=new String("Rakesh");
	String age="30";
	int age1=Integer.parseInt(age); //auto boxing(boxing)
	int age2=age1; //auto unboxing(unboxing)
}
