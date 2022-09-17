package J06_클래스.access;

import J06_클래스.access1.AccessModifier2;

public class AccessMain {

	public static void main(String[] args) {
		AccessModifier2 am2 = new AccessModifier2();
		am1.run();
		
		AccessModifier1 accessModifier1 = new AccessModifier1();
		AccessModifier1 am1 = am2.test();
		
		
	}

}
