package a;

public class ThisTest3 {
	private String name;
	private int age;
	
	
	public ThisTest3() {
		System.out.println("만약에");
		System.out.println("모든 생성자에서 공통으로 처리할 문장을");
		System.out.println("가지고 있다면");
		System.out.println("//////////////////////////");
		System.out.println("//////////////////////////");
		System.out.println("//////////////////////////");
	}
	
	public ThisTest3(String name, int age) {
		//this(name); // 생성자를 호출할때는 첫번째 줄만 사용해야 한다. 두개쓰면 에러남
		this(); // 생성자 호출
		
		
		// ThisTest3(); // 일반메소드였으면 이런형식이 가능함 but 생성자이기 때문에 안된다.
		this.name = name;
		this.age = age;
	}

	public ThisTest3(String name) {
		this();
	
		this.name = name;
	}

	public ThisTest3(int age) {
		this();
		this.age = age;
	}
}
