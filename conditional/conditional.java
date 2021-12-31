package conditional;

import java.util.Scanner;

public class conditional {
	public void teseIf() {
		
		
		int kor = 45;
		int math = 60;
		int eng = 60;
		
		int sum = kor + math + eng;
		double avg = (int)sum / 3;
		
		System.out.println("합계 :" + sum);
		System.out.println("평균 :" + avg);
		
		
		//if 
		if(avg >= 60) {
			
			System.out.println("합격");
		}
		//else
		else {
			System.out.println("불합격");
		}
		
		
		//if - else if - else
		
        if(avg >= 60) {
	        System.out.println("합격" );
		}else if (avg >= 40) {
			System.out.println("보충수업");
		}else {
			System.out.println("불합격");
	    }
		
		//중첩 if문
        String grade = "";
        if(kor >= 80) {
        	grade = "A";
        	if(kor >= 95) {
        		grade += "+";
        	}else if(kor >= 85) {
        		grade += "0";
        	}else {
        		grade += "-";
        	}
        }else if(kor >=60) {
        	grade = "B";
        	if(kor >=75) {
        		grade += "+";
        	}else if(kor >= 65) {
        		grade += "0";
        	}else {
        		grade += "-";
        	}
        	
        }else{
        	grade = "C";
        	if(kor >= 55) {
        		grade += "+";
        	}else if(kor >= 45) {
        		grade += "0";
        	}else {
        		grade += "-";
        	}
        }	
        	
		
        System.out.println("국어 성적은 "+ grade + " 입니다");
		
		
		
		
        	}
        
	
	public void testSwitch() {
		//switch문
		//정수, 문자, 문자열 가능
		Scanner sc = new Scanner(System.in);
		System.out.println("과일 이름 입력 :");
		String fruit = sc.nextLine();
		
		int price = 0;
		switch(fruit) {
		case "귤" :
			price = 500;
			break;
		case "사과" :
			price = 1000;
			break;
		case "바나나" :
			price = 2000;
			break;
		case "메론" :
			price = 3000;
			break;
		default:
			System.out.println("해당 과일이 없습니다.");
			break;
			
	
		}
		System.out.println(fruit+ "의 가격은" +  price +"입니다.");
		
		
	}
	
	
	
	
	
	public void testExample() {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("첫 번째 정수 입력 = " );
		int one = sc.nextInt();

		
		System.out.println("두 번째 정수 입력 = ");
		int two = sc.nextInt();
		
		String result ="";
		if ((one % 2 == 0) && (two % 2 == 0)){
			result ="두 수 모두 짝수입니다.";
		}else if ((one % 2 == 0) || (two % 2 == 0)){
			result ="하나는 홀수이고 하나는 짝수이다";
		}else{
			result ="두 수 모두 홀수이다";
		}
		
		System.out.println(result);
		

		
		
	}
	
	public void testExample2() {
		//두 정수와 연산자 입력 받아 연산 결과 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("첫 번째 정수 :");
		int num1 = sc.nextInt();
		
		System.out.println("두 번째 정수 :");
		int num2 = sc.nextInt();
		
		System.out.println("연산 기호 입력 :");
		char op = sc.next().charAt(0);
		
		int result = 0;
		
		switch(op) {
		case '+' :
			result = num1 + num2;
		break;
		case '-' :
			result = num1 - num2;
		break;
		case '*' :
			result = num1 * num2;
		break;
		case '/' :
			if (num2 != 0) {
			result = num1 / num2;
			
			}else{
				System.out.println("0으로 나눌 수 없습니다.");
			}
		break;
		case '%' :
			result = num1 % num2;
		break;
		default : 
			System.out.println("입력하신 연산은 없습니다. 프로그램을 종료합니다");
		return;
		
	}
	
		System.out.println("수행결과 :" + num1 + " " + op  + num2 + "="+ result);
	
		
	}
}

		
		
	



