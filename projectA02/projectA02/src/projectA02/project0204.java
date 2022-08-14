package projectA02;

public class project0204 {

	public static void main(String[] args) {
		/*
		 * 형변환
		 */
		//문자 -> 정수
		char c='A';//2byte
		int int_c=c;//2byte ->4byte 
		System.out.println(int_c);
		
		//정수를 실수로 변환
		double double_int = int_c; //4byte ->8byte
		System.out.println(double_int);
		
		//실수->정수
		double d=3.14;
		int int_d=(int)d; //큰용량을 작은용량으로 넣을때(강제 형변환)
		System.out.println(int_d);
		
		byte byte1=127;//1byte
		short short1=byte1;//2byte
		//short short2=short1+1; //short+int=> int 메모리가 큰 형태로 타입이 지정됨.
		short short2=(short)(short1+1); //형변환을 통해 형태를 유지 시켜줌
		short short3 = (short)(short1 + short2); //계산은 int 로 하기때문에 같은 byte 이더라도 형변환을 해줌
		short short4=(short)(1+1);
		byte byt2 = (byte)short1; //강제 형변환
		System.out.println(short1);
		System.out.println(short2);
		System.out.println(short3);
		System.out.println(short4);
		System.out.println(byt2);
	}

}
