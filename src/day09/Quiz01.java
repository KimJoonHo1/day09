package day09;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("두 수를 입력해 주세요 : ");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		Quiz01Method qz = new Quiz01Method();
		qz.max(num1, num2);
		
	}

}
