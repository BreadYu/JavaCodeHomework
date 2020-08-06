/*
数组存储到容量的80%时，自动扩容1.5倍
*/
import java.util.Scanner;
import java.util.Arrays;

public class ArrayExtend{
	public static void main(String[] args){
		//提示输入初始数组的数量和输入元素的数目
		System.out.println("请输入数组元素个数：");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int[] arr1 = new int[num1];
		System.out.println("请输入想输入元素个数：");
		int num2 = sc.nextInt();
		//将元素存放到数组中
		if(num2 <= num1){
			for (int i =0; i<num2; i++){
				System.out.print("请输入第" + i + "个数据：");
				arr1[i] = sc.nextInt();
			}
		//打印扩容前结果
			System.out.println(Arrays.toString(arr1));
		}else {
			System.out.println("输入元素个数超出数组范围！");
		}
		// 输入元素数量超出数组长度80%后扩容
		if(num2 >= num1*4/5){
			int[] arr2 = new int[num1*3/2];
			for(int i = 0; i < arr1.length; i++ ){
				arr2[i] = arr1[i];
			}
			arr1 = arr2;
		}
		//打印扩容后结果
		System.out.println(Arrays.toString(arr1));	
	}
}