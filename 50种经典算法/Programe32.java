import java.util.Random;

//��Ŀ��ȡһ������a���Ҷ˿�ʼ��4��7λ�� 
//��������������������ǣ� 
//(1)��ʹa����4λ�� 
//(2)����һ����4λȫΪ1,����ȫΪ0����������~(~0<<4) 
//(3)��������߽���&���㡣
public class Programe32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		int N = random.nextInt(10000);
		int si = N&15;
		int houyi = N>>4;
		String s = Integer.toBinaryString(si);
		int san = houyi&7;
		String ss = Integer.toBinaryString(san);
		System.out.print(ss+" ");
		System.out.println(s);
		System.out.println("N="+N+' '+"����1��"+houyi+"  "+Integer.toBinaryString(N));
	}

}
