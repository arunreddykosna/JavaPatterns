package Patterns;

import java.util.Scanner;

public class Project19 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of rows");
		int m=sc.nextInt();
		for(int i=5;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			for(int j=1;j<=2*(5-i);j++) {
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			for(int j=1;j<=2*(5-i);j++) {
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}

}
