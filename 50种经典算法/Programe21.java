//��Ŀ����1+2!+3!+...+20!�ĺ� 
//1.����������˳���ֻ�ǰ��ۼӱ�����۳ˡ� 6��=6*5*4*3*2*1
public class Programe21 {
	public static void main(String[] args) {
		 long jiecheng=1;
		 long sum = 0;
		 for(int i = 1;i<=20;i++) {
		 jiecheng = i*jiecheng;
		 sum = sum+jiecheng;
		 }
		 System.out.println(sum);
    //2561327494111820313
//		long sum = 0;
//		long fac = 1;
//		for (int i = 1; i <= 20; i++) {
//			fac = fac * i;
//			sum += fac;
//		}
//		System.out.println(sum);
	}
}
