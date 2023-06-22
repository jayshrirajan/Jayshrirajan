package com.demo;

/*public class methodoverload {
public void add(int a) {
	System.out.println("a:" +a);
}
public void add(int a, int b) {
	System.out.println("a+b:" +(a+b));
}
public void add(int a,int b, int c ) {
	System.out.println("a+b+c:" +(a+b+c));
}

public static void main(String args[]) {
methodoverload ml = new methodoverload();
ml.add(3);
ml.add(3,8);
ml.add(300,400,500);

	
}

}*/

public class methodoverload{
	public int mul(int x) {
		return x;
	}
	public int mul(int x,int y) {
		return x+y;
	}
	public int mul(int x, int y, int z) {
		return x+y+z;
	}
	
	public static void main(String args[]) {
		methodoverload m = new methodoverload();
		m.mul(3);
		m.mul(10,20);
		m.mul(50,30,20);
System.out.println("method overloading");
		
	}
}


