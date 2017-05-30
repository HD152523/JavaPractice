package org.dimigo.exception;

public class Movie {
	String title;
	int limitAge;
	
	public Movie(String title, int limitAge){
		this.title = title;
		this.limitAge = limitAge;
	}
	public String getTitle(){
		return title;
	}
	public int getLimitAge(){
		return limitAge;
	}
	public void buyTicket(int age) throws Exception{
		if(age < limitAge){
				throw new Exception(title + "는/은 " + limitAge +"세 이상 관람가입니다.");
			}
			if(age >= limitAge){
				throw new Exception(title + " 즐감하세요.");
			}	
	}
	
}
