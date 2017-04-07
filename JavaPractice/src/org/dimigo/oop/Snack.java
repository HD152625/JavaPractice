/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   |_ Snack
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 4. 6.
 * </pre>
 *
 * @author		: LeeJungwoo
 * @version		: 1.0
 */
public class Snack {
		private String name;
		private String company;
		private int price;
		private int number;

		public Snack(String name, String company, int price, int number){
			this.name = name;
			this.company = company;
			this.price = price;
			this.number = number;
		}
		
		public void setName(String newName) {
		      company = newName;
		   }
		   public String getName() {
		      return name;
		   }
		   
		   public void setCompany(String newCompany) {
		      company = newCompany;
		   }
		   public String getCompany() {
		      return company;
		   }
		   public void setPrice(int newPrice) {
		      price = newPrice;
		   }
		   public int getPrice() {
		      return price;
		   }
		   public int getNumber() {
			   return number;
		   }
		   public void setNumber(int number) {
			   this.number = number;
		   }
		   public int calcPrice() {
			   return price * number;
		   }
		   public String toString() {
			   return String.format("이름 : %s\n", name)+String.format("제조사 : %s\n", company)+
					   String.format("가격 : %,d원\n", price)+String.format("개수 : %d개\n", number);
		   }
		 
}
