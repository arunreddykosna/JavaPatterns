package Patterns;

import java.util.Scanner;

public class Project16 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of rows");
		int m=sc.nextInt();
		for(int i=0;i<=m;i++) {
			char ch=(char) ('A'+i);
			for(int j=0;j<=i;j++){
					System.out.print(ch);
		}
			System.out.println("");
	}

}
}
