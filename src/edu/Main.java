/**
 * 
 */
package edu;

import java.util.Scanner;

/**
 * @author user
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//���� �����ϱ�
		int firstNo, secondNo;
		int sum;
		//�μ� �Է��ϱ� : ���̺귯�� ����� �Է��ϰ� �;�
		Scanner scan = new Scanner(System.in);
		System.out.print("ù �� : ");
		firstNo =scan.nextInt();
		System.out.print("�ι�° �� : ");
		secondNo =scan.nextInt();
		//�հ賻��(c=a+b)
		sum = firstNo + secondNo;
		//�հ� ����ϱ�
		System.out.println("�հ�: " + sum);
		
	}

}
