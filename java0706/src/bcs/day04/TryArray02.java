package bcs.day04;
import java.util.Arrays;
public class TryArray02 {

	public static void main(String[] args) {
		
		//����2) lotto��� �̸��� ������ �迭(ũ��=6)�� �����Ͽ� 
		//for~each������ ���� ����ϰ�,
		//java.util.Arrays Ŭ������ parallelSort��� �޼ҵ带 Ȱ���Ͽ�
		//�迭�� ������ �� �Ŀ� �ٽ� for~each������ ���� ����Ͽ� �������� �����ĸ� ���� ������.
		//��: 25 33 45 27 9 12 (������) 
		//    9 12 25 27 33 45 (������)
		
		int[] lotto = new int[6];
			lotto [0] = 25;
			lotto [1] = 33;
			lotto [2] = 45;
			lotto [3] = 27;
			lotto [4] = 9;
			lotto [5] = 12;
		for(int i : lotto)
		{
			System.out.print(i+" ");
				Arrays.parallelSort(lotto);				//������������ �迭�� ���� ���ִ� �޼ҵ�
		}
		System.out.println();	
		for(int j : lotto) {
			System.out.print(j+" ");
			   
		   }
		  
		
		
		
		
		
		
		
		
	}//main end

}//class end
