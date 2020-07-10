package bcs.day02;

public class CharOperationExample {
	public static void main(String[] args) {
		char c1 = 'A' + 1;
		char c2 = 'A';
		char c3 = (char)(c2 + 1);    //int보다 작은 형은 연산을 한번하면 결과값을 int형으로 바꿔버려서 계산을 했을때 결과값이 int가 되서 형변환을 char로 따로해주는 것이다. 
		
				
		System.out.println("c1: " + c1);
		System.out.println("c2: " + c2);
		System.out.println("c3: " + c3);
	}
}
