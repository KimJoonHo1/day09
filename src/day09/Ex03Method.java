package day09;

import java.util.Scanner;

public class Ex03Method {
	public void sumFunc() {
		Scanner scanner = new Scanner(System.in);
		int num, su, sum;
		System.out.println("첫 수 입력");
		num = scanner.nextInt();
		System.out.println("두 수 입력");
		su = scanner.nextInt();
		sum = num + su;
		System.out.println("두 합 : " + sum);
	}

}
