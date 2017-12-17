import java.util.Random;

//题目：取一个整数a从右端开始的4～7位。 
//程序分析：可以这样考虑： 
//(1)先使a右移4位。 
//(2)设置一个低4位全为1,其余全为0的数。可用~(~0<<4) 
//(3)将上面二者进行&运算。
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
		System.out.println("N="+N+' '+"后移1："+houyi+"  "+Integer.toBinaryString(N));
	}

}
