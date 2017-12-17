import java.io.BufferedWriter;
import java.io.*;
import java.io.FileWriter;
import java.util.Scanner;

//题目：有五个学生，每个学生有3门课的成绩，从键盘输入以上数据（包括学生号，姓名，三门课成绩），
//计算出平均成绩，况原有的数据和计算出的平均分数存放在磁盘文件"stud"中。
public class Programe50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[][] a = new String[5][6];
		for(int i = 1; i<6;i++) {
			System.out.println("请输入第"+i+"个学生的学号：");
			a[i-1][0]= sc.nextLine();
			System.out.println("请输入第"+i+"个学生的姓名：");
			a[i-1][1]= sc.nextLine();
			for(int j = 1;j<4;j++) {
				System.out.println("请输入该学生的第"+j+"个成绩：");
				a[i-1][j+1] = sc.nextLine();						
			}
			System.out.println("\n");
		}
		float avg;
		int sum;
		for(int i =0 ; i<5;i++) {
			sum=0;
			for(int j = 2;j<5;j++) {
				sum+=Integer.parseInt(a[i][j]);
			}
			avg = (float)sum/3;
			a[i][5] = String.valueOf(avg);
		}
		String s1;
		try {
			File f = new File("e:\\stud");
			if(f.exists()) {
				System.out.println("文件存在！");
			}else {
				System.out.println("文件不存在，正在创建文件");
				f.createNewFile();	//文件不存在，创建文件
			}
			BufferedWriter output = new BufferedWriter(new FileWriter(f));
			for(int i = 0; i < 5; i++) {
				for(int j = 0; j< 6;j++) {
					s1 = a[i][j]+"\r\n";
					output.write(s1);
				}
			}
			output.close();
			System.out.println("数据已经写入e盘文件stud中！");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
