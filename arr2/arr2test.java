package arr2;

import java.util.Scanner;

public class arr2test {

	public void ar2 () {
		String[] arSubject = {"Java", "Python", "Android", "JSP", "HTML"};
        int[] arScore = {95, 88, 76, 62, 55};
        
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            System.out.print("������� �Է��ϼ���: ");
            String name = sc.next();
            
            for(int i=0; i<arSubject.length; i++) {
                if (arSubject[i].equals(name)) {
                    System.out.println(arSubject[i] + "�� ����: " + arScore[i]);
                }
            }
            
            if (name.equals("�׸�")) {
                break;
            }
        }
    
        sc.close();
        
    }

	public void practice3() {
		int[][] arr = new int[4][4];
		
		int num = 16;
		
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				arr[row][col] = num--;
				System.out.printf("%2d ", arr[row][col]);
			}
			System.out.println();
		}
	}

}
