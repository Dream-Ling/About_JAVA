import java.util.Random;

//��Ŀ���������飬�������һ��Ԫ�ؽ�������С�������һ��Ԫ�ؽ�����������顣
public class Programe35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 10;
		int[] arr = new int[N];
		Random random = new Random();
		int minIndex = 0;
		int maxIndex = 0;
		for (int i = 0; i < N; i++) {
			arr[i] = random.nextInt(100);
		}
		System.out.println("����֮ǰ��");
		for (int i = 0; i < N; i++) {
			System.out.print(arr[i]+"\t");
		}
		for (int i = 0; i < N; i++) {
			if (arr[minIndex] > arr[i]) {
				minIndex = i;
			}
			if (arr[maxIndex] < arr[i]) {
				maxIndex = i;
			}
		}
		
		int a = arr[0];
		arr[0] = arr[maxIndex];
		arr[maxIndex] = a;
		
		int b = arr[N-1];
		arr[N-1] =arr[minIndex];
		arr[minIndex] = b;
		System.out.println();
		System.out.println("����֮��");
		for (int i = 0; i < N; i++) {
			System.out.print(arr[i]+"\t");
		}
	}

}
