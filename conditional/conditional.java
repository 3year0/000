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


		
	
			
			public void testContinue() {
				//1~100까지의 합(3과 5의 배수 제외)을 출력
				int sum = 0;
				for(int i = 1; i <= 100; i++) {
					if(i % 3 == 0 || i % 5 == 0) {
						continue;
					}
					sum +=i;
				}
				
				System.out.println("sum: " +sum);
			}
				
			public void testGugudan2() {
				//분기문을 이용한 중천 반복문 구구단
				//for문으로 구구단 짝수단(2,4,6,8단)만 구현
				
		    for(int i = 2; i < 10; i+=2 ) {
		    	//if(i%2==1)continue;  분기문
		    	System.out.println("===" + i +"===단");
		    	for(int j = 1; j < 10; j++) {
		    		System.out.println(i+"x"+j+":"+i*j);
		    	}
		    }
			}
				
		    public void testGugudan3() {
			    //while문으로 구구단 홀수곱만 구현	
			    int i = 2;
			    while(i < 10) {
			    	System.out.println("===" + i +"===단");
			    	int j = 0;
				    while(j < 10) {
				    	j++;
				    	if( j % 2 == 0) continue;
				    	System.out.println(i + "x" + j +"=" + i*j);
				    	
				    }
				    i++;
			    }
			   }
			 
	
		    public void testStar2() {
		    	//공백
		    	for(int i = 3; i < 0 ; i --) {		    		
		    			for(int j = 5; j < 0 ; j--) {
		    				System.out.print("*");
		    			}
		    			System.out.print(" ");
		    	}
		    	
		    	
		    	
		    
		
				
				
				
			
				
			
	
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		
			
			
		}
	
}


