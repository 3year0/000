package example.variable;

import java.util.Scanner;

public class variable {
public void intVariable() {
	// ���� ����� ���� �ʰ�ȭ
	
	
	// ����: 1byte
	//��Ÿ�� ǥ�ù� : ù��° �ܾ�� �� ���ڴ� �ҹ���, �߰� �ܾ� ù��°�� �빮��
	
	boolean isTrue = true;
	boolean isFalse = false;
	
	//���� : 2byte
	char ch = 'a'; // ���ڿ� char�� �̱������̼� ���
	
    //���ڿ� : ������ ( �ּҰ� ����)
	// String �ȿ� �����Ͱ� ���� ���� �ƴ�  �����Ͱ� �ִ°��� �������� �� , ���ڿ��� ���� �Ҽ��ֱ� ����
	
	String str = "�ݰ����ϴ�";
	
	//������
	
	//������
	byte bnum = 1;
	short snum = 2;
	int inum = 4;
	long lnum = 8L;
	
	//�Ǽ���
	
	float fnum = 4.0f;
	double dnum = 8.0;  //float�� ���� double�� 2���� �þ�´� , 2�� ��Ȯ��
	

    // ������ ����� �� ����ϱ�
	System.out.println("isTruedml ��: "+ isTrue);
	System.out.println("isFalse ��: "+ isFalse);
	
	
	System.out.println("ch ��: "+ ch);
	System.out.println("str ��: "+ str);
	
	System.out.println("bnum ��: "+ bnum);
	System.out.println("snum ��: "+ snum);
	System.out.println("inum ��: "+ inum);
	System.out.println("lnum ��: "+ lnum);
	
	
	System.out.println("fnum ��: "+ fnum);
	System.out.println("dnum ��: "+ dnum);
	
}

	public void changevalue() {
		
	
		// ������ ���� �׽�Ʈ 
		
		String name;
		char gendar;
		int age;
		double height;
		
		name = "������";
		gendar = 'M';
		age = 30;
		height = 168.9;
		
		System.out.println(name + "���� ��������");
		System.out.println(" gendar : " + gendar);
		System.out.println(" age : "+ age);
		System.out.println("height :  "+ height);
		
		//Ű����� ���� �Է¹޾� ������ ����� �� ����
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�̸��� �Է��ϼ���: ");
		name = sc.nextLine();
		System.out.println("������ �Է��ϼ���: ");
		gendar = sc.next().charAt(0);  //
		System.out.println("���̸� �Է��ϼ���: ");
		age = sc.nextInt();
		System.out.println("Ű�� �Է��ϼ���: ");
		height = sc.nextDouble();
	
		
		System.out.println(name + "���� ��������");
		System.out.println(" gendar : " + gendar);
		System.out.println(" age : "+ age);
		System.out.println("height :  "+ height);
		
		
		//variable�� ��,�ҹ��� ���еȴ�. ����� ��� �Ұ���, ���ڷδ� ���� �ȵ�, Ư������ '_','$'  ��� �����ϳ� '_'�� ���ʻ� ��� ����,  ù �ܾ� ���ڸ��� �ҹ��� �߰��ܾ� ���ڸ��� �빮��
		//variable�� �� ���� data�� 
		//Scanner ? = new Scanner(System.in);   �ڹ� �Է� ����
	}
		

			
		}
	
		
		
		
	

