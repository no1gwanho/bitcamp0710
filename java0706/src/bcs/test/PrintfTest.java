package bcs.test;

public class PrintfTest {

	public static void main(String[] args) {
		int value = 123;
		System.out.printf("��ǰ�ǰ���:%d��\n", value); //���⼭ d�� 10���� ������ ���̰� 
        System.out.printf("��ǰ�� ����:%6d��\n", value);    //d�տ� ���� ���ڸ�ŭ �ڸ����� �����ض�(���� �����ؼ�)�տ� ����
		System.out.printf("��ǰ�� ����:%-6d��\n", value);	//d�տ� ���ڰ� �������� �ڸ����� �׸�ŭ �����ض�(���� �����ؼ�)�ڿ�����
		System.out.printf("��ǰ�� ����:%06d��\n", value);   //�տ�0���� ä���� 6�ڸ��� ������
		
		double area = 3.12159 * 10 * 10;
		System.out.printf("�������� %d�� ���� ����:%10.2f\n",10,area); //
		
		String name = "ȫ�浿";
		String job = "����";
		System.out.printf("%6d | %-10s | %10s\n", 1, name, job);
		
		
	}

}
