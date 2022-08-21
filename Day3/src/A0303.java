
public class A0303 {

	public static void main(String[] args) {
		int sum=0;
		for(int i=1; i<=100; i+=2) {
			sum +=i;
		}
		System.out.println("1~100까지 홀수의 합:"+ sum);
		
		sum=0;
		for(int i=1; i<=10000; i+=2) {
			sum +=i;
		}
		System.out.println("1~100까지 홀수의 합:"+ sum);
		
		sum=0;
		for(int i=0; i<=100; i+=2) {
			sum+=i;
		}
		System.out.println(sum);
		
		int sum1=0;
		for(int i=1; i<=800;i++) {
			if(i%2==0) {
				sum1+=i;
			}
		}
		System.out.println(sum1);
	}

}
