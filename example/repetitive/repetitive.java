package example.repetitive;

public class repetitive {
	
	
	public void testFor() {
		//for(�ʱ��; ���ǽ�; ������;){
	    //      " �Է� ����"; 	
	    //}
		
       		for(int i=1; i <=10; i++) {
       			System.out.println(i + "���");
       		}
		
		//i �� ����
		
		    for(int i=10; i > 0; i-- ) {
		    	System.out.print(i + "���");
		    }
		//�������� �ݵ�� 1�� ������ �ʿ� ����  2�� ����
		    for(int i = 0; i<10; i+=2) {
		    	System.out.print(i + "���");
		    }
		//int�� �ƴ� char�Է�, �����ڵ�
		    for(char ch = 'a'; ch <= 'e'; ch++) {
		    	System.out.print(ch + "���");
		    }
		
		
		    
	}
	
	public void testWhile() {
		//�ʱ��
		int i = 0;
		while (i <= 10) {//���ǽ�
			System.out.println(i + "�� ° ���");
	        i++;//������
		}
		
		//����
		
		int j = 10;
		while (j>0) {
			System.out.println(j + "�� ° ���");
			j--;
		}
		
		//���� ���� : ���� ���� �׻� true
		int k = 0;
		while(true) {
			//System.out.println(k++ + "�� ° k���");
			
		}
		
		
		
		
		
	}
	
	public void testDowhile() {
		//�ʱ��
		 int i = 0;
		 do {
			 System.out.println(i + "�� ° i���");
			 i++;//������
		 }while(i < 10);//���ǽ� + �����ݷ�
		 
		 
		 //����
		 int j = 10;
		 do {
			 System.out.println(j + "�� ° j���");
			 j -=2;
		 }while(j > 0);
		 
		 
		 //do- while ���ѷ���
		 int k = 0;
		 do {
			 System.out.println(k++ + "�� ° k���");
		 }while(true);
		 
		 
		 
		 
	}
	
	
	
	public void testForFor() {
		//��ø �ݺ���
		//for��
		for(int i =2; i < 10; i++){
			 System.out.println("==== "+ i +"��====");
			 for(int j =1; j<10; j++){
			  System.out.println(i +"x"+ j +"="+i*j);
		}
			 
	}
		
		//while��
		int i = 2;
		while(i <10) {
			System.out.println("==== "+ i +"��====");
			int j = 1;
			while(j < 10) {
				System.out.println(i +"x"+ j +"="+i*j);
				j++;
			}
			i++;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
