package J06_클래스.캡슐화;

import java.util.Scanner;

public class BoardService {
	
	private Board board;
	
	private Scanner scanner;
	
	public BoardService() {
		scanner = new Scanner(System.in);
	}
	
	public void create() {
		String title =null;
		String writer =null;
		String content =null;
		
		System.out.println("[ 게시글 작성 ]");
		
		System.out.print("제목: ");
		title = scanner.nextLine();
		
		System.out.print("작성자: ");
		writer = scanner.nextLine();
		
		System.out.print("내용: ");
		content = scanner.nextLine();
		
		board = new Board(0,title,writer,content,LocalDateTime.now(),0);
		
		
	}
	public void run() {
		System.out.printf("[ 게시글 조회 ]");
		if(board == null) {
			System.out.println("작성한 게시글이 없습니다.");
		}else {
			int boardCount = board.getCount();
			board.setCount(++boardCount);
			System.out.println(board.toString());
		}
	}
	public void insert() {
		
	}
	public void read() {
		
	}
	public void update() {
		
	}
	public void delete() {
		
	}
}
