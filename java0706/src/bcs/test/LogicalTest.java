package bcs.test;

public class LogicalTest {

	public static void main(String[] args) {
		int charCode = 'A';				//��繮�ڴ� �ƽ�Ű�ڵ尪�� ���´�
			

		if((charCode>=65)&(charCode<=90)){ //&�� && | �� || �ϳ�¥���� �ڿ����� ����� �Ѵ� �ٵ� �ΰ�¥���� �տ����� �����̸� �ڸ� ���� ����
			System.out.println("�빮�ڱ���");
		}	
			
		if((charCode>=97)&&(charCode<=122)) {
			System.out.println("�ҹ��ڱ���");
		}
		
		if(!(charCode<48) && !(charCode>57)) {  //48���� ũ�ų� ���� 57���� �۰ų� ����
			System.out.println("0~9���ڱ���");
		}
		
		int value = 6;
		
		if((value%2==0) | (value%3==0)) {
			System.out.println("2�Ǵ�3�� ����̱���");
			}
		if((value%2==0) || (value%3==0)){
			System.out.println("2�Ǵ� 3�� ����̱���");
		}
		
	}

}
