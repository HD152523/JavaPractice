package org.dimigo.oop;

import java.util.Scanner;

public class Question {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String []que = {"가수는", "배우는", "과목은"};
		String []res = {"빅뱅","원빈","응용 프로그래밍"};
		String ans;
		for(int i = 0;i<3;i++){
			System.out.printf("가장 좋아하는 %s?\n",que[i]);
			ans = sc.nextLine();
			if(res[i].equals(ans)){
				System.out.println("정답입니다!");
			}
			else {System.out.println("틀렸습니다!");}
		}
		System.out.println("<<결과 출력>>");
		for(int i = 0;i<3;i++){
			System.out.printf("가장 좋아하는 %s? %s입니다.\n", que[i], res[i]);
		}
	}

}
