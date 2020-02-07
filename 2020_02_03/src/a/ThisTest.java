package a;

public class ThisTest {

	private String name;
	private int age;
	
	
	public ThisTest() {
		System.out.println("인스턴스 생성위치 : " + this.hashCode());		
	}
	
	public ThisTest(String name) {
		name = name; // 인스턴스에 넣어준게 아닌 매개변수 name에 넣어준 것이다.
	}
	
	public ThisTest(String n, int a) {
		name = n;
		age = a;
		System.out.println("인스턴스 생성위치 : " + this.hashCode());
	}
	
	public void output() {
		System.out.println("output()을 호출한 인스턴스 위치 : " + this.hashCode() + "인스턴스의 age : "
				+ "" + age + " 이름 : " + name);
	}
}
