//题目：一个整数，它加上100后是一个完全平方数，再加上168又是一个完全平方数，请问该数是多少？ 
//1.程序分析：在10万以内判断，先将该数加上100后再开方，再将该数加上168后再开方，如果开方后的结果满足
//如下条件，即是结果。请看具体分析：
public class Programe13 {
	public static void main(String[] args) {
		for(int i=1;i<100000;i++) {
			if(Math.sqrt(i+100)%1==0) {
				if(Math.sqrt(i+268)%1==0) {
					System.out.println(i+"\t加100是一个完全平方数，再加168又是一个完全平方数");
				}
			}
		}
	}
}
