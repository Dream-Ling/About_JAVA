import java.util.Random;

//��Ŀ����һ���Ѿ��ź�������顣������һ������Ҫ��ԭ���Ĺ��ɽ������������С� 
//1. ��������������жϴ����Ƿ�������һ������Ȼ���ٿ��ǲ����м�����������������Ԫ��֮�������
//���κ���һ��λ�á�
public class Programe30 {
	public static void main(String[] args) {
		int N = 10;
		Random random = new Random();
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = random.nextInt(100);
		}
		System.out.println("����ǰ��");
		for (int i = 0; i < N; i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println();
		for (int i = 1; i < N; i++) {
			if (arr[i] < arr[i - 1]) {
				int pos = i - 1;
				for (int j = 0; j < i; j++) {
					if (arr[j] > arr[i]) {
						pos = j;
						break;
					}
				}
				int temp = arr[i];
				for (int j = i - 1; j >= pos; j--) {
					arr[j + 1] = arr[j];
				}
				arr[pos] = temp;
			}
		}
		System.out.println("�����");
		for (int i = 0; i < N; i++) {
			System.out.print(arr[i] + "\t");
		}
	}
}
