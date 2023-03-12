package Patterns;

import java.util.Scanner;

public class Project13 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int k=0;
		int m=sc.nextInt();
		for(int i=1;i<=m;i++) {
			for(int j=1;j<=i;j++) {
				k++;
				System.out.print(k+" ");
			}
			System.out.println("");
		}
	}

}
