//��Ŀ����5��������һ���ʵ�����˶����ꣿ��˵�ȵ�4���˴�2�ꡣ�ʵ�4������������˵�ȵ�3���˴�2�ꡣ��
//�������ˣ���˵�ȵ�2�˴����ꡣ�ʵ�2���ˣ�˵�ȵ�һ���˴����ꡣ����ʵ�һ���ˣ���˵��10�ꡣ���ʵ����
//�˶�� 
//1.������������õݹ�ķ������ݹ��Ϊ���ƺ͵��������׶Ρ�Ҫ��֪�����������������֪�������˵�������
//�������ƣ��Ƶ���һ�ˣ�10�꣩���������ơ� 
public class Programe23 {
	public static void main(String[] args) {
		digui1 di = new digui1();
		int age=di.sui(5);
		System.out.println(age);
	}
}

class digui1 {
	public int sui(int rsh) {
		int age=0;
		if (rsh == 1) {
			age = 10;
		} 
		else {
			age = 2+sui(rsh-1);
		}
		return age;
	}

}