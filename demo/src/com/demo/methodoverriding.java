package com.demo;

class bank{
public int getRateOfInterest() {
	return 9;
	
}
}
class sbi extends bank{
	public int getRateOfInterest() {
		return 10;
	}
}
class indian extends bank{
public int getRateOfInterest() {
	return 11;
}
public class methodoverriding {
	public static void main(String args[]) {
		sbi s = new sbi();
		indian i = new indian();
		s.getRateOfInterest();
		i.getRateOfInterest();
		
	
		

	}
}
}
