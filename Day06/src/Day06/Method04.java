package Day06;// 비효율적 코드
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
public class Method04 {
	
	public static void stu1() {
		double kor1 = 10.00;
		double eng1 = 20.00;
		double math1 = 30.00;
		
		double tot1 = kor1 + eng1 + math1;
		double avg1 = tot1/3;
		System.out.println("국어: "+ kor1);
		System.out.println("영어: "+eng1);
		System.out.println("수학: "+math1);
		System.out.println();
		System.out.println("총점: "+tot1);
		System.out.println("평균: "+avg1);
		
		
	}
	
	public static void stu2() {
		double kor2 = 20.00;
		double eng2 = 30.00;
		double math2 = 40.00;
		
		double tot2 = kor2 + eng2 + math2;
		double avg2 = tot2/3;
		System.out.println("국어: "+kor2);
		System.out.println("영어: "+eng2);
		System.out.println("수학: "+math2);
		System.out.println();
		System.out.println("총점: "+tot2);
		System.out.println("평균: "+avg2);
		
	}
	
	public static void stu3() {
		double kor3 = 30.00;
		double eng3 = 40.00;
		double math3 = 50.00;
		
		double tot3 = kor3 + eng3 + math3;
		double avg3 = tot3/3;
		System.out.println("국어: "+kor3);
		System.out.println("영어: "+eng3);
		System.out.println("수학: "+math3);
		System.out.println();
		System.out.println("총점: "+tot3);
		System.out.println("평균: "+avg3);
		
	}
	
	public static void main(String[] args) {
		System.out.println("학생1의 점수");
		stu1();
		System.out.println();
		System.out.println("학생2의 점수");
		stu2();
		System.out.println();
		System.out.println("학생3의 점수");
		stu3();
		
	}

}
