package a;

public class ThisTest3 {
	private String name;
	private int age;
	
	
	public ThisTest3() {
		System.out.println("���࿡");
		System.out.println("��� �����ڿ��� �������� ó���� ������");
		System.out.println("������ �ִٸ�");
		System.out.println("//////////////////////////");
		System.out.println("//////////////////////////");
		System.out.println("//////////////////////////");
	}
	
	public ThisTest3(String name, int age) {
		//this(name); // �����ڸ� ȣ���Ҷ��� ù��° �ٸ� ����ؾ� �Ѵ�. �ΰ����� ������
		this(); // ������ ȣ��
		
		
		// ThisTest3(); // �Ϲݸ޼ҵ忴���� �̷������� ������ but �������̱� ������ �ȵȴ�.
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
