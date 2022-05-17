package javaclass;

import java.util.Scanner;

public class loops {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num");
		int num = sc.nextInt();
		int i=1;
		while(i<=10)
		//for(i=1;i<=10;i++)
		{
			System.out.printf("%d * %d = %d\n",num,i,num*i);
			i++;
		}

	}

}
