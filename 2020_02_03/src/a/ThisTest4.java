package a;

public class ThisTest4 {
	private String name;
	private int age;	
	
	public ThisTest4() {
		super(); // �ݵ�� ù��°�ٿ��� ȣ���ؾ� �Ѵ�.
		System.out.println("���࿡");
		System.out.println("��� �����ڿ��� �������� ó���� ������");
		System.out.println("������ �ִٸ�");
		System.out.println("//////////////////////////");
		System.out.println("//////////////////////////");
		System.out.println("//////////////////////////");
	
	}
	
	public ThisTest4(String name, int age) {
		//this(name); // �����ڸ� ȣ���Ҷ��� ù��° �ٸ� ����ؾ� �Ѵ�. �ΰ����� ������
		//super(); //���߿� �ϳ��� ��밡���ϴ�.
		this(); // ������ ȣ�� // �����ڿ��� �Ϲݸ޼ҵ带 ȣ���ϵ��� �����. 
		                   // �ߺ����� ������ ������ �ڵ� ������ ���´ٸ� �޼ҵ�ȭ ���Ѽ� ȣ���ؼ� ����ϵ��� �����
		
		
		// ThisTest3(); // �Ϲݸ޼ҵ忴���� �̷������� ������ but �������̱� ������ �ȵȴ�.
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
