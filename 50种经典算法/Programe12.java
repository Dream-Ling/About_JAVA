import java.util.Scanner;

//��Ŀ����ҵ���ŵĽ������������ɡ�����(I)���ڻ����10��Ԫʱ���������10%���������10��Ԫ������20��
//Ԫʱ������10��Ԫ�Ĳ��ְ�10%��ɣ�����10��Ԫ�Ĳ��֣��ɿ����7.5%��20��40��֮��ʱ������20��Ԫ�Ĳ�
//�֣������5%��40��60��֮��ʱ����40��Ԫ�Ĳ��֣������3%��60��100��֮��ʱ������60��Ԫ�Ĳ��֣���
//���1.5%������100��Ԫʱ������100��Ԫ�Ĳ��ְ�1%��ɣ��Ӽ������뵱������I����Ӧ���Ž��������� 
//1.����������������������ֽ磬��λ��ע�ⶨ��ʱ��ѽ�����ɳ����͡�
public class Programe12 {
	public static void main(String[] args) {
		System.out.println("�����������򣩣�");
		Scanner sc = new Scanner(System.in);
		double li = sc.nextDouble();
		double run1 = li * 0.1; // ���ڻ����10��Ԫ
		double run2 = (li - 10) * 0.075 + run1; // ����10��Ԫ������20��
		double run3 = (li - 20) * 0.05 + run2; // 20��40��֮��ʱ
		double run4 = (li - 40) * 0.03 + run3; // 40��60��֮��
		double run5 = (li - 60) * 0.015 + run4; // 60��100��֮��
		double run6 = (li - 100) * 0.01 + run5; // ����100��Ԫʱ
		if (li <= 10) {
			System.out.println("Ӧ���ţ�"+run1+"����Ԫ������");
		} else if (li > 10 && li <= 20) {
			System.out.println("Ӧ���ţ�"+run2+"����Ԫ������");
		} else if (li > 20 && li <= 40) {
			System.out.println("Ӧ���ţ�"+run3+"����Ԫ������");
		} else if (li > 40 && li <= 60) {
			System.out.println("Ӧ���ţ�"+run4+"����Ԫ������");
		} else if (li > 60 && li < 100) {
			System.out.println("Ӧ���ţ�"+run5+"����Ԫ������");
		} else
			System.out.println("Ӧ���ţ�"+run6+"����Ԫ������");
		sc.close();
	}
}
