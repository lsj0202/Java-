
public class A0304 {

	public static void main(String[] args) {
		for(int i=1; i<=9; i++) {
				System.out.println(i+"단");
				for(int j=1; j<=9; j++) {
					System.out.println(i+"x"+ j+"="+(i*j));
			}
		}
		System.out.println("============================");
		int sum=0;
			for(int i=1; i<=100; i++) {
				if(i%2==0) {
					sum+=i; 
				}
			}
			System.out.println(sum);
			
			sum=0; 
			for(int i=1; i<=100; i++) {
				if(i%2 !=0) {
					sum +=i;
				}
			}
			System.out.println(sum);
			
			sum=0;
			for(int i=1; i<=1000; i++) {
				if(i%2==0) {
					sum+=i; 
				}
			}
			System.out.println(sum);
			
			sum=0; 
			for(int i=1; i<=1000; i++) {
				if(i%2 !=0) {
					sum +=i;
				}
			}
			System.out.println(sum);

			
			 sum=0;
			for(int i=1; i<=10000; i++) {
				if(i%2==0) {
					sum+=i; 
				}
			}
			System.out.println(sum);
			
			sum=0; 
			for(int i=1; i<=10000; i++) {
				if(i%2 !=0) {
					sum +=i;
				}
			}
			System.out.println(sum);

		}

}
