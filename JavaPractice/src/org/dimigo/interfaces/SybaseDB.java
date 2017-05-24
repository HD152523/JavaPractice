package org.dimigo.interfaces;

public class SybaseDB implements IDBManager{

	@Override
	public void insert() {
		// TODO Auto-generated method stub
		System.out.println("Sybase DB 저장");
	}

	@Override
	public void search() {
		// TODO Auto-generated method stub
		System.out.println("Sybase DB 조회");
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("Sybase DB 변경");
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		System.out.println("Sybase DB 삭제");
	}

}
