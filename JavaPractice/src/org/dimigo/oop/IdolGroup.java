/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   |_ IdolGroup
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 4. 10.
 * </pre>
 *
 * @author		: LeeJungwoo
 * @version		: 1.0
 */
public class IdolGroup {
	
	public static void main(String[] args) {
		String[] str = 	{"리쌍","빅뱅", "걸스데이"};
		String[][] str2 = {
				{"개리", "길"}, {"GD", "태양", "대성", "탑", "승리"},
				{"민아", "혜리", "유라", "소진"}
		};
		for (int i=0; i<str.length; i++){
		System.out.println("<<"+str[i]+">>");
			for (int j=0; j<str2[i].length;j++){
				System.out.println(str2[i][j]);
			}
			System.out.println();

		}
	}

}
