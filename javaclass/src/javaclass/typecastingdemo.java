package javaclass;

public class typecastingdemo {

	public static void main(String[] args) {
		int a = 10;
		long l = a;              // widening
		double d = a;
		System.out.println(a); 
		System.out.println(l);
		System.out.println(d);
		byte b = (byte)d;          //narrowing
		System.out.println(b);

	}

}
