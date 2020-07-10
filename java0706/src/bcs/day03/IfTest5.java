package bcs.day03;

public class IfTest5 {

	public static void main(String[] args) {
		int a=8,b=45,c=15; //세개의 수가 주어짐
		int temp=0; //temp는 빈컵역할
		
		//문제)if문을 써서 세개의 숫자 중 제일 큰 수를 temp에 담아 출력하세요.
		
		if(a>b && a>c) temp = a;
		else if(b>c) temp = b;
		else temp = c;      //&를 사용했을때
		
		if(a>b) {temp=a;}
		if(b>a) {temp=b;
		if(c>temp) {temp=c;}   //프로그램이 흘러가는 순서대로 일단 값을 집어넣고
		 					  //비교를 계속하면서 값을 갱신해주는 방법
	
		
		System.out.println(a+" "+b+" "+c);
		System.out.println("최대값 = " + temp);
	}

}
}