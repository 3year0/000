package testPyramid;

import java.util.Scanner;

public class testPyramid {
	public void method1() {
		//pyramidStar
		//�ܺ� for��
		//�� 1/3/5/7
		for (int i = 0; i <4; i++) {
		     for(int j = 3; j > i;j--) {
			System.out.print(" ");
		}
		for (int j = 0; j < i * 2+1; j++) {
			System.out.print("*");
		}
		
		System.out.println();
		
	}
	}


		public void method2() {
			//������ 
			System.out.print("Ȧ�� �Է� :");
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			//���
			//num = 7 , 0~2��
			for(int i = 0; i<num/2 ;i++) {
				//����(3,2,1)
				for(int j = num/2;j > i ;j--) {
					System.out.print(" ");
			}
			//��
			for(int j= 0; j < i * 2+1; j++ ) {
				System.out.print("*");
			}
			
			 //����
			System.out.println("");
	
		}
		
			//�ϴ�3~��
			for(int i = num / 2; i >=0; i--) {
				
				
					//����(3,2,1)
					for(int j = num/2;j > i ;j--) {
						System.out.print(" ");
				}
				//��
				for(int j= 0; j < i * 2+1; j++ ) {
					System.out.print("*");
				}
				
				 //����
				System.out.println();
		
			}
			
			
			
			
			
			
	
		}
		
		
		public void pyamidStar3() {
			Scanner sc = new Scanner(System.in);
			System.out.print("Ȧ�� �Է� :");
			int num = sc.nextInt();
			//num 7 
			//�� ����
			for(int i = 0; i < num/2; i++) {
				//���� ����
				for(int j = num / 2; j > i ;j--) {
					System.out.print(" ");
				}
				//�� ����
				for(int j =0; j < i*2+1; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
				//�ϴ�3~7
				for(int i = num/2; i >=0; i-- ) {
					for(int j = num/2;j > i ;j--) {
						System.out.print(" ");
					}
					//�ϴ� ���� 3,2,1
					for(int j =0; j < i*2+1; j++) {
						System.out.print("*");
					}
					System.out.println();
					
			}
			
			
		}
			
	
		
		
		public void infinity() {
			Scanner sc = new Scanner(System.in);
			String result = "";
			while(true) {
				System.out.print("���ڿ� �Է� :");
				String str = sc.nextLine();
				if(str.equals("stop")) {
					System.out.println("��� :" + result);
					break;
			}
			result += str+" ";
			System.out.println("��� :" + result);
			
			
			
			}		
			
		}
		
		
		

		public void orderProgram() {
			//ī�� �ֹ� ���α׷� 
			Scanner sc= new Scanner(System.in);
			//�޴��� �ֹ���
			int ameri = 0;
			int latte = 0;
			int vanilla = 0;
			
			//���� �ݺ�
			while(true) {
				System.out.println("======�޴�======");
				System.out.println("1. �Ƹ޸�ī��");
				System.out.println("2. ī���");
				System.out.println("3. �ٴҶ��");
				System.out.println("============");
				System.out.println("�޴� ���� :");
				int menu = sc.nextInt();
				System.out.println("���� ���� :");
				int amount = sc.nextInt();
				
				switch(menu) {
				case 1:
					ameri += amount;
					break;
				case 2:
					latte += amount;
					break;
				case 3:
					vanilla += amount;
					break;
				default:
					System.out.println("�߸� �����ϼ̽��ϴ�. �ٽ� �������ּ���");
					continue;
				}
				System.out.println("�߰� �ֹ� �Ͻðڽ��ϴ�?(Y/N)");
				char select = sc.next().charAt(0);
				
				if(select =='N' || select == 'n') {
					System.out.println("=============");
					if (ameri !=0) {
						System.out.println("�Ƹ޸�ī��" + ameri + "�� :" + 3500 * ameri + "��");
					}
					if (latte !=0) {
						System.out.println("ī���" + latte + "�� :" + 4100 * latte + "��");
					}
					if (vanilla !=0) {
						System.out.println("�ٴҶ��" + vanilla + "�� :" + 4300 * vanilla + "��");
					}
					System.out.println("=============");
					System.out.println("�Ѿ� :" + (3500 * ameri + 4100 * latte + 4300 * vanilla));
					break;
				}
				
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}

