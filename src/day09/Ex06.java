package day09;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex06Method ex = new Ex06Method();
		ex.display();
		
		System.out.println("---- 메인 실행 ----");
		Scanner scanner = new Scanner(System.in);
		int n1, n2;
		System.out.println("두 수 입력");
		n1 = scanner.nextInt();
		n2 = scanner.nextInt();
		int sum = ex.test(n1, n2);
		ex.printSum(n1, n2, sum);
	}

}
