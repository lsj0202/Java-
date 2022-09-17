package J06_클래스.access2;

public class AccessModifier4 {
	public static void main(String[] args) {
		AccessModifier3 accessModifier3 = new AccessModifier3("JAVA 기초","java class study".10);
		AccessModifier3.print();
		
		accessModifier3.setTitle("Java응용");
		accessModifier3.pirnt();
	}
}
