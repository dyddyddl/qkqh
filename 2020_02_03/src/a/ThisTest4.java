package a;

public class ThisTest4 {
	private String name;
	private int age;	
	
	public ThisTest4() {
		super(); // 반드시 첫번째줄에서 호출해야 한다.
		System.out.println("만약에");
		System.out.println("모든 생성자에서 공통으로 처리할 문장을");
		System.out.println("가지고 있다면");
		System.out.println("//////////////////////////");
		System.out.println("//////////////////////////");
		System.out.println("//////////////////////////");
	
	}
	
	public ThisTest4(String name, int age) {
		//this(name); // 생성자를 호출할때는 첫번째 줄만 사용해야 한다. 두개쓰면 에러남
		//super(); //둘중에 하나만 사용가능하다.
		this(); // 생성자 호출 // 생성자에서 일반메소드를 호출하도록 만든다. 
		                   // 중복적인 로직을 가지는 코드 구문이 나온다면 메소드화 시켜서 호출해서 사용하도록 만든다
		
		
		// ThisTest3(); // 일반메소드였으면 이런형식이 가능함 but 생성자이기 때문에 안된다.
		this.name = name;
		this.age = age;
	}

	public ThisTest4(String name) {
		this();	
		this.name = name;
	}

	public ThisTest4(int age) {
		this();
		this.age = age;
	}
}
