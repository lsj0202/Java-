package projectA02;

public class projectA0201 {

	public static void main(String[] args) {
		int myBirthYear=1977;
		int 내출생년도=1977;
		int myBirthMonth=10;
		int myBirthDay=29;
		
		//keyword 경우 변수 사용불가
		int intValue=100;
		System.out.println(myBirthYear);
		System.out.println(내출생년도);
		System.out.println(myBirthMonth);
		System.out.println(myBirthDay);
		
		int intdata=2147483647;
		
		byte byteval=127;
		System.out.println(byteval);
		byte byteval1= -128;
		System.out.println(byteval1);
		
		short shortval=32767;
		System.out.println(shortval);
		
		float floatval=1.12f; //float 는 f를 붙여야한다.
		double doubleval=1.12;
		
		System.out.println(floatval);
		System.out.println(doubleval);
		
		long longdata=2147483648L;
		System.out.println(longdata);
		
		//상수
		final double PI=3.14;
		
	}

}
