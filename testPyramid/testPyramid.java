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
		
		
		
		
		
		
		
		
		

}


	

