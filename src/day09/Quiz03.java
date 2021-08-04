package day09;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("수를 입력해 주세요 : ");
		int num = scanner.nextInt();
		
		Quiz03Method qz = new Quiz03Method();
		int result = qz.check_3(num);
		if(result == 1) {
			System.out.println("3의 배수임");
			System.out.println(num);
		} else {
			System.out.println("3의 배수가 아님");
		}
	}

}
