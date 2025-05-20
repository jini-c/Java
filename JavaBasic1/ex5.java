package ch2;

import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("원의 중심과 반지름을 입력하세요 >> ");
		double cx = scanner.nextDouble();
		double cy = scanner.nextDouble();
		double r = scanner.nextDouble();
		
		System.out.print("점을 입력하세요 >> ");
		double px = scanner.nextDouble();
		double py = scanner.nextDouble();
		
		double dx= px - cx;
		double dy = py - cy;
		
		double distanceSquared = dx*dx + dy*dy;
		double radiusSquared = r*r;
		
		if (distanceSquared <= radiusSquared ) {
			System.out.println("점 (" + px + ", " + py + ")은 원 안에 있습니다.");
        } else {
            System.out.println("점 (" + px + ", " + py + ")은 원 밖에 있습니다.");
        }
		scanner.close();
		 
	}

}
