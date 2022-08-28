package EX1;

import J06_클래스.Student;

public class UserMain {

	public static void main(String[] args) {
		User user1 = new User();
		User user2 = new User();
		User user3 = new User();
		
		
		user1.userId ="lsj";
		user1.userPassword ="leesang1";
		user1.userName = "이상진";
		user1.userEmail = "w1004123@gmail.com";
		user1.userPhone = "010-4401-2329";
		user1.userAddress = "대한민국 부산";
		user1.showInfo();
		
		
		user1.showInfo();
	}

}
