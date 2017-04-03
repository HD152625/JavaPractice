/**
 * 
 */
package org.dimigo.oop;

import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.oop
 *   |_ Question
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 4. 3.
 * </pre>
 *
 * @author		: LeeJungwoo
 * @version		: 1.0
 */
public class Question {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] questions={"1.가장 좋아하는 가수는?", "2.가장 좋아하는 배우는?", "3.가장 좋아하는 과목은?"};
		String[] answers={"트와이스", "박보영", "체육"};
		String c = "정답입니다!";
		String w = "틀렸습니다!";
		Scanner scanner = new Scanner(System.in);
		for (int i=0; i<3;i++) {
		System.out.println(questions[i]);
		if(answers[i].equals(scanner.nextLine()))
		System.out.println(c);
		else System.out.println(w);
		}
		System.out.println("<< 결과 출력 >>");	
		StringBuilder sb = new StringBuilder();
		for (int i=0;i<3;i++) {
			sb.append(questions[i]).append(" ").append(answers[i]).append("입니다.\n");
		
		}
		System.out.println(sb);
	}

}
