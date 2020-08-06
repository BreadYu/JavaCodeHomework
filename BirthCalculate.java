/*
提醒用户输入生日年月日后，自动打印在一年中的第几天。
*/
import java.util.Scanner;
public class BirthCalculate{
	public static void main(String[] args){
		//提示输入生日信息
		System.out.println("请输入您的生日：");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		int month = sc.nextInt();
		int days = sc.nextInt();
		int resultDays = 0;
		//存储每月的天数，二月区分平年和闰年
		int[] monthDays = {31, 0, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		if (year%4 == 0) {
			monthDays[1] = 29;
		} else {
			monthDays[1] = 28;
		}
		//计算在一年中的第几天
		if (month > 1 ){
			for (int i = 0; i<month-1; i++){
				resultDays += monthDays[i];
			}
			resultDays += days;
		} else {
			resultDays = days;
		}
		//打印结果
		System.out.println("您的生日在一年中的第" + resultDays + "天");
		
	}
}