package selfstudy;

public class MultipleIfElse {

	public static void main(String[] args) {
		int jumsu = (int) (Math.random()*70)+30;

		System.out.println(jumsu);

		if (jumsu > 90)
			System.out.println("당신의 학점은 A입니다.");
		else if (jumsu > 80) {
			System.out.println("당신의 학점은 B입니다.");
		} else if (jumsu > 70) {
			System.out.println("당신의 학점은 C입니다.");
		} else if (jumsu > 60) {
			System.out.println("당신의 학점은 D입니다.");
		} else {
			System.out.println("당신의 학점은 F입니다."+"="+"\n재수강입니다");
		}

	}
}
