package javaclass;

import java.util.Scanner;

public class objectclass {
	 double dblWidth;
	 double dblHeight;
	 double dblDepth;
	 static int boxid;
	 public double calcVolume(double w,double h, double v) {
			dblWidth = w;
			dblHeight= h;
			dblDepth= v;
			double dblTemp;
			dblTemp= dblWidth * dblHeight * dblDepth;
			return dblTemp;
		}

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	     objectclass box1 = new objectclass();
	     objectclass box2 = new objectclass();
	     
	     System.out.println("Enter the width of the box");
	     double w=sc.nextDouble();
	     System.out.println("Enter the height of the box");
	     double h=sc.nextDouble();
	     System.out.println("Enter the depth of the box");
	     double v=sc.nextDouble();
	     
	     
	     System.out.println("Volume of the box1 is " +box1.calcVolume(w,h,v));
	     System.out.println("Volume of the box2 is " +box2.calcVolume(w+10,h+10,v+10));

	}

}




