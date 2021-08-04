package day09;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("값을 입력해주세요 : ");
		int num1 = scanner.nextInt();
		Quiz02Method qz = new Quiz02Method();
		qz.odd_even(num1);
	}

}
