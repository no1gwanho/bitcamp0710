package bcs.day02;

public class IfTest {

	public static void main(String[] args) {
		// kor: 국어성적, eng: 영어성적, sum: 성적합계, avg: 성적평균
		int kor = 90, eng = 85, sum = 0;
		double avg = 0.0;
		String name = "홍길동";
		// 문제 1. 성적의 합과 평균을 구하는 식을 완성하시오.
		sum = (kor + eng);
		avg = (double) sum / 2;

		// 문제2. if문을 사용해서 평균이 70점 이상이면 '축합격', 0~69점은 '재시험'이라는 안내 메시지를
		// 결과에 출력하세요.
		String msg = "안내문";     /*초기 변수 선언과 변수 할당은 다른개념임
								 이런 변수다라고 선언을 해주고 그 변수가 어떻다는것은
								 값을 지정해주는 것은 밑에서 */	
	
		if(avg >= 70)
			msg = "축합격";
		else 
			msg = "불합격";
		
		msg = avg>=70?"축합격":"재시험"; //삼항 연산자는 결과값을 항상 변수에 담아줘야함				
				
		System.out.println("이름=" + name);
		System.out.println("합계=" + sum);
		System.out.println("평균=" + avg);
		System.out.println("결과=" + msg); // 합격, 불합격 안내 메시지 출력

	}

}
