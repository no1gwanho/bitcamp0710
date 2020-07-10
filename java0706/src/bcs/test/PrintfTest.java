package bcs.test;

public class PrintfTest {

	public static void main(String[] args) {
		int value = 123;
		System.out.printf("상품의가격:%d원\n", value); //여기서 d는 10진수 정수의 뜻이고 
        System.out.printf("상품의 가격:%6d원\n", value);    //d앞에 붙은 숫자만큼 자릿수를 마련해라(값을 포함해서)앞에 마련
		System.out.printf("상품의 가격:%-6d원\n", value);	//d앞에 숫자가 붙은것은 자릿수를 그만큼 마련해라(값을 포함해서)뒤에마련
		System.out.printf("상품의 가격:%06d원\n", value);   //앞에0으로 채워서 6자리로 만들어라
		
		double area = 3.12159 * 10 * 10;
		System.out.printf("반지름이 %d인 원의 넓이:%10.2f\n",10,area); //
		
		String name = "홍길동";
		String job = "도적";
		System.out.printf("%6d | %-10s | %10s\n", 1, name, job);
		
		
	}

}
