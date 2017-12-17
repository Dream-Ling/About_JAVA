import java.util.Random;

//题目：有一个已经排好序的数组。现输入一个数，要求按原来的规律将它插入数组中。 
//1. 程序分析：首先判断此数是否大于最后一个数，然后再考虑插入中间的数的情况，插入后此元素之后的数，
//依次后移一个位置。
public class Programe30 {
	public static void main(String[] args) {
		int N = 10;
		Random random = new Random();
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = random.nextInt(100);
		}
		System.out.println("排序前：");
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
		System.out.println("排序后：");
		for (int i = 0; i < N; i++) {
			System.out.print(arr[i] + "\t");
		}
	}
}
