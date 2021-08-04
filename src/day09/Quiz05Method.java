package day09;

public class Quiz05Method {
	public void absolute(int num) {
		int abs = num;
		if(num < 0) {
			abs = num * -1;
		}
		System.out.println(num + "ÀÇ Àý´ñ°ª : " + abs);
	}
}
