package bcs.day03;

public class IfTest5 {

	public static void main(String[] args) {
		int a=8,b=45,c=15; //������ ���� �־���
		int temp=0; //temp�� ���ſ���
		
		//����)if���� �Ἥ ������ ���� �� ���� ū ���� temp�� ��� ����ϼ���.
		
		if(a>b && a>c) temp = a;
		else if(b>c) temp = b;
		else temp = c;      //&�� ���������
		
		if(a>b) {temp=a;}
		if(b>a) {temp=b;
		if(c>temp) {temp=c;}   //���α׷��� �귯���� ������� �ϴ� ���� ����ְ�
		 					  //�񱳸� ����ϸ鼭 ���� �������ִ� ���
	
		
		System.out.println(a+" "+b+" "+c);
		System.out.println("�ִ밪 = " + temp);
	}

}
}