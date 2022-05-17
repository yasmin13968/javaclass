package javaclass;

import java.util.Scanner;

public class variablesdemo {
	double dblwidth;
	double dblheight;
	double dbldepth;
	static int boxid;
	
	public variablesdemo(double dblwidth,double dblheight,double dbldepth) {
		this.dblwidth = dblwidth;
		this.dblheight = dblheight;
		this.dbldepth=dbldepth;
		
	}
	public variablesdemo()
	{
		
	}
	public double calcvolume()
	{
		double dbltemp;
		dbltemp = dblwidth * dblheight * dbldepth;
		return dbltemp;
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the width of the box");
		double w = sc.nextDouble();
		System.out.println("Enter the height of the box");
		double h = sc.nextDouble();
		System.out.println("Enter the depth of the box");
		double v = sc.nextDouble();
		variablesdemo v1 =  new variablesdemo(w,h,v);
		System.out.println("Volume of the box is"+v1.calcvolume());

	}

}
