package bcs.day04;
import java.util.Arrays;
public class TryArray01 {

	public static void main(String[] args) {
		
		//����1) city��� �̸��� ũ�� 5¥�� �迭�� �����Ͽ�, 
		//���� �̸����� ���� �־��ְ� (��: "����", "����", "����¡", "����", "�ϳ���") 
		//for���� for~each���� ���� ����Ͽ� �迭�� ����ϼ���. 
		String[] city = new String[] {"����","����","����¡","����","�ϳ���"};
		  
		//for-each���� �̿��� ���
		  for(String name:city) {
			  System.out.print("["+name+"]");
		
			  
			  
		//�޼ҵ带 �̿��� ���    	  
		String[] capital = new String[5];
			 capital [0] = "����";			//������ ���� �迭�� ���� �־��� �� �߰�ȣ�� ���� �Ǹ� �迭�ȿ� �迭�� �ǳ־��ִ� ���� �ȴٴ� ���̴�.
			 capital [1] = "����";			// ��ȣ�� ���� �ʰ� �ش� ������ Ÿ�Կ� �ش��ϴ� ���� ���� �־��ָ� ��
			 capital [2] = "����¡";
			 capital [3] = "����";
			 capital [4] = "�ϳ���";
		
		System.out.println(Arrays.toString(capital));
		
		
		
		
		//�Ϲ� for���� ���������
		String[] wow = new String[5];
			for(int i=0;i<5;i++) {
				System.out.print(wow[i]);
			}
		
		
		//�迭 ������ �ٷ� ��������� 
		String[] practice = {"����","����","����¡","����","�ϳ���"};
		   
		  
		  
		  
		}
		
		
		
		
		
		
		
		
	}//main end

}//class end
