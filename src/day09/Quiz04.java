package day09;

import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("수를 입력해 주세요 : ");
		int num = scanner.nextInt();
		
		Quiz04Method qz = new Quiz04Method();
		qz.prime(num);
	}

}
