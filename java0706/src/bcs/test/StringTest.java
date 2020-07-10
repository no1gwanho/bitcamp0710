package bcs.test;

public class StringTest {

	public static void main(String[] args) {
		System.out.println("Hello "
				+ "World");
		System.out.println("Hello \nWorld");  //역슬래시 n 줄바꿈
		System.out.println("Hello \"World\""); //역슬래시로 따옴표를 그냥 기호로 쓸 수로있음(escape기능)
	    System.out.println("Hello 'world'"); //따옴표 하나는 괜찮음
	    System.out.println("Hello world".length()); //공백도 인식을함
	    System.out.println("Hello world ... bye".replace("world","class")); //.replace는 .앞의  문자열에서 world를 찾아서 class로 바꿔라 라는뜻
	}

}
