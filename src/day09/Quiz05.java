package day09;

import java.util.Scanner;

public class Quiz05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("���� �Է��� �ּ��� : ");
		int num = scanner.nextInt();
		
		Quiz05Method qz = new Quiz05Method();
		qz.absolute(num);
	}

}
