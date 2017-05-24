package org.dimigo.interfaces;

public interface IDBManager{
	public static final String ORACLE_DATABASE = "ORACLE";
	public static final String SYBASE_DATABASE= "SYBASE";
	
	void insert();
	void search();
	void update();
	void delete();
	
	static IDBManager getDBObject(String database){
		if(ORACLE_DATABASE.equalsIgnoreCase(database)){
			return new OracleDB();
		}
		else if(SYBASE_DATABASE.equalsIgnoreCase(database)){
			return new SybaseDB();
		}
		else return null;
		
	}
	
	
}
