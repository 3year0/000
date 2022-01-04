package array;

import java.util.Arrays;

public class array {
	public void testArray() {
		//배열 선언 : stack 공간 생성, 주소값을 가지고 있음
		boolean[]booleanArr; //논리형 배열   //자료형[] 배열명
		//배열 할당 : heap에 공간 생성, 진짜 데이터를 가지고 있음
		double[] doubleArr = new double[2];  // 자료형[] 배열명 = new 자료크기
		
		//배열 초기화
		//인덱스 이용
		doubleArr[0] = 100.123456;
		doubleArr[1] = Math.random();
		//0 <= Math.random() < 1
		//1부터 10까지의 정수
		//0*10+1 <= (int)(Math.random()*10)+1 < 1*10+1
		//선언과 동시 초기화
		String[] strArr = {"이름","나이","성별"};//크기가 3인 공간 생성, 값 초기화
		char[] charArr = new char[] {'a','b','c','d','e',};
		
		//for문을 이용한 초기화
		int[] intArr = new int[6];
		for(int i = 0; i <intArr.length; i++) {
			intArr[i] = i;
		}
		
		
		
		
		//출력
		//하나씩 접근해서 출력하는 방법
		for(int i = 0; i < doubleArr.length; i++) {
			System.out.print(doubleArr[i]);
		
	}
		for(int i = 0; i < intArr.length; i++) {
			System.out.print(intArr[i]);
		}
		//전체 출력 = String 자체로 뽑아오는 것
		System.out.print(Arrays.toString(strArr));
		System.out.print(Arrays.toString(charArr));
	}
	
	
	public void testShallowCopy() {
		//얕은 복사
		
		int[] originArr = {1,2,3,4,5};
		int[] copyArr = new int[10];
		copyArr = originArr;  //originArr의 주소값이 copyArr로 대입
		
		//같은 객체를 참조하는 것으로 바뀌어 copyArr은 길이 5
		System.out.println("===전===");
		System.out.println(Arrays.toString(originArr));
		System.out.println(Arrays.toString(copyArr));
		
		originArr[2] = 100;
		
		System.out.println("===후===");
		System.out.println(Arrays.toString(originArr));
		System.out.println(Arrays.toString(copyArr));
		
		//주소값
		System.out.println("주소값");
		System.out.println(originArr);
		System.out.println(copyArr);

	}
	
		public void testDeepCopy() {
			//깊은복사
			
			int[] originArr = {1,2,3,4,5};
			//for문 이용
			int[] copyArr = new int[10];
			for(int i = 0; i < originArr.length; i++) {
				copyArr[i] = originArr[i];
			}
			
			System.out.println("===전===");
			System.out.println(Arrays.toString(originArr));
			System.out.println(Arrays.toString(copyArr));
			
			originArr[2] = 100;
			
			System.out.println("===후===");
			System.out.println(Arrays.toString(originArr));
			System.out.println(Arrays.toString(copyArr));
			
			//주소값
			System.out.println("주소값");
			System.out.println(originArr);
			System.out.println(copyArr);

			
			
		}
	
			public void testDeepCopy2() {
				//깊은 복사 = arrtcopy()
				int[] originArr = {1,2,3,4,5};
				int[] copyArr = new int[10]; 
				
				
				//src : 원본 배열
				//srcPos: 원본 배열의 복사할 시작점
				//dest : 카피 배열
				//destPos: 카피 배열의 붙여넣기 시작점
				//length : 원본 배열에서 가져올 길이
				System.arraycopy(originArr, 0, copyArr, 0, originArr.length);
				
				System.out.println("===전===");
				System.out.println(Arrays.toString(originArr));
				System.out.println(Arrays.toString(copyArr));
				
				originArr[2] = 100;
				
				System.out.println("===후===");
				System.out.println(Arrays.toString(originArr));
				System.out.println(Arrays.toString(copyArr));
				
				//주소값
				System.out.println("주소값");
				System.out.println(originArr);
				System.out.println(copyArr);
			}
	
	
				 public void testDeepCopy3() {
					 //깊은 복사 - Arrays.copyOf()
					int[] originArr = {1,2,3,4,5};
					int[] copyArr =  Arrays.copyOf(originArr, originArr.length);
					//int[] copyArr = new int[10];
						
					//original : 원본 배열
					//newLength : 복사할 길이
					//무조건 원본 배열의 0 부터 시작
					//값을 대입시켜야함
					copyArr =  Arrays.copyOf(originArr, originArr.length);
						
						
					System.out.println("===전===");
					System.out.println(Arrays.toString(originArr));
					System.out.println(Arrays.toString(copyArr));
					
					originArr[2] = 100;
					//copyArr은 originArr을 복사하여 새로운 객체를 참조하게 되었으므로 길이 5
					System.out.println("===후===");
					System.out.println(Arrays.toString(originArr));
					System.out.println(Arrays.toString(copyArr));
					
					//주소값
					System.out.println("주소값");
					System.out.println(originArr);
					System.out.println(copyArr);
						
				 }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
