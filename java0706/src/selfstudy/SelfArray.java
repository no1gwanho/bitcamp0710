package selfstudy;
import java.util.Scanner;
public class SelfArray {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.println("���ϴ� ���丮���� �Է�:   ");
		int fac = stdin.nextInt();
		int facValue = fac;
		for(;fac>1;fac--) {
			System.out.print(fac+"*");
			facValue *= fac;
		}
		System.out.print(1+"="+facValue);
		
		
		//while ���� �Ἥ �ٲ㺸��
	}

}
