package com.demo;

public class Student_qtwo {
	    int  rollsam=11;
	    int rolljohn=12;
	    long phonenosam=9303832517L;
	    long phonenojohn=540917206L;
	    String adrrsam="Delhi";
	    String addrjohn="Mumbai";
	   public static void main(String[] args)
	    {
	       Student_qtwo sam=new Student_qtwo();
	       Student_qtwo john=new Student_qtwo();
	       System.out.println("Sam rollno " + sam.rollsam);
	       System.out.println("John rollno " + john.rolljohn);
	       System.out.println("Sam phoneno " + sam.phonenosam);
	       System.out.println("John phoneno " + john.phonenojohn);
	       System.out.println("Sam address " + sam.adrrsam);
	       System.out.println("John address " + john.addrjohn);
	    }
	}
