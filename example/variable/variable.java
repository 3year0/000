package example.variable;

import java.util.Scanner;

public class variable {
public void intVariable() {
	// 변수 선언과 동시 초가화
	
	
	// 논리형: 1byte
	//낙타등 표시법 : 첫번째 단어는 앞 글자는 소문자, 중간 단어 첫번째는 대문자
	
	boolean isTrue = true;
	boolean isFalse = false;
	
	//문자 : 2byte
	char ch = 'a'; // 문자열 char은 싱글퀘테이션 사용
	
    //문자열 : 참고형 ( 주소값 저장)
	// String 안에 데이터가 들어가는 것이 아닌  데이터가 있는곳을 가져오는 것 , 문자열은 무한 할수있기 때문
	
	String str = "반갑습니다";
	
	//숫자형
	
	//정수형
	byte bnum = 1;
	short snum = 2;
	int inum = 4;
	long lnum = 8L;
	
	//실수형
	
	float fnum = 4.0f;
	double dnum = 8.0;  //float에 비해 double가 2개로 늘어는다 , 2배 정확도
	

    // 변수의 저장된 값 출력하기
	System.out.println("isTruedml 값: "+ isTrue);
	System.out.println("isFalse 값: "+ isFalse);
	
	
	System.out.println("ch 값: "+ ch);
	System.out.println("str 값: "+ str);
	
	System.out.println("bnum 값: "+ bnum);
	System.out.println("snum 값: "+ snum);
	System.out.println("inum 값: "+ inum);
	System.out.println("lnum 값: "+ lnum);
	
	
	System.out.println("fnum 값: "+ fnum);
	System.out.println("dnum 값: "+ dnum);
	
}

	public void changevalue() {
		
	
		// 변수값 변경 테스트 
		
		String name;
		char gendar;
		int age;
		double height;
		
		name = "박태준";
		gendar = 'M';
		age = 30;
		height = 168.9;
		
		System.out.println(name + "님의 개인정보");
		System.out.println(" gendar : " + gendar);
		System.out.println(" age : "+ age);
		System.out.println("height :  "+ height);
		
		//키보드로 값을 입력받아 변수에 저장된 값 변경
		
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력하세요: ");
		name = sc.nextLine();
		System.out.println("성별을 입력하세요: ");
		gendar = sc.next().charAt(0);  //
		System.out.println("나이를 입력하세요: ");
		age = sc.nextInt();
		System.out.println("키를 입력하세요: ");
		height = sc.nextDouble();
	
		
		System.out.println(name + "님의 개인정보");
		System.out.println(" gendar : " + gendar);
		System.out.println(" age : "+ age);
		System.out.println("height :  "+ height);
		
		
		//variable은 대,소문자 구분된다. 예약어 사용 불가능, 숫자로는 시작 안됨, 특수문자 '_','$'  사용 가능하나 '_'는 관례상 사용 안함,  첫 단어 앞자리는 소문자 중간단어 앞자리는 대문자
		//variable는 한 개의 data만 
		//Scanner ? = new Scanner(System.in);   자바 입력 도구
	}
		

			
		}
	
		
		
		
	

