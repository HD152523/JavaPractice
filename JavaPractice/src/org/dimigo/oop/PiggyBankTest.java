package org.dimigo.oop;

public class PiggyBankTest {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FamilyMember[] mem = {
				new FamilyMember("아빠"),
				new FamilyMember("엄마"),
				new FamilyMember("나"),
				new FamilyMember("남동생"),
		};
		int []money = {10000,5000,2000,1000};
		
		FamilyMember.printMemberCnt();
		for(int i=0;i<mem.length;i++){
			PiggyBank.putMoney(mem[i] , money[i]);
		};
		PiggyBank.printBalance();
		PiggyBank.putMoney(mem[2], 1000);
		PiggyBank.printBalance();
	}

}
