package projectA02;

public class projectA0207 {

	public static void main(String[] args) {
		char name1='이';
		char name2='상';
		char name3='진';
		
		System.out.println(name1+name2+name3);
		System.out.println(""+name1+name2+name3);//문자열이라는 것을 알려주는 부분
		
		System.out.println(name1);
		System.out.println(name2);
		System.out.println(name3);
		
		System.out.print(name1);
		System.out.print(name2);
		System.out.println(name3);
		
		String str =""+name1+name2+name3;
		System.out.println(str);
		
		String name="이상진";
		
		System.out.println(name1+name2+name3+name);
		System.out.println(""+name1+name2+name3+name);
		System.out.println(10+20+name);//첫째 자리가 숫자면 숫자를 출력후 name 문자열 출력
		System.out.println(name+10+20);//첫째 자리가 문자열이면 10+20도 문자열로 출력됨.
	}

}
