package bcs.test;

public class StringTest {

	public static void main(String[] args) {
		System.out.println("Hello "
				+ "World");
		System.out.println("Hello \nWorld");  //�������� n �ٹٲ�
		System.out.println("Hello \"World\""); //�������÷� ����ǥ�� �׳� ��ȣ�� �� ��������(escape���)
	    System.out.println("Hello 'world'"); //����ǥ �ϳ��� ������
	    System.out.println("Hello world".length()); //���鵵 �ν�����
	    System.out.println("Hello world ... bye".replace("world","class")); //.replace�� .����  ���ڿ����� world�� ã�Ƽ� class�� �ٲ�� ��¶�
	}

}
