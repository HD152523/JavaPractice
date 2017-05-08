package org.dimigo.inheritance;

public class Korean extends Person {
	private String name;
	public Korean(String name){
		this.name = name;
	}
	public void sayHello(){
		System.out.println("안녕하세요");
	}
	public void sayBye(){
		System.out.println("안녕히 계세요");
	}
	public String toString(){
		return "저는 한국사람 " + name + "입니다.";		
	}
}
