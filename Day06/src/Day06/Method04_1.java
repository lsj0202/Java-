package Day06;

import java.util.Scanner;

/*
 * 
 * 문제: 
 *		국어(kor), 영어(eng), 수학(math) 성적을 입력 받는다.
 *		3명 
 * 		double kor1
 * 		double kor2
 * 		double kor3
 * 
 * 		double eng1
 * 		double eng2
 * 		double eng3
 * 
 * 		double math1
 * 		double math2
 * 		double math3
 * 
 * ===============================
 * 
 * 		double total1
 * 		double total2
 * 		double total3
 * 
 * 		double avg1
 * 		double avg2
 * 		double avg3
 * 
 * 		get Total(kor,eng,math)
 * 
 * 		get Avg(total)
 * 		
 * 		printInfo(1, kor, eng , math, total, avg)
 * 		
 * 		1번 학생 점수
 * 		국어: 10
 * 		영어: 20
 *  	수학: 30
 *   
 *   	총점: 60
 *   	평균: 20
 */
public class Method04_1 {
	
	public static double getTotal(double kor, double eng, double math) { //getTotal 이라는 메소드를 통해서 모든 점수의 합을 구한다.(main함수에서 부를수 있다.)
		return kor+eng+math; //리턴 값을 줬기 때문에 void 가 아닌 double을 썼다.
	}
	
	public static double getAvg(double tot) {  //평균을 구하기 위한 메소드이다. 여기서도 마찬가지로 void 가 아닌 double 을 통해 실수값을 리턴한다. 
		return tot/3; //total 에서 3을 나눈 수는 평균값을 나타낸다.
	}
	public static void printInfo(int num,     //프린트할 학생번호
								double kor,  //국어
								double eng, //영어
								double math) {// 수학을 매개변수에 넣었다.
		
		double totalScore = getTotal(kor,eng,math); //이 부분을 꼭 써줘야함.  //getTotal 메소드를 선언 해주었다. *매개변수도 넣어줌
		
		System.out.println(num + "번 학생 성적");
		System.out.println("국어: "+ kor);  //국
		System.out.println("영어: "+ eng);  //영
		System.out.println("수학: "+ math);	//수
		System.out.println("총점: "+ totalScore); //총점
		System.out.println("평균: "+ getAvg(totalScore)); //평균 메소드 getAvg를 불렀다.
		System.out.println(); 
		
	}
	public static void inputScore() {
		Scanner scanner = new Scanner(System.in); //scanf 부분이다. 메소드에서도 scanf를 쓸 수 있다.
		
		int num=0;    //변수의 초기화
		double kor =0; //변수의 초기화
		double eng =0; //변수의 초기화
		double math =0; //변수의 초기화
		
		System.out.print("학생 번호: ");
		num = scanner.nextInt();
		
		System.out.print("국어: ");
		kor = scanner.nextDouble();
		
		System.out.print("영어: ");
		eng = scanner.nextDouble();
		
		System.out.print("수학: ");
		math = scanner.nextDouble();
		
		System.out.println();
		 
		printInfo(num,kor,eng,math);  //매개변수 printInfo 소환  스캐너에 쓴 값들을 printInfo에 대입하였다.
	}
	
	public static void main(String[] args) {
		for(int i=0; i<3; i++) {
			inputScore();   //inputScore를 3번 실행 // for문에 넣은 숫자에따라 더 많이 실행 할 수 도있다.
		}
		
		
	}
}
