package com.lti.demos;


public class Calci {
	
	public int calNos (int x, int y) {
		int result=(x+y)-(x-y);
		return result;
	}
	public int calNos2 (int a, int b) {
		int result=(a*a)+(b*b)+(2*a*b);
		return result;
	}
	public int calNos3 (int p, int q) {
		int result=(p-q)*(p-q);//(p-q)^2;
		return result;
	}
}
