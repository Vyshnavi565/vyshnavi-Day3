package com.control_statemets;
import java.util.Scanner;
public class FactorialNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i, fact=1;
		for(i=1;i<n;i++)
		{
			fact=fact*i;
			if(n==fact)
			{
				fact=1;
				break;
			}
		}
		if(fact==1)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}

	}

}
