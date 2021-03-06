/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *   |_ iPhone
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 5. 16.
 * </pre>
 *
 * @author		: LeeJungwoo
 * @version		: 1.0
 */
public class iPhone extends SmartPhone {
	public iPhone(){
		
	}
	public iPhone(String model, String company, int price){
		super(model, company, price);
	}
	
	public void pay(){
		System.out.println("애플 페이로 결제합니다");
	}
	public void useAirDrop(){
		System.out.println("AirDrop 기능을 사용합니다.");
	}
}
