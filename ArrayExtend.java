/*
����洢��������80%ʱ���Զ�����1.5��
*/
import java.util.Scanner;
import java.util.Arrays;

public class ArrayExtend{
	public static void main(String[] args){
		//��ʾ�����ʼ���������������Ԫ�ص���Ŀ
		System.out.println("����������Ԫ�ظ�����");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int[] arr1 = new int[num1];
		System.out.println("������������Ԫ�ظ�����");
		int num2 = sc.nextInt();
		//��Ԫ�ش�ŵ�������
		if(num2 <= num1){
			for (int i =0; i<num2; i++){
				System.out.print("�������" + i + "�����ݣ�");
				arr1[i] = sc.nextInt();
			}
		//��ӡ����ǰ���
			System.out.println(Arrays.toString(arr1));
		}else {
			System.out.println("����Ԫ�ظ����������鷶Χ��");
		}
		// ����Ԫ�������������鳤��80%������
		if(num2 >= num1*4/5){
			int[] arr2 = new int[num1*3/2];
			for(int i = 0; i < arr1.length; i++ ){
				arr2[i] = arr1[i];
			}
			arr1 = arr2;
		}
		//��ӡ���ݺ���
		System.out.println(Arrays.toString(arr1));	
	}
}