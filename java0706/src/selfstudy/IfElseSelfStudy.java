package selfstudy;

public class IfElseSelfStudy {

	public static void main(String[] args) {
		int jumsu = (int)(Math.random()*100);
		
		System.out.println("점수 :"+ jumsu);
		
		if(jumsu<60) {
			System.out.println("60보다 작은 점수입니다.");
		    System.out.println(("불합격하셨습니다."));
		}else {
			System.out.println(jumsu);
			System.out.println("60이상인 점수입니다.");
			System.out.println("합격 하셨습니다.");
		}
		
		
		
		
		
		

	}

}
