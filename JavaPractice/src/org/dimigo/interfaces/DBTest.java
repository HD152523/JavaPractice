package org.dimigo.interfaces;

public class DBTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("<< 변경 전 >>");
		crud(IDBManager.getDBObject("sybase"));
		
		System.out.println("\n" + "<< 변경 후 >>");
		crud(IDBManager.getDBObject("oracle"));
	}
	
	public static void crud(IDBManager db){
		db.insert();
		db.search();
		db.update();
		db.delete();
	}

}
