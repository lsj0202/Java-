
public class A0302 {

	public static void main(String[] args) {
		int sum=0;
		for(int i=1; i<=100; i++) {
			if(i%2!=0) {
				sum+=i;
			}
		}
		System.out.println(sum);
		
		sum=0;
		for(int i=1; i<=10000; i++) {
			if(i%2!=0) {
				sum+=i;
			}
		}
		System.out.println(sum);
		
		sum=0;
		for(int i=1; i<=999; i++) {
			if(i%2!=0) {
				sum+=i;
			}
		}
		System.out.println(sum);
		
		sum=0;
		for(int i=1; i<=50; i++) {
			if(i%2!=0) {
				sum+=i;
			}
		}
		System.out.println(sum);
	}

}
