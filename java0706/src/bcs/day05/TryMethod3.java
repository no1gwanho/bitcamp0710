package bcs.day05;

import java.util.Arrays;

public class TryMethod3 {

	// ����) ���� �����Ҵ� �ζǹ߻��⸦ �޼ҵ带 �Ἥ �����غ����� �մϴ�.
	// lottoInput���� Math.random()�� ����Ͽ� 6���� ���� �迭�� �����ϰ�,
	// lottoOutput���� �ش� �迭�� �Ű������� �޾� ������ ����ϵ��� �޼ҵ带 �ϼ��ϼ���.
	// ���������� 0709\answer\TryArray08a.java�� �����Ͻʽÿ�.

	public int[] lottoInput() {// ���ϰ�
		int[] data = new int[6];
		int j = (int) (Math.random() * 50);
		for (int i = 0; i < 6; i++) {
			data[i] = j;
		}
		return data;
	}

	public void lottoOutput(int[] b) { // �Ű�����
  
		for(int d:b)
			System.out.println(b);
			
		

	}// lottoOutput end

	public static void main(String[] args) {
		TryMethod3 my = new TryMethod3();
		int[] a = my.lottoInput();
		my.lottoOutput(a);

	}// main end

}// lottoInput end

// class end
