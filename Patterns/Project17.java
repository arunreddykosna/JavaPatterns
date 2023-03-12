package Patterns;

import java.util.Scanner;

public class Project17 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of rows");
		int m=sc.nextInt();
			
		for(int i=1;i<=m;i++) {
			for(int j=1;j<=m-i;j++) {
				System.out.print(" ");
			}
			char ch='A';
			for(int j=1;j<=(2*i)-1;j++) {
				if(i>j) {
					System.out.print(ch++);
				}else {
					System.out.print(ch--);
				}
				
			}
			for(int j=1;j<=m-i;j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
		
	}

}
