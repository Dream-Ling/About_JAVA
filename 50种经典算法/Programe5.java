import java.util.Scanner;

//【程序5】 
//题目：利用条件运算符的嵌套来完成此题：学习成绩>=90分的同学用A表示，60-89分之间的用B表示，60分以下
//的用C表示。 
//1.程序分析：(a>b)?a:b这是条件运算符的基本例子。
public class Programe5 {
	public static void main(String[] args) {
		int x;
		char grade;
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个整 数成绩：");
		x = sc.nextInt();
		if (x > 100 || x < 0) {
			System.out.println("输入成绩错误！");
		} else {
			grade = x >= 90 ? 'A' : x >= 60 ? 'B' : 'C';
			sc.close();
		}
	}

}
