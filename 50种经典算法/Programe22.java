//题目：利用递归方法求5!。 
//1.程序分析：递归公式：fn=fn_1*4! 

public class Programe22 {
	public static void main(String[] args) {
		digui di = new digui();
		di.rec(5);
	}
}
class digui{
	public long rec(int x) {
		long value = 0;
		if(x == 1) {
			value = 1;
		}
		else {
			value = x*rec(x-1);
		}
		return value;
	}
}
