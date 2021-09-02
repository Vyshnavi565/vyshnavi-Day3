package com.control_statemets;
import java.util.Scanner;
public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n, m, num=1;
		n=sc.nextInt();
		m=sc.nextInt();
		while(num<=m)
		{
			int mul=num*n;
			System.out.println(num+"*"+n+"="+mul);
			num++;
		}

	}

}
