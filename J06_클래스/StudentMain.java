package J06_클래스;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		/*
		 * 두 종류의 자료형
		 * 1. 일반자료형(int, double, char, boolean)
		 * 2. 참조자료형(클래스, String, Scanner,Student)
		 */
		
		Student student1 = new Student(); //값
		Student student2 = new Student();
		Student student3 = new Student();
		Student student4 = new Student();
		Student student5 = new Student();
			
		System.out.println(student1);
		System.out.println(student2);
		System.out.println(student3);
		System.out.println(student4);
		System.out.println(student5);
		System.out.println(">>>>>>>>>>>>>>>>>>>");
		System.out.println(new Student());
		
	student1.name ="이상진";//참조연산자               //.을 찍어서 주소를 나타냄
	student1.studentYear =2;
	student1.showInfo();
	
	student2.name ="김준일";//참조연산자
	student2.studentYear =3;
	student2.showInfo();
	}

}
