import java.util.*;

//题目：输入某年某月某日，判断这一天是这一年的第几天？ 
//1.程序分析：以3月5日为例，应该先把前两个月的加起来，然后再加上5天即本年的第几天，特殊情况，闰年且
//输入月份大于3时需考虑多加一天。 
public class Programe14 {
	public static void main(String[] args) {
		int year, month, day;
		int days= 0;
		int d=0;
		int e;
		input fymd = new input();
		do {
			e=0;
			System.out.println("请输入年份：");
			year = fymd.inputt();
			System.out.println("请输入月份：");
			month = fymd.inputt();
			System.out.println("请输入日：");
			day = fymd.inputt();
			if(year<0||month<0||month>12||day<0||day>31) {
				System.out.println("输入错误，请重新输入！");
				e=1;
			}
		}while(e==1);
		for (int i = 1; i < month; i++) {
			switch(i) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				days = 31;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				days = 30;
				break;
			case 2:
				if((year%400==0)||(year%4==0&&year%100!=0)) {
					days = 29;
				}else {
					days = 28;
				}
				break;
			}
			d+=days;
		}
		System.out.println(year+"-"+month+"-"+day+" 是这年的第"+(d+day)+"天。");
		
	}
}

class input {
	public int inputt() {
		int value = 0;
		Scanner s = new Scanner(System.in);
		value = s.nextInt();
		return value;
		
	}
}