import java.util.Random;

//题目：输入数组，最大的与第一个元素交换，最小的与最后一个元素交换，输出数组。
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
		System.out.println("调换之前：");
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
		System.out.println("调换之后：");
		for (int i = 0; i < N; i++) {
			System.out.print(arr[i]+"\t");
		}
	}

}
