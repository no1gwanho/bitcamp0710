package selfstudy;

public class MultipleIfElse {

	public static void main(String[] args) {
		int jumsu = (int) (Math.random()*70)+30;

		System.out.println(jumsu);

		if (jumsu > 90)
			System.out.println("����� ������ A�Դϴ�.");
		else if (jumsu > 80) {
			System.out.println("����� ������ B�Դϴ�.");
		} else if (jumsu > 70) {
			System.out.println("����� ������ C�Դϴ�.");
		} else if (jumsu > 60) {
			System.out.println("����� ������ D�Դϴ�.");
		} else {
			System.out.println("����� ������ F�Դϴ�."+"="+"\n������Դϴ�");
		}

	}
}
