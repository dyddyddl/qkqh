package a;

public class Test1 {

	private int age; // Test1에서 인스턴스들의 공통으로 적용시켜 주소싶을때 static 사용
					 // 인스턴스가 만들어 져야지만 알수 있는 부분
					 // 클래스를 벗어났을때 private의 성격을 지닌다
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 메모리가 만들어지기 전에 가상머신에서 알고 있는 부분
		
		Test1 test1 = new Test1();
		test1.age = 10;
		
	}


}
