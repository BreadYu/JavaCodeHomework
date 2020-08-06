/*
打印五子棋棋盘
*/
public class GobangPrint{
	public static void main(String[] args){
		//将空格和0-f放到一个字符数组中
		char[] arr = {' ', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };
		//先打印第一行
		for(int i = 0; i < 17; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		//再打印1-17行
		for(int i = 1; i < 17; i++){
			for(int j = 0; j < 17; j++){
				if (0 == j){
					System.out.print(arr[i] + " ");
				}else {
					System.out.print("+ ");
				}
			}
			System.out.println();
		}
	}
}

