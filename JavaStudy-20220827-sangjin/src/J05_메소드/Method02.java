package J05_메소드;

//import java.time.LocalDateTime;

public class Method02 {
	
	/*
	 * 매개변수 x
	 * 반환 x
	 */
	public static void test1() {
		System.out.println("test1메소드: 매개변수x, 반환x");
	}
	/*
	 * 매개변수 1개 -> (int 변수명)
	 * 반환x      -> void 
	 */
	public static void test2(int num) {
		System.out.println("test메소드: 매개변수 int num("+ num +"), 반환x");
	}
	/*
	 * 매개변수 2개 -> (int 변수명, String 변수명)
	 * 반환x      -> void 
	 */
	public static void test3(int num,String str) { //String str 은 문자열을 나타낸다.
		System.out.println("test3메소드: ");
		System.out.println("\t\t매개변수 int sum(" + num + ")");
		System.out.println("\t\t매개변수 int sum(" + str + ")");
	}
	/*
	 * 매개변수 x ->()
	 * 반환o ->int 
	 */
	public static int test4() {
		System.out.println("test4메소드: 매개변수x, 정수 반환");
		return (100+200)/10;
	}
	/*
	 * 매개변수 x ->()
	 * 반환o -> String 
	 */
	//public static String test5() {
		//System.out.println("test5 메소드: 매개변수x, 문자열 반환");
		//int year = LocalDateTime.now().getYear();
		//year = 2000;
		
		//if(year % 4==0 && year % 100 !=0 || year % 400= 0) {
			//return "윤년";
		//}
		//else {
			//return "윤년x";
		//}
	//}
	/*
	 * 매개변수 2개  -> (int num1, int num2)
	 * 반환o        -> String  
	 */
	public static String evenAndOdd(int num1, int num2) {
		
		if((num1 + num2)%2==0) {
			return "짝수";
		}
		else {
			return "홀수";
		}
	}
	
	//return 이 없어도 반환이 된다.
	public static void main(String[] args) {
		test1(); //메소드(함수) call(호출)
		test2(10);
		test2(100);
		test3(100,"이상진");
		test3(10,"Java");
		System.out.println(test4());
		int r1 = test4();
		System.out.println(r1);
		//System.out.println(test(5));
		System.out.println(evenAndOdd(7,7));
	}

}//코드클린
