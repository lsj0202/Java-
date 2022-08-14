package projectA02;

public class projectA0209 {

	public static void main(String[] args) {
		var price=200;
		var name="kitae";
		var PI=3.14;
		var inta = 2147483648L;
		System.out.println(price);
		System.out.println(name);
		System.out.println(inta);
		var intb =2147483648L +10L;
		System.out.println(intb);
		
		var str=name+price+price;// 문자열이 처음 나와서 더한값이 아닌 각자의 값이 나오게된다.
		System.out.println(str);
		var str1=price+price+name;//문자열이 뒤에 나와서 더한값이 나오게 된다.
		System.out.println(str1);

	}

}
