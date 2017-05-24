package org.dimigo.interfaces;

public interface DBTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			IDBManager s = IDBManager.getDBObject(SYBASE_DATABASE);
			crud(s);
			IDBManager o = IDBManager.getDBObject(ORACLE_DATABASE);
	}

}
