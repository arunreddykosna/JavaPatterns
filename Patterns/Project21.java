package Patterns;

import java.util.Scanner;

public class Project21 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of rows");
		int m=sc.nextInt();
		for(int i=1;i<=m;i++) {
			for(int j=1;j<=m;j++) {
				if(i==1||j==1||i==m||j==m) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println("");
		}
	}

}
