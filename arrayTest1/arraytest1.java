package arrayTest1;

import java.util.Scanner;

public class arraytest1 {

	public void arraytest1() {
		//가변 배열 초기화 및 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("행의 크기 입력: ");
		char[][] arr = new char[sc.nextInt()][];//행의 크기 만큼만
		
		//열 할당
		for(int i = 0; i < arr.length; i++) {
			System.out.print(i+" 행의 크기 입력: ");
			arr[i] = new char[sc.nextInt()];
		}
		//초기화(저장) 및 출력
		char ch = 'a';
		for(int i = 0; i < arr.length;i++) {
			for(int j = 0; j< arr[i].length; j++) {
				arr[i][j] = ch++;
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public void method1() { 
	Scanner sc = new Scanner(System.in);
	char[][] arr = new char[5][5];
	int row;
	int column;
	
	while(true) {
		System.out.print("행 인덱스 입력 >> ");
		row = sc.nextInt();
		System.out.print("열 인덱스 입력 >> ");
		column = sc.nextInt();
		
		if (row < 0 || row > 4 || column < 0 || column > 4 ) {
			break;
		}
		arr[row][column] = 'x';
		System.out.print("\t0\t1\t2\t3\t4");
		for(int i =0; i < arr.length; i++) {
			System.out.print(i+ "\t");
			for( int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println();
	}
	System.out.print("프로그램을 종료합니다.");
 }
}