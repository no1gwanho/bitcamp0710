package bcs.day05;

public class Method03 {

	
	public static int doSomething() {				//리턴값을 int로 주고 메소드를 작성하면 return값이 있는 것을 확인하기 전까지 예외가 발생한다.
		int result;
		result = 10*100;
		return result;
	} //매개변수는 없고 반환값이 있는 경우
	
	
	
	
	
	
	
	public static void main(String[] args) {
		int x;
		x=doSomething();     //return값이 있는 메소드는 항상 어딘가에 담아야한다
		System.out.println("x: "+x);	//받은 값을 출력해라 
	}

}
