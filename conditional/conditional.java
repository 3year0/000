package conditional;

import java.util.Scanner;

public class conditional {
	public void teseIf() {
		
		
		int kor = 45;
		int math = 60;
		int eng = 60;
		
		int sum = kor + math + eng;
		double avg = (int)sum / 3;
		
		System.out.println("�հ� :" + sum);
		System.out.println("��� :" + avg);
		
		
		//if 
		if(avg >= 60) {
			
			System.out.println("�հ�");
		}
		//else
		else {
			System.out.println("���հ�");
		}
		
		
		//if - else if - else
		
        if(avg >= 60) {
	        System.out.println("�հ�" );
		}else if (avg >= 40) {
			System.out.println("�������");
		}else {
			System.out.println("���հ�");
	    }
		
		//��ø if��
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
        	
		
        System.out.println("���� ������ "+ grade + " �Դϴ�");
		
		
		
		
        	}
        
	
	public void testSwitch() {
		//switch��
		//����, ����, ���ڿ� ����
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �̸� �Է� :");
		String fruit = sc.nextLine();
		
		int price = 0;
		switch(fruit) {
		case "��" :
			price = 500;
			break;
		case "���" :
			price = 1000;
			break;
		case "�ٳ���" :
			price = 2000;
			break;
		case "�޷�" :
			price = 3000;
			break;
		default:
			System.out.println("�ش� ������ �����ϴ�.");
			break;
			
	
		}
		System.out.println(fruit+ "�� ������" +  price +"�Դϴ�.");
		
		
	}
	
	
	
	
	
	public void testExample() {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("ù ��° ���� �Է� = " );
		int one = sc.nextInt();

		
		System.out.println("�� ��° ���� �Է� = ");
		int two = sc.nextInt();
		
		String result ="";
		if ((one % 2 == 0) && (two % 2 == 0)){
			result ="�� �� ��� ¦���Դϴ�.";
		}else if ((one % 2 == 0) || (two % 2 == 0)){
			result ="�ϳ��� Ȧ���̰� �ϳ��� ¦���̴�";
		}else{
			result ="�� �� ��� Ȧ���̴�";
		}
		
		System.out.println(result);
		

		
		
	}
	
	public void testExample2() {
		//�� ������ ������ �Է� �޾� ���� ��� ���
		Scanner sc = new Scanner(System.in);
		System.out.println("ù ��° ���� :");
		int num1 = sc.nextInt();
		
		System.out.println("�� ��° ���� :");
		int num2 = sc.nextInt();
		
		System.out.println("���� ��ȣ �Է� :");
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
				System.out.println("0���� ���� �� �����ϴ�.");
			}
		break;
		case '%' :
			result = num1 % num2;
		break;
		default : 
			System.out.println("�Է��Ͻ� ������ �����ϴ�. ���α׷��� �����մϴ�");
		return;
		
	}
	
		System.out.println("������ :" + num1 + " " + op  + num2 + "="+ result);
	
		
	}


		
	
			
			public void testContinue() {
				//1~100������ ��(3�� 5�� ��� ����)�� ���
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
				//�б⹮�� �̿��� ��õ �ݺ��� ������
				//for������ ������ ¦����(2,4,6,8��)�� ����
				
		    for(int i = 2; i < 10; i+=2 ) {
		    	//if(i%2==1)continue;  �б⹮
		    	System.out.println("===" + i +"===��");
		    	for(int j = 1; j < 10; j++) {
		    		System.out.println(i+"x"+j+":"+i*j);
		    	}
		    }
			}
				
		    public void testGugudan3() {
			    //while������ ������ Ȧ������ ����	
			    int i = 2;
			    while(i < 10) {
			    	System.out.println("===" + i +"===��");
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
		    	//����
		    	for(int i = 3; i < 0 ; i --) {		    		
		    			for(int j = 5; j < 0 ; j--) {
		    				System.out.print("*");
		    			}
		    			System.out.print(" ");
		    	}
		    	
		    	
		    	
		    
		
				
				
				
			
				
			
	
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		
			
			
		}
	
}


