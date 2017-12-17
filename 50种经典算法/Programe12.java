import java.util.Scanner;

//题目：企业发放的奖金根据利润提成。利润(I)低于或等于10万元时，奖金可提10%；利润高于10万元，低于20万
//元时，低于10万元的部分按10%提成，高于10万元的部分，可可提成7.5%；20万到40万之间时，高于20万元的部
//分，可提成5%；40万到60万之间时高于40万元的部分，可提成3%；60万到100万之间时，高于60万元的部分，可
//提成1.5%，高于100万元时，超过100万元的部分按1%提成，从键盘输入当月利润I，求应发放奖金总数？ 
//1.程序分析：请利用数轴来分界，定位。注意定义时需把奖金定义成长整型。
public class Programe12 {
	public static void main(String[] args) {
		System.out.println("请输入利润（万）：");
		Scanner sc = new Scanner(System.in);
		double li = sc.nextDouble();
		double run1 = li * 0.1; // 低于或等于10万元
		double run2 = (li - 10) * 0.075 + run1; // 高于10万元，低于20万
		double run3 = (li - 20) * 0.05 + run2; // 20万到40万之间时
		double run4 = (li - 40) * 0.03 + run3; // 40万到60万之间
		double run5 = (li - 60) * 0.015 + run4; // 60万到100万之间
		double run6 = (li - 100) * 0.01 + run5; // 高于100万元时
		if (li <= 10) {
			System.out.println("应发放："+run1+"（万元）奖金");
		} else if (li > 10 && li <= 20) {
			System.out.println("应发放："+run2+"（万元）奖金");
		} else if (li > 20 && li <= 40) {
			System.out.println("应发放："+run3+"（万元）奖金");
		} else if (li > 40 && li <= 60) {
			System.out.println("应发放："+run4+"（万元）奖金");
		} else if (li > 60 && li < 100) {
			System.out.println("应发放："+run5+"（万元）奖金");
		} else
			System.out.println("应发放："+run6+"（万元）奖金");
		sc.close();
	}
}
