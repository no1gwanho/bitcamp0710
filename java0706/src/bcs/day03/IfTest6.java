package bcs.day03;

public class IfTest6 {

	public static void main(String[] args) {
		//����) �Ʒ��� ���� ������ ���� �־����� ��, ���� ������� ��µǵ��� �ڵ带 �ϼ��ϼ���. 
		int a=8,b=32,c=6; //2 6 7 
		  if(a<b && a<c){ //a�� �����������
			  if(b<c) {System.out.println(a+" "+b+" "+c);} //abc  
			  else {System.out.println(a+" "+c+" "+b); } //acb
		  }else if(b<c){System.out.println(b+" "+c+" "+a);//b�� �����������
		    if(a<c){System.out.println(b+" "+a+" "+c);} 
		    else {System.out.println(b+" "+c+" "+a); } 
		  }else{ System.out.println(c+" "+b+" "+a);//c�� �����������
			if(a<b) {System.out.println(c+" "+a+" "+b);}
			else {System.out.println(c+" "+b+" "+a); 
		  }

	}

	}
}