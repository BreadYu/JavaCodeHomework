/*
�ҳ�1000������������
*/
public class PerfectNum{
	public static void main(String args[]){
		//������1-1000�в���
		for(int i = 1; i <= 1000; i++){
			int sum = 0;
		//ÿ������i��1-(i-1)��һ�β�������
			for(int j = 1; j<=(i-1); j++){
				if(0 == i%j){
					sum += j;
				}
			}
		//��������������ֱ����Ƿ���ȣ�������ӡ
			if(sum ==i){
				System.out.print(i + " ");
			}
			
		}
	}
}