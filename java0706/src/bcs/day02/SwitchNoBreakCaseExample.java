package bcs.day02;

public class SwitchNoBreakCaseExample {
	public static void main(String[] args) {
		//8<= �� < 12(8+4) ������ ���� ���
		int time = (int)(Math.random()*4) + 8; 
		System.out.println("[����ð�: " + time + " ��]");
		
		switch(time) {									
			case 8:
				System.out.println("����մϴ�.");						//���� �극��ũ�� ���⶧���� �̰Ŵ� �ϳ� �ɸ��� �ڿ��� �� ��µ�
			case 9:
				System.out.println("ȸ�Ǹ� �մϴ�.");
			case 10:
				System.out.println("������ ���ϴ�.");
			default:
				System.out.println("�ܱ��� �����ϴ�.");
		}
	}
}
