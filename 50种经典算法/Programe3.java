//������3��
//��Ŀ����ӡ�����е�"ˮ�ɻ���"����ν"ˮ�ɻ���"��ָһ����λ�������λ���������͵��ڸ����������磺
//153��һ��"ˮ�ɻ���"����Ϊ153=1�����η���5�����η���3�����η��� 
//1.�������������forѭ������100-999������ÿ�����ֽ����λ��ʮλ����λ��
public class Programe3 {
	public static void main(String[] args) {
		int gewei;
		int shiwei;
		int baiwei;
		for(int i=100; i < 999; i++) {			
			gewei = i % 10;
			shiwei = (i % 100) / 10;
			baiwei = i / 100;
			if((gewei*gewei*gewei+shiwei*shiwei*shiwei+baiwei*baiwei*baiwei) == i) {
				System.out.println("ˮ�ɻ�����"+i);
			}
		}
	}
}
