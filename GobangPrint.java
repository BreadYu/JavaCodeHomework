/*
��ӡ����������
*/
public class GobangPrint{
	public static void main(String[] args){
		//���ո��0-f�ŵ�һ���ַ�������
		char[] arr = {' ', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };
		//�ȴ�ӡ��һ��
		for(int i = 0; i < 17; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		//�ٴ�ӡ1-17��
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

