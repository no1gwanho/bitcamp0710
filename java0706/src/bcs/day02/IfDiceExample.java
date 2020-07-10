package bcs.day02;

public class IfDiceExample {
	public static void main(String[] args) {
		int num = (int)(Math.random()*6) + 1;
		
		switch(num)	{
		case 1: 									//비교할 값은 case다음에 써줌 만약에 num자리에 들어간게 숫자면 case뒤에 숫자쓰면 되는데 문자나 문자열은 또 case뒤에 다르게 넣어줘야함
		    System.out.println("1번이 나왔습니다.");
		    break;
		case 2:
			System.out.println("2번이 나왔습니다.");
			break;
		case 3:
		  	System.out.println("3번이 나왔습니다.");
		  	break;
		case 4:
			System.out.println("4번이 나왔습니다.");
			break;
		case 5:
			System.out.println("5번이 나왔습니다.");
			break;
		case 6:
		System.out.println("6번이 나왔습니다.");
		break;
		}		
	}
}
		
	


/*
 * if(num==1) { System.out.println("1번이 나왔습니다."); } else if(num==2) {
 * System.out.println("2번이 나왔습니다."); } else if(num==3) {
 * System.out.println("3번이 나왔습니다."); } else if(num==4) {
 * System.out.println("4번이 나왔습니다."); } else if(num==5) {
 * System.out.println("5번이 나왔습니다."); } else { System.out.println("6번이 나왔습니다.");
 * } } }
 */
