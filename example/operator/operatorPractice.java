package example.operator;

import java.util.Scanner;

public class operatorPractice {
	public void metbod1() {
		
		//Scanner sc = new Scanner(System.in);
		//int num1 = sc.nextInt();
		//System.out.print("int num1 =" + num1 );
		//int num2 = sc.nextInt();
		//System.out.print("num2 = "+ num2);
		//String str = sc.nextLine();
		//System.out.print("String str = "+ str);
		//num1 += 10;
		//System.out.print("num1 :"+ num1);
		
		
		int num1 = 10;   
		int num2 = 0;
		String str = "Hello";
		
		
		num1 += 20; //num1 = 30
		num2 += 10;  // num2 = 10
		num1 /= num2; // num1 = 3
		num2 *=num1; // num2 = 30
		str += num2; // str = Hello30
		num2 -= num1;// num2 =27
		
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		System.out.println("str : " + str);
		
		
		

}
	
	
	
	
	public void method2() {
		
	//���� 2 ���׿����� �ΰ��� ������ ¦Ȧ �Ǻ�
		Scanner sc = new Scanner(System.in);
		System.out.print("ù ��° ���� �Է� :");
		int num1 = sc.nextInt();
		
		System.out.print("�� ��° ���� �Է� :");
		int num2 = sc.nextInt();
		
		String result = (num1 % 2 == 0) && (num2 % 2 == 0) ? "�� �� ��� ¦���̴�" :
			            (num1 % 2 == 0) || (num2 % 2 == 0) ? "�ϳ��� Ȧ���̰� �ϳ��� ¦���̴�":
			            "�� �� ��� Ȧ���̴�.";
		
		System.out.println(result);
		
		
		
		
		
	
	}
	
	
	
	
	
	
	
	
	
	
	
}