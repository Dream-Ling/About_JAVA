//【程序3】
//题目：打印出所有的"水仙花数"，所谓"水仙花数"是指一个三位数，其各位数字立方和等于该数本身。例如：
//153是一个"水仙花数"，因为153=1的三次方＋5的三次方＋3的三次方。 
//1.程序分析：利用for循环控制100-999个数，每个数分解出个位，十位，百位。
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
				System.out.println("水仙花数："+i);
			}
		}
	}
}
