package bcs.day05;

public class Method03 {

	
	public static int doSomething() {				//���ϰ��� int�� �ְ� �޼ҵ带 �ۼ��ϸ� return���� �ִ� ���� Ȯ���ϱ� ������ ���ܰ� �߻��Ѵ�.
		int result;
		result = 10*100;
		return result;
	} //�Ű������� ���� ��ȯ���� �ִ� ���
	
	
	
	
	
	
	
	public static void main(String[] args) {
		int x;
		x=doSomething();     //return���� �ִ� �޼ҵ�� �׻� ��򰡿� ��ƾ��Ѵ�
		System.out.println("x: "+x);	//���� ���� ����ض� 
	}

}
