package J04_반복;

import java.util.Scanner;

public class ForEx1 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = 0;
		
		System.out.print("입력: ");
		
		n=scan.nextInt();
		
		for(int i=0; i<n; i++) {
			System.out.println(i+1);
		}
		
		System.out.println("==========");
		
		//for(int i=n; i>0; i--) {
		//	System.out.println(i);
		//}
		for(int i=0; i<n; i++) {
			System.out.println(n-i);
		}
		
	}
}
