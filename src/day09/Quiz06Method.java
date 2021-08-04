package day09;

import java.util.Scanner;

public class Quiz06Method {
	public int read() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("수를 입력해 주세요 : ");
		int num = scanner.nextInt();
		return num;
	}
	
	public void quizMain() {
		int num = read();
		String revers = revers(num);
		System.out.println(revers);
	}
	
	public String revers(int num) {
		String revers = "";
		while(true) {
			int temp = num % 10;
			num = num / 10;
			revers += temp;
			if(num == 0) {
				break;
			}
		}
		return revers;
	}
}
