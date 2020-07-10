package bcs.day04;

import java.util.Arrays;

public class ArrayNew {

	public static void main(String[] args) {
		
		int[]arr;  			//선언	
		arr = new int[5];  	//크기 지정
		
		int[]arr1 = new int[5];  //이름앞에 대괄호 ok
		int arr2[] = new int[3];	//이름뒤에 대괄호 ok
		int arr3[] = {1,2,3};	//값을 바로 넣으준 모양
		
		//int[4] arr4 = new int[5]; 크기는 우항에
		//int[] arr5 = new int[]; 크기를 지정해야함

		
		//초기화
		int [] arr6 = new int[] {2,3,4};// 크기 안주고 바로 값부터 넣기 ok
		//int[] arr7; arr = {4,5,6,7}; //크기를 지정하고 할당을 해야함!
		//int[] arr8 = new int[6] {1,2,3,4,5,6};//크기지정후 바로 값을 넣어도 에러
		
		//출력 for문 시작은 0으로 준다 인덱스가 0부터이므로
		for(int i = 0;i<arr6.length;i++){
			System.out.println("arr6["+i+"]="+arr6[i]);
		}
		
		
		//출력 for each문
		for(int temp:arr6) {				//일반 for문처럼 반복 길이를 지정안해줘도 하나씩 꺼내서 tmp에 집어 넣을 수 잇따.
			System.out.println(temp+" ");
			
			
		//출력3 Array.toString(배열이름)
		System.out.println(Arrays.toString(arr6));     //Arrays는 기본적으로 제공되는게 아니라서 import로 가져오는 건데 이거는 자동으로 가져왔음
														//얘는 array를 간단히 출력해주는 기능임
		
		
		int[] data1, data2, data3;   	//정수형 배열이 동시에 3개가 선언이 된것임  
		int data4[], data5, data6;		//깜빡해서 이렇게 선언하면 data4만 배열이고 나머지는 기본형으로 선언이 돼버림
		
		data4 = new int[10];
		System.out.println(data4); 		//봐라 배열을 그냥 출력해버리면  어디에있는지 참조주소만 나옴
		System.out.println(data4[3]);   //봐라 초기화값이 0이라는 것을 볼 수 있다.
		
		// 배열 복사하기
		data1 = new int[] {2,3,4,5,6,7,54};
		data4 = data1;			//자~! 이거는 참조의 개념이다 복사와 참조 배웟듯이 하나의 값을 바꾸면 그것을 가져오는 나머지 것들에도 영향을준다
		
		data1[4]=33;
		System.out.println("data1:"+data1+" "+Arrays.toString(data1));   //Arrays.toString(배열이름)
		System.out.println("data4:"+data4+" "+Arrays.toString(data4));

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}
		
		
		
		
		
	}

}
