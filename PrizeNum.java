/*
ʵ��˫ɫ���н����������
*/
import java.util.Arrays;
public class PrizeNum{
	public static void main(String[] args){
	//����һ����СΪ7������
		int[] arr = new int[7];
	//ǰ����Ԫ�ش洢1-33������
		for(int i = 0; i<6; i++){
			arr[i] = (int)(Math.random()*(33) + 1);
		}
	//���һλ�洢1-17������
		arr[6] = (int)(Math.random()*(17) + 1);
	//��ӡ����
		System.out.println(Arrays.toString(arr));
	}
}