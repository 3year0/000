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
				boolean bool = true;
				//bool = 1;  �� ������ ���� ���� �Ұ���
				
				
				//char ->int     �ڵ� ����ȯ 
				int num = 'A';
				System.out.println("num : " + num);
				
				
				//char�� ������ ���� ���� (���ڿ� �ش��ϴ� �����ڵ� ����)
				char ch = 66;
				System.out.println("ch :" +ch);
				//ch = -66; //������ �Ұ���
				
				
				//int > char ���� ����ȯ
				char ch2 = (char)num;  
				System.out.println("ch2 : " +ch2 );
			}
			
			public void testCasting2() {
				//int ,long �� ����
				int inum = 4;
				long lnum = 8L;
				
				//int ���  // �ᱹ long���� ��ȯ�Ǽ� ������ �߻�
				int isum = (int)(inum + lnum);
				isum = inum +(int)lnum;
				System.out.println("isum : " + isum );
				
				//long ���
				long lsum = inum +lnum;
				System.out.println("lsum : " +lsum );
				
				//byte, short  *1byte,2byte       �������� int ǥ��
				
				byte bnum = 1;
				short snum = 2;
				
				int sum1 = bnum + snum;
				System.out.println("sum1 : " +sum1 );
				
				
				//byte or short�� ����� ��� ���� ���� ����ȯ
			
				short sum2 = (short)(bnum + snum);   // short�� ������ ��ȯ ������ ���
				System.out.println("sum2 : " +sum2 );
			}
			
			
			public void testDataLoss() {
				//������ �ս� �׽�Ʈ
				
			    //���� > �Ǽ�
				
				long lnum = 100;
				float fnum = lnum;
				System.out.println(" fnum : " +fnum);  //long�� 8byte  float�� 4byte�̳� ������ �� �о� ����
				
				//�Ǽ� > ����
				
				double dnum = 10.5;
				int inum = (int)dnum;  // 8byte double  int 4byte ���� �ڷ��� �ȿ� ���� ��ȯ�ؼ� ������ �ս� �߻�
				System.out.println("inum : " +inum );		
				
				//���̴� �ս� ���� ���
				int num = 250;
				System.out.println("num : " + num );
				
				byte bnum = (byte)num;
				System.out.println("bnum : " +bnum );
				
			}
			
			public void metbod3() {
				//���� �� ���� �л��� Ű�� �Ǽ��� �Է� , Ű�� ����� ������ ���
				
				
				
				//double height1;
				//double height2;
				//double height3;
				
				
				Scanner sc = new Scanner(System.in);
				System.out.print("ù ��° �л��� Ű  : " );
				double height1 = sc.nextDouble();
				
				System.out.print("�� ��° �л��� Ű  : " );
				double height2 = sc.nextDouble();

				System.out.print("�� ��° �л��� Ű  : " );
				double height3 = sc.nextDouble();
				
				int avg = (int)( height1 + height2 + height3 ) / 3;   //���� ����ȯ���� �Ǽ����� ��հ��� ������ �ٲ�
				System.out.print("Ű�� ���  : " + avg);
			}
			
			public void metbod4() {
				
				//���� Ű���� ����5�� ���ڿ� �Է� ������ �����ڵ带 ���
				
			
				Scanner sc = new Scanner(System.in);
				//���ڿ� Apple�� �Է� �޾ƾ� ��
				System.out.print("���ڿ� �Է� : ");
				String str = sc.nextLine();
				
				// ������ �����ڵ带 ��� 
				//char ch1 = str.charAt(0);
				//int num   = ch1;
				//System.out.println( ch1+ " : " + num  );
				

				//char ch2 = str.charAt(1);
				//int num2   = ch2;
				//System.out.println( ch2+" : " +num2 );
			
				
				//char ch3 = str.charAt(2);
				//int num3   = ch3;
				//System.out.println( ch3+ " : " +num3);
				
				
				//char ch4 = str.charAt(3);
				//int num4   = ch4;
				//System.out.println( ch4+ " : " +num4);
				
				
				//char ch5 = str.charAt(4);
				//int num5  = ch5;
				//System.out.print( ch5+" : "+ num5 );
				
						
			//�ѹ��� ���
				System.out.println( str.charAt(0) + " : " + (int)str.charAt(0));
				System.out.println( str.charAt(1) + " : " + (int)str.charAt(1));
				System.out.println( str.charAt(2) + " : " + (int)str.charAt(2));
				System.out.println( str.charAt(3) + " : " + (int)str.charAt(3));
				System.out.println( str.charAt(4) + " : " + (int)str.charAt(4));
				

				
				
			}
			
	
}

