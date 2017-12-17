//题目：打印出如下图案（菱形）
//      * 
//    * * * 
//  * * * * * 
//* * * * * * *
//  * * * * * 
//    * * * 
//      *
public class Programe19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int h = 7;
		int w = 7;
		for (int i = 0; i < (h + 1) / 2; i++) {
			for (int j = 0; j < w / 2 - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k < (i + 1) * 2; k++) {
				System.out.print('*');
			}
			System.out.println();
		}
		for (int i = 1; i <= h / 2; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for(int k = 1;k<=w-2*i;k++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}

}
