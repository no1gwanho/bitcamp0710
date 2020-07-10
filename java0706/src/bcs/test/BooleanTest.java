package bcs.test;

public class BooleanTest {

	public static void main(String[] args) {
		boolean stop = true;  				//대문자는 절대안됨
		if(!stop) {
			System.out.println("중지합니다."); //참이면 좌측 문장을 실행하고
		}else {								//거짓이면 좌측 문장을 실행해라
			System.out.println("시작합니다.");
		}
		
		

	}

}
