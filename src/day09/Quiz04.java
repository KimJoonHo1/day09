package day09;

import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("���� �Է��� �ּ��� : ");
		int num = scanner.nextInt();
		
		Quiz04Method qz = new Quiz04Method();
		qz.prime(num);
	}

}
