package bcs.test;

public class LogicalTest {

	public static void main(String[] args) {
		int charCode = 'A';				//모든문자는 아스키코드값을 갖는다
			

		if((charCode>=65)&(charCode<=90)){ //&와 && | 와 || 하나짜리는 뒤에까지 보기는 한다 근데 두개짜리는 앞에값이 거짓이면 뒤를 완전 무시
			System.out.println("대문자군요");
		}	
			
		if((charCode>=97)&&(charCode<=122)) {
			System.out.println("소문자군요");
		}
		
		if(!(charCode<48) && !(charCode>57)) {  //48보다 크거나 같고 57보다 작거나 같은
			System.out.println("0~9숫자군요");
		}
		
		int value = 6;
		
		if((value%2==0) | (value%3==0)) {
			System.out.println("2또는3의 배수이군요");
			}
		if((value%2==0) || (value%3==0)){
			System.out.println("2또는 3의 배수이군요");
		}
		
	}

}
