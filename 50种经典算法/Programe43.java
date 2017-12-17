//题目：求0—7所能组成的奇数个数。 
public class Programe43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1-7奇数的个数为1357
		int sum = 4;
		int j;
		System.out.println("组成1位数是 " + sum + " 个");
		sum = sum * 7;
		System.out.println("组成2位数是 " + sum + " 个");
		for (j = 3; j <= 9; j++) {
			sum = sum * 8;
			System.out.println("组成" + j + "位数是 " + sum + " 个");
		}
	}

}
