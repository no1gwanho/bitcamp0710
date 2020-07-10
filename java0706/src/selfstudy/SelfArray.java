package selfstudy;
import java.util.Scanner;
public class SelfArray {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.println("원하는 팩토리얼값을 입력:   ");
		int fac = stdin.nextInt();
		int facValue = fac;
		for(;fac>1;fac--) {
			System.out.print(fac+"*");
			facValue *= fac;
		}
		System.out.print(1+"="+facValue);
		
		
		//while 문을 써서 바꿔보자
	}

}
