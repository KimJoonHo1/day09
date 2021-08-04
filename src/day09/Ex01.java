package day09;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 class
		 - 사용자 정의 자료형(사용자가 만들고 싶은대로 만들어 사용하는 자료형)
		 - 재사용 가능
		 객체
		 - 변수를 객체라고 부름
		 - class 자료형으로 변수를 만드는 것
		 메소드
		 - 기능을 말함
		 - 보편적으로, 메소드 또는 함수라고 말함
		 - 메소드는 클래스 내부에서 정의하는 것을 말함
		 - 함수는 클래스 없이 독립적으로 사용하는 것
		 접근 제한자
		 - public : 외부, 내부의 접근을 허용
		 - private : 외부의 접근을 막고 내부만 허용
		 - protected : 상속받은 자식 또는 같은 패키지 허용
		 - default : 같은 패키지만 허용
		 */
		
		Ex01_Class ex = new Ex01_Class();
		ex.name = "안녕하세요";
		ex.age = 12345;
		System.out.println(ex.name);
	}

}
