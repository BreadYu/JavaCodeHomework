/*
�����û��������������պ��Զ���ӡ��һ���еĵڼ��졣
*/
import java.util.Scanner;
public class BirthCalculate{
	public static void main(String[] args){
		//��ʾ����������Ϣ
		System.out.println("�������������գ�");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		int month = sc.nextInt();
		int days = sc.nextInt();
		int resultDays = 0;
		//�洢ÿ�µ���������������ƽ�������
		int[] monthDays = {31, 0, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		if (year%4 == 0) {
			monthDays[1] = 29;
		} else {
			monthDays[1] = 28;
		}
		//������һ���еĵڼ���
		if (month > 1 ){
			for (int i = 0; i<month-1; i++){
				resultDays += monthDays[i];
			}
			resultDays += days;
		} else {
			resultDays = days;
		}
		//��ӡ���
		System.out.println("����������һ���еĵ�" + resultDays + "��");
		
	}
}