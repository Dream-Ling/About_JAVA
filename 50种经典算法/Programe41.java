//��Ŀ����̲����һ�����ӣ���ֻ�������֡���һֻ���Ӱ��������ƾ�ݷ�Ϊ��ݣ�����һ������ֻ���ӰѶ��һ
//�����뺣�У�������һ�ݡ��ڶ�ֻ���Ӱ�ʣ�µ�������ƽ���ֳ���ݣ��ֶ���һ������ͬ���Ѷ��һ�����뺣��
//��������һ�ݣ����������ġ�����ֻ���Ӷ����������ģ��ʺ�̲��ԭ�������ж��ٸ����ӣ�
public class Programe41 {

	public static void main(String[] args) {
		// // TODO Auto-generated method stub
		// Recurrence recu = new Recurrence();
		// int ss = recu.rec(5);
		// System.out.println(ss);
		int i, m, j = 0, k, count;
		for (i = 4; i < 10000; i += 4) {
			count = 0;
			m = i;
			for (k = 0; k < 5; k++) {
				j = i / 4 * 5 + 1;
				i = j;
				if (j % 4 == 0)
					count++;
				else
					break;
			}
			i = m;
			if (count == 4) {
				System.out.println("ԭ������ " + j + " ��");
				break;
			}
		}
	}

}

// class Recurrence {
// public int rec(int x) {
// int sum;
// if (x == 1) {
// sum = 6;
// } else {
// sum = 5 * rec(x - 1) + 1;
// }
// return sum;
// }
// }