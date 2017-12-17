//题目：求100之内的素数
public class Programe27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		for (int i = 0; i < 100; i++) {
			for (int j = 2; j <=i; j++) {
				if (i % j == 0 && i!=j) {
					break;
				} 
				else if(i==j) {
					count++;
					System.out.print(i + "\t");
				}
			}
		}
		System.out.println();
		System.out.println("总共" + count + "个素数");
	}

}
