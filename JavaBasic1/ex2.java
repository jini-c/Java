package ch2;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("금액을 입력하시오.>>");
		int money = scanner.nextInt();
		int oMan = money/50000;
		money = money%50000;
		
		int man  = money/10000;
		money = money % 10000;
		
		int chun = money /1000;
		money = money% 1000;
		
		int ohBaek = money/500;
		money = money%500;
		
		int baek = money/100;
		money = money%100;
		
		int ohSip = money/50;
		money = money%50;
		
		int sip = money/ 10;
		money = money%10;
		
		int il=money;
		
		System.out.println("오만원권 "+oMan+"매");
		System.out.println("만원권 "+man+"매");
		System.out.println("천원권 "+chun+"매");
		System.out.println("백원 "+baek+"개");
		System.out.println("오십원 "+ohSip+"개");
		System.out.println("십원 "+sip+"개");
		System.out.println("일원 "+il+"개");
		
		scanner.close();

	}

}
