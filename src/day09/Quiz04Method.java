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
			System.out.println("�Ҽ��Դϴ�.");
		} else {
			System.out.println("�Ҽ��� �ƴմϴ�.");
		}
	}

}
