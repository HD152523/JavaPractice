package org.dimigo.oop;

public class IdolGroup {

	
	public void printArr(String[] group, String[][] name){
		for(int i = 0;i<group.length;i++){
			System.out.print("<<"+ group[i] + ">>" + "\n");
			for(int j = 0;j<name[i].length;j++){
				System.out.println(name[i][j]);
			}
			System.out.println("");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IdolGroup obj = new IdolGroup();
		String[] groupName = {"빅뱅", "2NE1", "걸스데이"};
		String[][] memberName = {
				{"GD", "태양", "대성", "탑", "승리"},
				{"CL","산다라박","박봄", "민지"},
				{"유라", "혜리","소진", "민아"},
		};
		obj.printArr(groupName, memberName);
	}
}
