package testPyramid;

import java.util.Scanner;

public class testPyramid {
	public void method1() {
		//pyramidStar
		//외부 for문
		//별 1/3/5/7
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
			//마름모 
			System.out.print("홀수 입력 :");
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			//상단
			//num = 7 , 0~2행
			for(int i = 0; i<num/2 ;i++) {
				//공백(3,2,1)
				for(int j = num/2;j > i ;j--) {
					System.out.print(" ");
			}
			//별
			for(int j= 0; j < i * 2+1; j++ ) {
				System.out.print("*");
			}
			
			 //개행
			System.out.println("");
	
		}
		
			//하단3~행
			for(int i = num / 2; i >=0; i--) {
				
				
					//공백(3,2,1)
					for(int j = num/2;j > i ;j--) {
						System.out.print(" ");
				}
				//별
				for(int j= 0; j < i * 2+1; j++ ) {
					System.out.print("*");
				}
				
				 //개행
				System.out.println();
		
			}
			
			
			
			
			
			
	
		}
		
		
		
		
		
		
		
		
		

}


	

