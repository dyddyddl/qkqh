package a;

public class ThisTest2 {
	private String name;
	private int age;
	
	
	public ThisTest2() {
		System.out.println("만약에");
		System.out.println("모든 생성자에서 공통으로 처리할 문장을");
		System.out.println("가지고 있다면");
		System.out.println("//////////////////////////");
		System.out.println("//////////////////////////");
		System.out.println("//////////////////////////");
	}
	
	public ThisTest2(String name, int age) {

		this.name = name;
		this.age = age;
	}

	public ThisTest2(String name) {
		System.out.println("//////////////////////////");
		System.out.println("//////////////////////////");
		System.out.println("//////////////////////////");
		this.name = name;
	}

	public ThisTest2(int age) {

		this.age = age;
	}
}
