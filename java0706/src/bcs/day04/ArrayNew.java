package bcs.day04;

import java.util.Arrays;

public class ArrayNew {

	public static void main(String[] args) {
		
		int[]arr;  			//����	
		arr = new int[5];  	//ũ�� ����
		
		int[]arr1 = new int[5];  //�̸��տ� ���ȣ ok
		int arr2[] = new int[3];	//�̸��ڿ� ���ȣ ok
		int arr3[] = {1,2,3};	//���� �ٷ� ������ ���
		
		//int[4] arr4 = new int[5]; ũ��� ���׿�
		//int[] arr5 = new int[]; ũ�⸦ �����ؾ���

		
		//�ʱ�ȭ
		int [] arr6 = new int[] {2,3,4};// ũ�� ���ְ� �ٷ� ������ �ֱ� ok
		//int[] arr7; arr = {4,5,6,7}; //ũ�⸦ �����ϰ� �Ҵ��� �ؾ���!
		//int[] arr8 = new int[6] {1,2,3,4,5,6};//ũ�������� �ٷ� ���� �־ ����
		
		//��� for�� ������ 0���� �ش� �ε����� 0�����̹Ƿ�
		for(int i = 0;i<arr6.length;i++){
			System.out.println("arr6["+i+"]="+arr6[i]);
		}
		
		
		//��� for each��
		for(int temp:arr6) {				//�Ϲ� for��ó�� �ݺ� ���̸� ���������൵ �ϳ��� ������ tmp�� ���� ���� �� �յ�.
			System.out.println(temp+" ");
			
			
		//���3 Array.toString(�迭�̸�)
		System.out.println(Arrays.toString(arr6));     //Arrays�� �⺻������ �����Ǵ°� �ƴ϶� import�� �������� �ǵ� �̰Ŵ� �ڵ����� ��������
														//��� array�� ������ ������ִ� �����
		
		
		int[] data1, data2, data3;   	//������ �迭�� ���ÿ� 3���� ������ �Ȱ���  
		int data4[], data5, data6;		//�����ؼ� �̷��� �����ϸ� data4�� �迭�̰� �������� �⺻������ ������ �Ź���
		
		data4 = new int[10];
		System.out.println(data4); 		//���� �迭�� �׳� ����ع�����  ����ִ��� �����ּҸ� ����
		System.out.println(data4[3]);   //���� �ʱ�ȭ���� 0�̶�� ���� �� �� �ִ�.
		
		// �迭 �����ϱ�
		data1 = new int[] {2,3,4,5,6,7,54};
		data4 = data1;			//��~! �̰Ŵ� ������ �����̴� ����� ���� ��m���� �ϳ��� ���� �ٲٸ� �װ��� �������� ������ �͵鿡�� �������ش�
		
		data1[4]=33;
		System.out.println("data1:"+data1+" "+Arrays.toString(data1));   //Arrays.toString(�迭�̸�)
		System.out.println("data4:"+data4+" "+Arrays.toString(data4));

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}
		
		
		
		
		
	}

}
