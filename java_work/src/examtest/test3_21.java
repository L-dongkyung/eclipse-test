package examtest;

import java.util.Scanner;

public class test3_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� �Է�:");
		int month = sc.nextInt();
		switch(month) {
		case 1 :;
		case 2 : System.out.println("�ܿ�"); break;
		case 3: ;
		case 4: ;
		case 5: System.out.println("��"); break;
		case 6: ;
		case 7: ;
		case 8: System.out.println("����"); break;
		case 9: ;
		case 10: ;
		case 11: System.out.println("����"); break;
		case 12: System.out.println("�ܿ�"); break;
		default : System.out.println("�ùٸ� ���� �Է��Ͻÿ�");
		}
		

	}

}