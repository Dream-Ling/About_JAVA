//��Ŀ����1��2��3��4�����֣�����ɶ��ٸ�������ͬ�����ظ����ֵ���λ�������Ƕ��٣� 
//1.��������������ڰ�λ��ʮλ����λ�����ֶ���1��2��3��4��������е����к���ȥ �����������������С� 
public class Programe11 {
	public static void main(String[] args) {
		int count = 0;
		for (int i = 1; i < 5; i++) {
			for (int j = 1; j < 5; j++) {
				for (int k = 1; k < 5; k++) {
					if(i!=j&&j!=k&&i!=k) {
						count++;
						System.out.print(i*100+j*10+k+"\t");
					}
				}
			}
			System.out.println();
		}
		System.out.println("�ܹ���"+count+"����λ��");
	}
}
