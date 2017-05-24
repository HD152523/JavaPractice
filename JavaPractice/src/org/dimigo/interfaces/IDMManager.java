package org.dimigo.interfaces;

public interface IDMManager{
	public static final String ORACLE_DATABASE = "ORACLE";
	public static final String SYBASE_DATABASE= "SYBASE";
	
	void insert();
	void search();
	void update();
	void delete();
	
	static IDMManager getDBObject(String db){
		if(db.equals(ORACLE_DATABASE)){
			return new OracleDB();
		}
		else if(db.equals(SYBASE_DATABASE)){
			return new SybaseDB();
		}
	}
	
	
}
