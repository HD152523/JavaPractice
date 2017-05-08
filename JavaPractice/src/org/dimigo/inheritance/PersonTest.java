package org.dimigo.inheritance;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person us = new Person("Tom");
		Korean kor = new Korean("홍길동");
		Japanese jp = new Japanese("다나카");
		Chinese ch = new Chinese("왕밍");
		
		System.out.println(us);
		System.out.println(kor);
		System.out.println(jp);
		System.out.println(ch);
		System.out.println();
		
		us.sayHello();
		kor.sayHello();
		jp.sayHello();
		ch.sayHello();
		System.out.println();
		
		us.sayBye();
		kor.sayBye();
		jp.sayBye();
		ch.sayBye();
		
	}

}
