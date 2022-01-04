package array;

import java.util.Arrays;

public class array {
	public void testArray() {
		//�迭 ���� : stack ���� ����, �ּҰ��� ������ ����
		boolean[]booleanArr; //���� �迭   //�ڷ���[] �迭��
		//�迭 �Ҵ� : heap�� ���� ����, ��¥ �����͸� ������ ����
		double[] doubleArr = new double[2];  // �ڷ���[] �迭�� = new �ڷ�ũ��
		
		//�迭 �ʱ�ȭ
		//�ε��� �̿�
		doubleArr[0] = 100.123456;
		doubleArr[1] = Math.random();
		//0 <= Math.random() < 1
		//1���� 10������ ����
		//0*10+1 <= (int)(Math.random()*10)+1 < 1*10+1
		//����� ���� �ʱ�ȭ
		String[] strArr = {"�̸�","����","����"};//ũ�Ⱑ 3�� ���� ����, �� �ʱ�ȭ
		char[] charArr = new char[] {'a','b','c','d','e',};
		
		//for���� �̿��� �ʱ�ȭ
		int[] intArr = new int[6];
		for(int i = 0; i <intArr.length; i++) {
			intArr[i] = i;
		}
		
		
		
		
		//���
		//�ϳ��� �����ؼ� ����ϴ� ���
		for(int i = 0; i < doubleArr.length; i++) {
			System.out.print(doubleArr[i]);
		
	}
		for(int i = 0; i < intArr.length; i++) {
			System.out.print(intArr[i]);
		}
		//��ü ��� = String ��ü�� �̾ƿ��� ��
		System.out.print(Arrays.toString(strArr));
		System.out.print(Arrays.toString(charArr));
	}
	
	
	public void testShallowCopy() {
		//���� ����
		
		int[] originArr = {1,2,3,4,5};
		int[] copyArr = new int[10];
		copyArr = originArr;  //originArr�� �ּҰ��� copyArr�� ����
		
		//���� ��ü�� �����ϴ� ������ �ٲ�� copyArr�� ���� 5
		System.out.println("===��===");
		System.out.println(Arrays.toString(originArr));
		System.out.println(Arrays.toString(copyArr));
		
		originArr[2] = 100;
		
		System.out.println("===��===");
		System.out.println(Arrays.toString(originArr));
		System.out.println(Arrays.toString(copyArr));
		
		//�ּҰ�
		System.out.println("�ּҰ�");
		System.out.println(originArr);
		System.out.println(copyArr);

	}
	
		public void testDeepCopy() {
			//��������
			
			int[] originArr = {1,2,3,4,5};
			//for�� �̿�
			int[] copyArr = new int[10];
			for(int i = 0; i < originArr.length; i++) {
				copyArr[i] = originArr[i];
			}
			
			System.out.println("===��===");
			System.out.println(Arrays.toString(originArr));
			System.out.println(Arrays.toString(copyArr));
			
			originArr[2] = 100;
			
			System.out.println("===��===");
			System.out.println(Arrays.toString(originArr));
			System.out.println(Arrays.toString(copyArr));
			
			//�ּҰ�
			System.out.println("�ּҰ�");
			System.out.println(originArr);
			System.out.println(copyArr);

			
			
		}
	
			public void testDeepCopy2() {
				//���� ���� = arrtcopy()
				int[] originArr = {1,2,3,4,5};
				int[] copyArr = new int[10]; 
				
				
				//src : ���� �迭
				//srcPos: ���� �迭�� ������ ������
				//dest : ī�� �迭
				//destPos: ī�� �迭�� �ٿ��ֱ� ������
				//length : ���� �迭���� ������ ����
				System.arraycopy(originArr, 0, copyArr, 0, originArr.length);
				
				System.out.println("===��===");
				System.out.println(Arrays.toString(originArr));
				System.out.println(Arrays.toString(copyArr));
				
				originArr[2] = 100;
				
				System.out.println("===��===");
				System.out.println(Arrays.toString(originArr));
				System.out.println(Arrays.toString(copyArr));
				
				//�ּҰ�
				System.out.println("�ּҰ�");
				System.out.println(originArr);
				System.out.println(copyArr);
			}
	
	
				 public void testDeepCopy3() {
					 //���� ���� - Arrays.copyOf()
					int[] originArr = {1,2,3,4,5};
					int[] copyArr =  Arrays.copyOf(originArr, originArr.length);
					//int[] copyArr = new int[10];
						
					//original : ���� �迭
					//newLength : ������ ����
					//������ ���� �迭�� 0 ���� ����
					//���� ���Խ��Ѿ���
					copyArr =  Arrays.copyOf(originArr, originArr.length);
						
						
					System.out.println("===��===");
					System.out.println(Arrays.toString(originArr));
					System.out.println(Arrays.toString(copyArr));
					
					originArr[2] = 100;
					//copyArr�� originArr�� �����Ͽ� ���ο� ��ü�� �����ϰ� �Ǿ����Ƿ� ���� 5
					System.out.println("===��===");
					System.out.println(Arrays.toString(originArr));
					System.out.println(Arrays.toString(copyArr));
					
					//�ּҰ�
					System.out.println("�ּҰ�");
					System.out.println(originArr);
					System.out.println(copyArr);
						
				 }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
