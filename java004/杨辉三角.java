//�������
public class yanghuisanjiao{
	public static void main(String[] args){
		int [][]arr = new int[10][10];
		System.out.println("1");
		
		for(int i = 1; i < 10; i++){
			//��һ��
			arr[i][0] = 1;
			System.out.print(arr[i][0] + "\t");
			for(int j = 1; j < i; j++){
				arr[i][j] = arr[i-1][j-1] + arr[i-1][j];	
				System.out.print(arr[i][j] + "\t");
			}
			//���һ��
			arr[i][j] = 1;
			System.out.println(arr[i][i]);
		}
	}
}