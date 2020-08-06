/*
找出1000以内所有完数
*/
public class PerfectNum{
	public static void main(String args[]){
		//在数字1-1000中查找
		for(int i = 1; i <= 1000; i++){
			int sum = 0;
		//每个数字i在1-(i-1)中一次查找因数
			for(int j = 1; j<=(i-1); j++){
				if(0 == i%j){
					sum += j;
				}
			}
		//检查因数和与数字本身是否相等，相等则打印
			if(sum ==i){
				System.out.print(i + " ");
			}
			
		}
	}
}