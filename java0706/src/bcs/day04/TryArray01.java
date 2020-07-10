package bcs.day04;
import java.util.Arrays;
public class TryArray01 {

	public static void main(String[] args) {
		
		//문제1) city라는 이름의 크기 5짜리 배열을 생성하여, 
		//도시 이름으로 값을 넣어주고 (예: "서울", "도쿄", "베이징", "뉴욕", "하노이") 
		//for문과 for~each문을 각각 사용하여 배열을 출력하세요. 
		String[] city = new String[] {"서울","도쿄","베이징","뉴욕","하노이"};
		  
		//for-each문을 이용한 방법
		  for(String name:city) {
			  System.out.print("["+name+"]");
		
			  
			  
		//메소드를 이용한 방법    	  
		String[] capital = new String[5];
			 capital [0] = "서울";			//주의할 점은 배열의 값을 넣어줄 때 중괄호를 쓰게 되면 배열안에 배열을 또넣어주는 꼴이 된다는 것이다.
			 capital [1] = "도쿄";			// 괄호를 쓰지 않고 해당 데이터 타입에 해당하는 값만 집어 넣어주면 됨
			 capital [2] = "베이징";
			 capital [3] = "뉴욕";
			 capital [4] = "하노이";
		
		System.out.println(Arrays.toString(capital));
		
		
		
		
		//일반 for문을 사용했을때
		String[] wow = new String[5];
			for(int i=0;i<5;i++) {
				System.out.print(wow[i]);
			}
		
		
		//배열 내용을 바로 사용했을때 
		String[] practice = {"서울","도쿄","베이징","뉴욕","하노이"};
		   
		  
		  
		  
		}
		
		
		
		
		
		
		
		
	}//main end

}//class end
