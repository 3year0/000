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
				boolean bool = true;
				//bool = 1;  참 거짓만 가능 따로 불가능
				
				
				//char ->int     자동 형변환 
				int num = 'A';
				System.out.println("num : " + num);
				
				
				//char에 정수값 저장 가능 (숫자에 해당하는 유니코드 문자)
				char ch = 66;
				System.out.println("ch :" +ch);
				//ch = -66; //음수는 불가능
				
				
				//int > char 강제 형변환
				char ch2 = (char)num;  
				System.out.println("ch2 : " +ch2 );
			}
			
			public void testCasting2() {
				//int ,long 의 연산
				int inum = 4;
				long lnum = 8L;
				
				//int 결과  // 결국 long으로 변환되서 에러가 발생
				int isum = (int)(inum + lnum);
				isum = inum +(int)lnum;
				System.out.println("isum : " + isum );
				
				//long 결과
				long lsum = inum +lnum;
				System.out.println("lsum : " +lsum );
				
				//byte, short  *1byte,2byte       연산결과는 int 표시
				
				byte bnum = 1;
				short snum = 2;
				
				int sum1 = bnum + snum;
				System.out.println("sum1 : " +sum1 );
				
				
				//byte or short의 결과를 얻기 위해 강제 형변환
			
				short sum2 = (short)(bnum + snum);   // short로 강제로 변환 데이터 축소
				System.out.println("sum2 : " +sum2 );
			}
			
			
			public void testDataLoss() {
				//데이터 손실 테스트
				
			    //정수 > 실수
				
				long lnum = 100;
				float fnum = lnum;
				System.out.println(" fnum : " +fnum);  //long는 8byte  float는 4byte이나 범위가 더 넓어 가능
				
				//실수 > 정수
				
				double dnum = 10.5;
				int inum = (int)dnum;  // 8byte double  int 4byte 정수 자료형 안에 강제 변환해서 데이터 손실 발생
				System.out.println("inum : " +inum );		
				
				//데이더 손실 주의 요망
				int num = 250;
				System.out.println("num : " + num );
				
				byte bnum = (byte)num;
				System.out.println("bnum : " +bnum );
				
			}
			
			public void metbod3() {
				//문제 세 명의 학생의 키를 실수형 입력 , 키의 평균을 정수형 출력
				
				
				
				//double height1;
				//double height2;
				//double height3;
				
				
				Scanner sc = new Scanner(System.in);
				System.out.print("첫 번째 학생의 키  : " );
				double height1 = sc.nextDouble();
				
				System.out.print("두 번째 학생의 키  : " );
				double height2 = sc.nextDouble();

				System.out.print("세 번째 학생의 키  : " );
				double height3 = sc.nextDouble();
				
				int avg = (int)( height1 + height2 + height3 ) / 3;   //강제 형변환으로 실수였던 평균값이 정수로 바뀜
				System.out.print("키의 평균  : " + avg);
			}
			
			public void metbod4() {
				
				//문제 키보드 길이5인 문자열 입력 각가의 유니코드를 출력
				
			
				Scanner sc = new Scanner(System.in);
				//문자열 Apple를 입력 받아야 됨
				System.out.print("문자열 입력 : ");
				String str = sc.nextLine();
				
				// 각각의 유니코드를 출력 
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
				
						
			//한번에 출력
				System.out.println( str.charAt(0) + " : " + (int)str.charAt(0));
				System.out.println( str.charAt(1) + " : " + (int)str.charAt(1));
				System.out.println( str.charAt(2) + " : " + (int)str.charAt(2));
				System.out.println( str.charAt(3) + " : " + (int)str.charAt(3));
				System.out.println( str.charAt(4) + " : " + (int)str.charAt(4));
				

				
				
			}
			
	
}

