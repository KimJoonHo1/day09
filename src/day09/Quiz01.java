package day09;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("�� ���� �Է��� �ּ��� : ");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		Quiz01Method qz = new Quiz01Method();
		qz.max(num1, num2);
		
	}

}
