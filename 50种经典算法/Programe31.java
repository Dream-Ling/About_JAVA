import java.util.Random;

//��Ŀ����һ��������������� 
//1.����������õ�һ�������һ�������� 
public class Programe31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 10;
		Random random = new Random();
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = random.nextInt(100);	//����0-99֮��������
		}
		System.out.println("����֮ǰ��");
		for (int i = 0; i < N; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("���������");
		for (int i = N-1; i >= 0; i--) {
			System.out.print(arr[i]+" ");
		}
	}

}
