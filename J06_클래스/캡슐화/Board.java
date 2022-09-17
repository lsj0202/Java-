package J06_클래스.캡슐화;

import java.time.LocalDateTime;

public class Board {
	private int boardCode;
	private String title;
	private String writer;
	private String content;
	private LocalDateTime creagteDate;
	private int count;
	
	public Board() {
		
	}

	public Board(int boardCode, String title, String writer, String content, LocalDateTime creagteDate, int count) {
		this.boardCode = boardCode;
		this.title = title;
		this.writer = writer;
		this.content = content;
		this.creagteDate = creagteDate;
		this.count = count;
	}
	
	public int getBoardCode() {
		return boardCode;
	}
	
	public int setBoardCode(int boardCode) {
		this.boardCode = boardCode; //alt shift s
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public LocalDateTime getCreagteDate() {
		return creagteDate;
	}

	public void setCreagteDate(LocalDateTime creagteDate) {
		this.creagteDate = creagteDate;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public String toString() {
		return "Board [boardCode=" + boardCode + ", title=" + title + ", writer=" + writer + ", content=" + content
				+ ", creagteDate=" + creagteDate + ", count=" + count + "]";
	}
	
	
	
}
