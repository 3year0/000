package example.operator;

import java.util.Scanner;

public class operator {

	
		public void operatorTest() {
		 
		//���� ������
			
			int a = 5;
			int b = 10;
			
			int c = (++a) + b; //a= 6, b= 10 , c = 16
			int d = c / a; // 16 /  6 = d= 2
			int e = c % a; // 16 % 6 = e= 4
			int f = e++; // f = 4, e= 5
			int g = (--b) + (d--);  // b= 9 , d= 1 , g = 11 
			int h = 2; 
			h *= e;  // 10
			
		    System.out.println("a :"  + a);
		    System.out.println("b :"  + b);
		    System.out.println("c :"  + c);
		    System.out.println("d :"  + d);
		    System.out.println("e :"  + e);
		    System.out.println("f :"  + f);
		    System.out.println("g :"  + g);
		    System.out.println("h :"  + h);
		    
	 
		}
		
		public void operatorTest2() {
			
			//��� ������ %
			//Ȧ�� ¦�� �Ǻ��� ��� 
			//¦�� -> �� % 2 ==0
			//Ȧ�� -> �� % 2 ==1
			
			// n�� ��� -> �� % n ==0 
			int num1 = 10;
			int num2 = 3;
			System.out.println("num1 % num2 =" + (num1 % num2));
			
			//�� ������
			//1�� 100������ ��?
			// 1 < �� < 100(x)
			//���� > 1 && ���� <100 (0)   and  or
			Scanner sc = new Scanner(System.in);
	
			System.out.print("���� �Է� : ");
			int inum = sc.nextInt();
			
			System.out.println("1�� 100������ ��? : " + (inum > 1 && inum < 100 ));
			
			//���� ���� ������
			// ��� + ���� �����ڰ� �����ִ�
			//�ڵ尡 �����ϸ� �޸𸮿� ���� ������ �����Ͽ� ����ӵ��� ����
			
			int inum1 = 5;
			inum1 += 10;
			
			System.out.println("inum1 : " + inum1);

			inum1 -= 10;
			
			System.out.println("inum1 : " + inum1);
			
			
            inum1 *= 10;
			
			System.out.println("inum1 : " + inum1); 
			
            inum1 /= 10;
			
			System.out.println("inum1 : " + inum1);
			
	        inum1 %= 10;   //inum = inum % 10
				
		    System.out.println("inum1 : " + inum1);
		}
		  
		
		public void operatorTest3() {
		//���� ������	
		//����ڿ� ���� �ϳ� �޾Ƽ� �� ���� ������� �������� 0���� �Ǻ�
			Scanner sc = new Scanner(System.in);
			System.out.print("���� �ϳ� �Է� :");
			int num = sc.nextInt();
			
			String result = num > 0 ? "�����": num == 0? "0�̴�" : "������";
	
			System.out.println(result);
			
			
		}
		
		
			
			
	
		
		
		
		
		
		
		

	}


