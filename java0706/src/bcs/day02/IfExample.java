package bcs.day02;

public class IfExample {
	public static void main(String[] args) {
		int score = 93;
		
		if(score>=90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A 입니다.");
		}
		
		if(score< 90) 
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("등급은 B 입니다.");   //블럭으로 묶여있지않으면 그다음으로 상관없는 다음줄을 실행해버릴 수 있음
	}
}
