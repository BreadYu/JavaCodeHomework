/*
实现双色球中奖号码的生成
*/
import java.util.Arrays;
public class PrizeNum{
	public static void main(String[] args){
	//生成一个大小为7的数组
		int[] arr = new int[7];
	//前六个元素存储1-33的整数
		for(int i = 0; i<6; i++){
			arr[i] = (int)(Math.random()*(33) + 1);
		}
	//最后一位存储1-17的整数
		arr[6] = (int)(Math.random()*(17) + 1);
	//打印数组
		System.out.println(Arrays.toString(arr));
	}
}