package array;

import java.util.Scanner;

public class arrayTest {
	
	public static void main(String[] args) {
		
		int[] nums = new int[5];
		String[] name = new String[5];		
		int[] kor = new int[5];
		int[] eng = new int[5];
		int[] math = new int[5];		
		int[] total = new int[5];
		int count = 1;
		
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<5; i++) {
						
			nums[i]= count++;
			System.out.println("�̸��� �Է��Ͻÿ� : ");
			name[i]= sc.next();
			System.out.println("�������� �Է��Ͻÿ� : ");
			kor[i]= sc.nextInt();
			System.out.println("�������� �Է��Ͻÿ� : ");
			eng[i]= sc.nextInt();
			System.out.println("�������� �Է��Ͻÿ� : ");
			math[i]= sc.nextInt();		
			total[i]=kor[i]+eng[i]+math[i];			
		}
		for(int i=0; i<5; i++) {
		System.out.print(nums[i]+" ");			
		System.out.print(name[i]+" ");		
		System.out.print(kor[i]+" ");			
		System.out.print(eng[i]+" ");		
		System.out.print(math[i]+" ");		
		System.out.print(total[i]+" ");
		System.out.println();
		}
		
	}
}
