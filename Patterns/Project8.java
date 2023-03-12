package Patterns;

import java.util.Scanner;

public class Project8 {
	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the number of rows");
			int m=sc.nextInt();
		for(int i=m;i>=1;i--) {
//			Spaces
			for(int j=1;j<=m-i;j++) {
				System.out.print(" ");
			}
//			stars
			for(int j=1;j<=2*i-1;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
