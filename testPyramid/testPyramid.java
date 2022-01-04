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
		
		
		public void pyamidStar3() {
			Scanner sc = new Scanner(System.in);
			System.out.print("홀수 입력 :");
			int num = sc.nextInt();
			//num 7 
			//줄 생성
			for(int i = 0; i < num/2; i++) {
				//공백 생성
				for(int j = num / 2; j > i ;j--) {
					System.out.print(" ");
				}
				//별 생성
				for(int j =0; j < i*2+1; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
				//하단3~7
				for(int i = num/2; i >=0; i-- ) {
					for(int j = num/2;j > i ;j--) {
						System.out.print(" ");
					}
					//하단 공백 3,2,1
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
				System.out.print("문자열 입력 :");
				String str = sc.nextLine();
				if(str.equals("stop")) {
					System.out.println("결과 :" + result);
					break;
			}
			result += str+" ";
			System.out.println("결과 :" + result);
			
			
			
			}		
			
		}
		
		
		

		public void orderProgram() {
			//카페 주문 프로그램 
			Scanner sc= new Scanner(System.in);
			//메뉴별 주문량
			int ameri = 0;
			int latte = 0;
			int vanilla = 0;
			
			//무한 반복
			while(true) {
				System.out.println("======메뉴======");
				System.out.println("1. 아메리카노");
				System.out.println("2. 카페라떼");
				System.out.println("3. 바닐라라떼");
				System.out.println("============");
				System.out.println("메뉴 선택 :");
				int menu = sc.nextInt();
				System.out.println("수량 선택 :");
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
					System.out.println("잘못 선택하셨습니다. 다시 선택해주세요");
					continue;
				}
				System.out.println("추가 주문 하시겠습니다?(Y/N)");
				char select = sc.next().charAt(0);
				
				if(select =='N' || select == 'n') {
					System.out.println("=============");
					if (ameri !=0) {
						System.out.println("아메리카노" + ameri + "잔 :" + 3500 * ameri + "원");
					}
					if (latte !=0) {
						System.out.println("카페라떼" + latte + "잔 :" + 4100 * latte + "원");
					}
					if (vanilla !=0) {
						System.out.println("바닐라라떼" + vanilla + "잔 :" + 4300 * vanilla + "원");
					}
					System.out.println("=============");
					System.out.println("총액 :" + (3500 * ameri + 4100 * latte + 4300 * vanilla));
					break;
				}
				
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}

