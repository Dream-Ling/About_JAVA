import java.util.Random;

//��Ŀ����һ��3*3����Խ���Ԫ��֮�� 
//1.�������������˫��forѭ�����������ά���飬�ٽ�a[i][i]�ۼӺ������ 
public class Programe29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 3;
		int sum = 0;
		Random random = new Random();
		int[][] arr = new int[N][N];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				arr[i][j] = random.nextInt(10);
			}
		}
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if(i==j) {
					sum=sum+arr[i][i];
				}
			}
		}
		System.out.println("�˾���Խ��ߺ�Ϊ��"+sum);
	}

}
