package Patterns;

import java.util.Scanner;

public class Project9 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int m=sc.nextInt();
		for(int i=1;i<=m;i++) {
//			spaces
			for(int j=1;j<=m-i;j++)
			{
				System.out.print(" ");
			}
//			stars
			for(int j=1;j<=(2*i)-1;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
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
