package kh.semi.dto;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BoardDTO {
	private int boardNo; // 숫자 주키 (DB가 만들어 줘)
	private String email = "jihye6712@gmail.com";
	private String title;
	private String writer;
	private int amount;
	private String bank;
	private String account;
	private String contents;
	private Timestamp dueDate;
	private int viewCount;
	private Timestamp writeDate;	
	private int recommend;
	private int sumAmount;	
	// 총 13개
	
	public BoardDTO() {
		super();
	}
	public BoardDTO(int boardNo, String email, String title, String writer, int amount, String bank, String account,
			String contents, Timestamp dueDate, int viewCount, Timestamp writeDate, int recommend, int sumAmount) {
		super();
		this.boardNo = boardNo;
		this.email = email;
		this.title = title;
		this.writer = writer;
		this.amount = amount;
		this.bank = bank;
		this.account = account;
		this.contents = contents;
		this.dueDate = dueDate;
		this.viewCount = viewCount;
		this.writeDate = writeDate;
		this.recommend = recommend;
		this.sumAmount = sumAmount;
	}
	public BoardDTO(String title, int amount, Timestamp dueDate, int sumAmount) {
		super();
		this.title = title;
		this.amount = amount;
		this.dueDate = dueDate;
		this.sumAmount = sumAmount;
	}

	public int getBoardNo() {
		return boardNo;
	}
	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
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
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getBank() {
		return bank;
	}
	public void setBank(String bank) {
		this.bank = bank;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public Timestamp getDueDate() {
		return dueDate;
	}
	public void setDueDate(Timestamp dueDate) {
		this.dueDate = dueDate;
	}
	public int getViewCount() {
		return viewCount;
	}
	public void setViewCount(int viewCount) {
		this.viewCount = viewCount;
	}
	public Timestamp getWriteDate() {
		return writeDate;
	}
	public void setWriteDate(Timestamp writeDate) {
		this.writeDate = writeDate;
	}
	public int getRecommend() {
		return recommend;
	}
	public void setRecommend(int recommend) {
		this.recommend = recommend;
	}
	public int getSumAmount() {
		return sumAmount;
	}
	public void setSumAmount(int sumAmount) {
		this.sumAmount = sumAmount;
	}
	public String getFormedDate() {
		long writeTime = this.writeDate.getTime();
		long dueTime = this.dueDate.getTime();

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		return sdf.format(writeTime) + " ~ " + sdf.format(dueTime);
	}
}
