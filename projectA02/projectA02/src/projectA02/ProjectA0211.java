package projectA02;

public class ProjectA0211 {

	public static void main(String[] args) {
		/*
		 * 더하기 +
		 * 빼기 -
		 * 곱하기 *
		 * 나누기 /
		 * 나머지 %
		 */
		//int sum =10+20+30;
		//int sub = 100-10-20;
		//int mul =10*20*30;
		//int div =100/10;
		//int nam =100%3;
		
		//단일연산자(항이 하나)
		//+
		//_
		//++
		//--
		
		//삼항 연산자
		// ㅁ? ㅁ:ㅁ
		int a=1;
		System.out.println(a++);//전위증가
		System.out.println(++a);//후위증가
		
		int b=0; 
		System.out.println("b="+b+"a="+a);
		b = ++a;
		System.out.println("b="+b+"a="+a);
		b = a++;
		System.out.println("b="+b+"a="+a);
		
	}

}
