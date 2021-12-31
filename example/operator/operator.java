package example.operator;

import java.util.Scanner;

public class operator {

	
		public void operatorTest() {
		 
		//증감 연산자
			
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
			
			//산술 연산자 %
			//홀수 짝수 판별시 사용 
			//짝수 -> 값 % 2 ==0
			//홀수 -> 값 % 2 ==1
			
			// n의 배수 -> 값 % n ==0 
			int num1 = 10;
			int num2 = 3;
			System.out.println("num1 % num2 =" + (num1 % num2));
			
			//논리 연산자
			//1과 100사이의 수?
			// 1 < 수 < 100(x)
			//변수 > 1 && 변수 <100 (0)   and  or
			Scanner sc = new Scanner(System.in);
	
			System.out.print("정수 입력 : ");
			int inum = sc.nextInt();
			
			System.out.println("1과 100사이의 수? : " + (inum > 1 && inum < 100 ));
			
			//복합 대입 연산자
			// 산술 + 대입 연산자가 같이있는
			//코드가 간결하며 메모리에 직접 연사을 수행하여 연산속도도 빠름
			
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
		//삼항 연산자	
		//사용자에 값을 하나 받아서 그 값이 양수인지 음수인지 0인지 판별
			Scanner sc = new Scanner(System.in);
			System.out.print("정수 하나 입력 :");
			int num = sc.nextInt();
			
			String result = num > 0 ? "양수다": num == 0? "0이다" : "음수다";
	
			System.out.println(result);
			
			
		}
		
		
			
			
	
		
		
		
		
		
		
		

	}


