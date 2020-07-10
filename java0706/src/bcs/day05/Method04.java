package bcs.day05;
import java.util.Scanner;


public class Method04 {

	static int add(int x, int y) {
		int result;
		result = x+y;
		return result;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 두개를 입력하세요:  ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = add(a,b);
		System.out.println(a+"+"+b+"="+c);
		sc.close();				//스캐너를 쓰면 항상 닫아줘야함  아니면 자원을 계속물고있음
		
		
			
		
		}
				
		

	}


