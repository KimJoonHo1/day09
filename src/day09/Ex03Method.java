package day09;

import java.util.Scanner;

public class Ex03Method {
	public void sumFunc() {
		Scanner scanner = new Scanner(System.in);
		int num, su, sum;
		System.out.println("ù �� �Է�");
		num = scanner.nextInt();
		System.out.println("�� �� �Է�");
		su = scanner.nextInt();
		sum = num + su;
		System.out.println("�� �� : " + sum);
	}

}
