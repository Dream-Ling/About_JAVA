import java.util.Scanner;

//��Ŀ����n����Χ��һȦ��˳���źš��ӵ�һ���˿�ʼ��������1��3��������������3�����˳�Ȧ�ӣ����������
//����ԭ���ڼ��ŵ���λ��
public class Programe37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("������Ҫ�ų�һȦ��������");
		int n = sc.nextInt();
		boolean[] arr = new boolean[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = true;
		}
		int leftCount = n;
		int countNum = 0;
		int index = 0;
		while(leftCount > 1) {
			if(arr[index] == true) {
				countNum++;
				if(countNum == 3) {
					countNum = 0;
					arr[index] = false;
					leftCount--;
				}
			}
			index++;
			if(index == n) {
				index = 0;
			}
		}
		for(int i = 0; i < n; i++) {
			if(arr[i] == true) {
				System.out.println("ԭ������"+(i+1)+"λ����������");
			}
		}
		sc.close();
	}

}
