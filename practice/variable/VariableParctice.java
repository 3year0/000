package practice.variable;

import java.util.Scanner;

public class VariableParctice {

	public void method1() {
		//변수의 선언
		
		int inum = 100;
		double dnum = 234.567;
		char ch = 'A';
		String str = "Hello world";
		boolean bool = true;
		
		System.out.println("초기화 후 : "+ inum +" , " + dnum +" , " + ch + " , " + str + ", "+ bool);
		
		
		inum = 10000;
		dnum = 567.123456789;
		ch = 'B';
		str = "Welcome to Java";
		bool = false;

		
		System.out.println("값 변경 후 : "+ inum +" , " + dnum +" , " + ch + " , " + str + ", "+ bool);
		
		
	}
		public void method2() {
			
			Scanner sc = new Scanner(System.in);
			System.out.print("원의 반지름 :" );
			int rad = sc.nextInt();
			
			double pi = 3.14;
			
			//System.out.println("반지름이" + rad + "인 원의 둘레: " + 2 * rad * pi  );
			//System.out.println("반지름이" + rad + "인 원의 면접: " + rad * rad * pi  );			
			
			
			
			System.out.printf("반지름이 %d인 원의 둘레 : %.1f\n" , rad, 2*rad*pi );
			System.out.printf("반지름이 %d인 원의 면적 : %.1f\n" , rad, rad*rad*pi );	
		}
			
			
			public void testFinal() {
				
			
			//메소드 생성
			//상수 테스트
			
			int size;  //변수
			final int SIZE;  //상수
			
			SIZE = 10;
			size = 10;
			
			System.out.println("초기화 후 값 변경 전");
			System.out.println("size 값 :" + size);
			System.out.println("SIZE 값 :" + SIZE);
			
			//SIZE = 20;
			size = 20;
			
			System.out.println("초기화 후 값 변경 후");
			System.out.println("size 값 :" + size);
			System.out.println("SIZE 값 :" + SIZE);
			


			}
			
			public void testOverflow() {
				//데이더 오버플로우 테스트
				System.out.println("byte의 최대값 :" +Byte.MAX_VALUE);
				System.out.println("byte의 최소값 :" +Byte.MIN_VALUE);
				
				
				byte bnum = 127;
				bnum += 1;
				System.out.println("byte의 최대값 +1 : " + bnum);
				
				
				
				bnum= -128;
				bnum -= 1;
				System.out.println("byte의 최대값 -1 : " + bnum);
				
			
				
				int num1 = 100000;
				int num2 = 30000;
				//int의 저장 가능 범위 21억 , 30억이라는 값 오버플로우
				//int result = num1 * num2;
				
				long result = (long)num1*num2;   //int 4byte를  long 8byte로 강제 변환 
				System.out.println("계산 결과 : " + result);
				
				}
			
			
			public void testCasting() {
				
				//형변환 테스트
				
				
			}
	
}

