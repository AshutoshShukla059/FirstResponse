package com.lti.demos;

import java.util.Scanner;

public class TestCalci {

	public static void main(String[] args) {
			Calci c = new Calci();
			Scanner s =new Scanner(System.in);
			int x = s.nextInt();
			System.out.println("Enter number : "+x);
			int y = s.nextInt();
			System.out.println("Enter number : "+y);
			int r = c.calNos(x, y);
			System.out.println("Calculation is : "+r);
			int ss = c.calNos2(20, 10);
			System.out.println("Calculation term 2 is : "+ss);
			int t = c.calNos3(5, 6);
			System.out.println("Calcultion term 3 is : "+t);
	}
}
