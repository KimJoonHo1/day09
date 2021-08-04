package day09;

public class Quiz04Method {
	public void prime(int num) {
		int result = 0;
		if(num == 2) {
			result = 1;
		} else {
			for(int i = 2; i<num; i++) {
				if(num % i == 0) {
					result = 1;
					break;
				}
			}
		}
		
		if(result == 0) {
			System.out.println("소수입니다.");
		} else {
			System.out.println("소수가 아닙니다.");
		}
	}

}
