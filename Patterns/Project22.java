package Patterns;

public class Project22 {
	public static void main(String[] args) {
		int m=4;
		for(int i=1;i<=(2*m)-i;i++) {
			for(int j=1;j<=(2*m)-i;j++) {
				if(i==j||i==(2*m)-i||j==(2*m)-i) {
					System.out.print(j);
				}
			}
			System.out.println("");
		}
		
	}
}


