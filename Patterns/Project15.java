package Patterns;

import java.util.Scanner;

public class Project15 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of rows");
		int m=sc.nextInt();
		for(int i=m;i>=1;i--) {
			for(char j='A';j<'A'+i;j++) {
				System.out.print(j+" ");
			}
			System.out.println("");
		}
	}

}
