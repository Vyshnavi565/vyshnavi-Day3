package com.control_statemets;
import java.util.Scanner;
public class AmoebaMultilication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of Months:");
		int month=sc.nextInt();
		int m1=0, m2=1, m3=0;
		for(int i=2;i<month;i++)
		{
			m3=m2+m1;
			m1=m2;
			m2=m3;
		}
		System.out.println(m3);
		
	}

}
