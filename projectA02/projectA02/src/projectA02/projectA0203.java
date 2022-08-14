package projectA02;

public class projectA0203 {

	public static void main(String[] args) {
		int sum = 10+20;
		int value =10;
		
		int value1 =sum + value;
		System.out.println(value1);
		
		long sum1=(10+10+10+10+10+10+10+10+2147483638L); //하나라도 L을 붙이면 양수가 나오고 L을 붙이지 않으면 음수가 나온다.
		
		long sum2=(10L+10L+10L+10L+10L+10L+10L+10L+2147483638L);
		
		long sum3=(2147483637+10L+10L+10L+10L+10L+10L+10L+10L);
		
		long sum4=(long)(2147483638+10+10+10+10+10+10+10+10);
		
		long sum5=(2147483638+10+10L+10L+10L+10L+10L+10L+10L);
		
		byte bytevalue= 127;
		System.out.println(sum1);
		System.out.println(sum2);
		System.out.println(sum3);
		System.out.println(sum4);
		System.out.println(sum5);
		
		byte bytal=(byte)(-128-1);
		byte byta2=(byte)(-128-3);
		System.out.println(bytal);//언더플로우 발생
		System.out.println(byta2);
		
		byte bytval=(byte)(127+2);
		System.out.println(bytval);
	}

}
