package Patterns;

import java.util.Scanner;

public class Project12 {
	public static  void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int m=sc.nextInt();
		for(int i=0;i<=m;i++){
//			numbers
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
//			spaces
			for(int j=1;j<=2*(m-i);j++) {
				System.out.print(" ");
			}
//			numbers
			for(int j=i;j>=1;j--) {
				System.out.print(j);
			}
			System.out.println("");
		}
	}

}
