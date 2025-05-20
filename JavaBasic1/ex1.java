package ch2;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("원화를 입력하세요(단위 원) >> 예: ");
		double won = scanner.nextDouble();
		double doller = won/1200;
		
		System.out.print(won +"원은"+"$"+doller+"입니다");
		
		scanner.close();

	}

}
