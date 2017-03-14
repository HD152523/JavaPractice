/**
 * 
 */
package org.dimigo.basic;

/**
 * <pre>
 * org.dimigo.basic
 *  |_Operator
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 3. 14.
 * </pre>
 * @author : junho
 * @version : 1.0
 */
public class Operator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("<< 디미베네 연간 인건비 >>");
		int mon = 1700000;
		int man = 3;
		int store = 1500;
		System.out.println("월 평균 급여 : " + String.format("%,d", mon) + "원");
		System.out.println("점포 내 직원 수 : " + man+ "명");
		System.out.println("점포 수 : " + String.format("%,d", store)+ "개" + "\n\n");
		System.out.println("연간 인건비 : " + String.format("%, d" , ((long)mon * 12 * man * store)) + "원");

	}

}
