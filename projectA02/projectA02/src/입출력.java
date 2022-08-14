package projectA02;

import java.util.Scanner;

public class projectA0212 {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		
		System.out.println("이름은: ");
		String name=in.nextLine();
		
		System.out.println("나이는:");
		int age = Integer.parseInt(in.nextLine());
		
		System.out.println(name+"님의 나이는"+age+"입니다.");
		
		
	}

}
