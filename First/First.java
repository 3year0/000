package First;

import java.util.Scanner;

public class First {
	
	
	
	
 public void First1() {
	 
	 int inum = 100;
	 
	 double dnum = 234.567;
	 
	 char ch = 'A';
	 
	 String str = "Hello World";
	 
	 Boolean bnum = true;
	 
	 
	 

	 System.out.println("�ʱ�ȭ �� �� : "+inum+ ","+dnum+ ","+ch+","+ str +","+ bnum);
	 
	
	 
	 
	 inum = 10000;
	 
	 dnum = 567.12345689;
	 
	 ch = 'B';
	 
	 str = "Welcome to JAVA";
	 
	 bnum = false;
	 
	 
	 System.out.println("�� ���� �� : "+inum+ ","+dnum+ ","+ch+","+ str +","+ bnum);
 }
 
 
 
 
 public void second2() {
	 
	 Scanner sc = new Scanner(System.in);
	 System.out.println("���� ������ :");
	 int inum = sc.nextInt();
	 double pi = 3.14;
	 
	 System.out.printf("�������� %d�� ���� �ѷ� : %.1f\n",inum, 2*inum*pi);
			 
	 System.out.printf("�������� %d�� ���� ���� : %.1f\n",inum,inum*inum*pi);
	
 }
 
 public void third3() {
	 
	Scanner sc = new Scanner(System.in);
	System.out.println("ù ��° �л��� Ű : ");
	double dnum1 = sc.nextDouble();
	
	System.out.println("�� ��° �л��� Ű : ");
	double dnum2 = sc.nextDouble();
	 
	
	System.out.println("�� ��° �л��� Ű : ");
	double dnum3 = sc.nextDouble();
	 
	int avg = (int)(dnum1+dnum2+dnum3) / 3;
	//System.out.println("Ű�� ��� : "+ (int)(dnum1+dnum2+dnum3) / 3);
	System.out.println("Ű�� ��� :  " +avg);
	 
	 
	 
 }
 
 public void fourth4() {
	 Scanner sc = new Scanner(System.in);
	 System.out.print("���ڿ� �Է� :");
	 String str = sc.nextLine();
	 
	 
	 
	 char ch1 = str.charAt(0);
	 //int num = ch1;
	 System.out.println(ch1 +":"+ (int)(ch1));
	 //System.out.println(ch + " : " + num);
	 
	 char ch2 = str.charAt(1);
	 System.out.println(ch2 +":"+ (int)(ch2));
	 
	 char ch3 = str.charAt(2);
	 System.out.println(ch3 +":"+ (int)(ch3));
	 
	 char ch4 = str.charAt(3);
	 System.out.println(ch4 +":"+ (int)(ch4));
	 
	 char ch5 = str.charAt(4);
	 System.out.println(ch5 +":"+ (int)(ch5));
	 
	 
	//System.out.println(str.charAt(0) + " : " + (int)(str.charAt(0));
	//System.out.println(str.charAt(1) + " : " + (int)(str.charAt(1));
	//System.out.println(str.charAt(2) + " : " + (int)(str.charAt(2));
	//System.out.println(str.charAt(3) + " : " + (int)(str.charAt(3));
	//System.out.println(str.charAt(4) + " : " + (int)(str.charAt(4));

 }

public void fifth5() {
	
	int num1 = 10;
	int num2 = 0;
	System.out.println("int num1 = " + num1 );
	System.out.println("int num2 = " + num2 );
	
	String str = "Hello";
	System.out.println("String str = " + str );
	
	
	num1 += 20;  // num1 = 30
	num2 += 10; // num2 = 10
	num1 /=num2;  // num1 = 3
	num2*=num1;  // num2 = 30
	str += num2;  // str = Hello30
	num2 -= num1; // num2  = 27
	
	
	
	System.out.println(num1);
	System.out.println(num2);
	System.out.println(str);
}
 

 public void sixth6(){
	 Scanner sc = new Scanner(System.in);
	 System.out.print("ù ��° ���� : ");
	 int num1 = sc.nextInt();
	 
	 System.out.print("�� ��° ���� : ");
	 int num2 = sc.nextInt();
	 
	System.out.println(num1 % 2 == 0 && num2 % 2 == 0 ? "�� �� ��� ¦���̴�." : 
		num1 % 2 == 0 || num2 % 2 ==0  ? "�ϳ��� Ȧ���̰� �ϳ��� ¦���̴�" : "�� �� ��� Ȧ�� �̴�");
	 //String result = (num1 % 2 == 0) && (num2 % 2 ==0)? "�� �� ��� ¦���̴�." :
	 //                (num1 % 2 == 0) || (num2 % 2 ==0)?  "�ϳ��� Ȧ���̰� �ϳ��� ¦���̴�" : "�� �� ��� Ȧ�� �̴�";
}
 
 
 
 public void seventh7() {
	 Scanner sc = new Scanner(System.in);
	 System.out.print("ù ��° ���� : ");
	 int num1 = sc.nextInt();
	 
	 System.out.print("�� ��° ���� : ");
	 int num2 = sc.nextInt();
	 
	 String result = "";
	 if ((num1 % 2 == 0) && (num2 % 2 == 0 )) {
		 result = "�� �� ��� ¦���̴�";	
		 }else if((num1 % 2 == 0) || (num2 % 2 == 0 )){
			 result = "�ϳ��� Ȧ���̰� �ϳ��� ¦���̴�";
		 }else {
			 result = "�� �� ��� Ȧ���̴�";
		 }
	 
	 System.out.print(result);
	 
	 
	
 }
 
 
 
 
 
 
 
 
 
 
 
 
 
 
}
