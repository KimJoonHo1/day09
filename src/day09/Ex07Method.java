package day09;

import java.util.Scanner;

public class Ex07Method {
	public void reverse() {
		Scanner scanner = new Scanner(System.in);
		int su = 0, temp = 0;
		System.out.println("¼ö ÀÔ·Â");
		su =scanner.nextInt();
		while(true) {
			temp = su % 10;
			su = su / 10;
			System.out.print(temp);
			if(su == 0) {
				break;
			}
		}
	}
}
