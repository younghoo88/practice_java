package chap1.date;

import java.util.Date;

public class Game {
	private final Date startTime;
	private final Date endTime;
	
	public Game(Date startTime, Date endTime) {
		this.startTime = startTime;
		this.endTime = new Date(endTime.getTime());
	}
	
	public Date getStartTime() {
		return this.startTime;
	}
	
	public Date getEndTime() {
		return new Date(endTime.getTime());
	}
	
	public void showTime() {
		System.out.println("startTime : " + this.startTime);
		System.out.println("endTime : " + new Date(endTime.getTime()));
	}

}
