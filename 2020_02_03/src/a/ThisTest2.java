package a;

public class ThisTest2 {
	private String name;
	private int age;
	
	
	public ThisTest2() {
		System.out.println("���࿡");
		System.out.println("��� �����ڿ��� �������� ó���� ������");
		System.out.println("������ �ִٸ�");
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
