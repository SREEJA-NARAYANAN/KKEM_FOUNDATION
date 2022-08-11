package com.ictacademy.student;

public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment obj=new Assignment();
		int interest=obj.si(1000,2,5);
		System.out.println("interest="+interest);

	}
	
	int si(int p,int n,int r)
	{
	int i=p*n*r;
	return i;
	}
	

}
