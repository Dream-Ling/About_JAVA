//��Ŀ��809*??=800*??+9*??
//����??�������λ��,8*??�Ľ��Ϊ��λ����9*??�Ľ��Ϊ3λ������??�������λ������809*??��Ľ���� 
public class Programe42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// for (int i = 10; i < 13; i++) {
		// if ((8 * i < 100) && (9 * i > 100 && 9 * i < 1000)) {
		// if (809 * i == 800 * i + 9 * i) {
		// System.out.println(i);
		// System.out.println(i * 809);
		// }
		// }
		// }
		
		
		int a = 809, b, i;
		for (i = 10; i < 13; i++) {
			b = i * a;
			if (8 * i < 100 && 9 * i >= 100)
				System.out.println("809*" + i + "=" + "800*" + i + "+" + "9*" + i + "=" + b);
		}
	}

}
