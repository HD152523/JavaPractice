package org.dimigo.collection;

public class Music {
	String title;
	String singer;
	
	public Music(String title, String singer){
		this.title = title;
		this.singer = singer;
	}
	public String getTitle(){
		return title;
	}
	public void setTitle(String title){
		this.title = title;
	}
	public String getSinger(){
		return singer;
	}
	public void setSinger(String singer){
		this.singer = singer;
	}
	public String toString(){
		return title + " (" + singer + ")";
	}
	
}


