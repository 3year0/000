package practice.variable;

import java.util.Scanner;

public class VariableParctice {

	public void method1() {
		//������ ����
		
		int inum = 100;
		double dnum = 234.567;
		char ch = 'A';
		String str = "Hello world";
		boolean bool = true;
		
		System.out.println("�ʱ�ȭ �� : "+ inum +" , " + dnum +" , " + ch + " , " + str + ", "+ bool);
		
		
		inum = 10000;
		dnum = 567.123456789;
		ch = 'B';
		str = "Welcome to Java";
		bool = false;

		
		System.out.println("�� ���� �� : "+ inum +" , " + dnum +" , " + ch + " , " + str + ", "+ bool);
		
		
	}
		public void method2() {
			
			Scanner sc = new Scanner(System.in);
			System.out.print("���� ������ :" );
			int rad = sc.nextInt();
			
			double pi = 3.14;
			
			//System.out.println("��������" + rad + "�� ���� �ѷ�: " + 2 * rad * pi  );
			//System.out.println("��������" + rad + "�� ���� ����: " + rad * rad * pi  );			
			
			
			
			System.out.printf("�������� %d�� ���� �ѷ� : %.1f\n" , rad, 2*rad*pi );
			System.out.printf("�������� %d�� ���� ���� : %.1f\n" , rad, rad*rad*pi );	
		}
			
			
			public void testFinal() {
				
			
			//�޼ҵ� ����
			//��� �׽�Ʈ
			
			int size;  //����
			final int SIZE;  //���
			
			SIZE = 10;
			size = 10;
			
			System.out.println("�ʱ�ȭ �� �� ���� ��");
			System.out.println("size �� :" + size);
			System.out.println("SIZE �� :" + SIZE);
			
			//SIZE = 20;
			size = 20;
			
			System.out.println("�ʱ�ȭ �� �� ���� ��");
			System.out.println("size �� :" + size);
			System.out.println("SIZE �� :" + SIZE);
			


			}
			
			public void testOverflow() {
				//���̴� �����÷ο� �׽�Ʈ
				System.out.println("byte�� �ִ밪 :" +Byte.MAX_VALUE);
				System.out.println("byte�� �ּҰ� :" +Byte.MIN_VALUE);
				
				
				byte bnum = 127;
				bnum += 1;
				System.out.println("byte�� �ִ밪 +1 : " + bnum);
				
				
				
				bnum= -128;
				bnum -= 1;
				System.out.println("byte�� �ִ밪 -1 : " + bnum);
				
			
				
				int num1 = 100000;
				int num2 = 30000;
				//int�� ���� ���� ���� 21�� , 30���̶�� �� �����÷ο�
				//int result = num1 * num2;
				
				long result = (long)num1*num2;   //int 4byte��  long 8byte�� ���� ��ȯ 
				System.out.println("��� ��� : " + result);
				
				}
			
			
			public void testCasting() {
				
				//����ȯ �׽�Ʈ
				
				
			}
	
}

