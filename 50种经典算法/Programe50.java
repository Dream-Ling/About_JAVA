import java.io.BufferedWriter;
import java.io.*;
import java.io.FileWriter;
import java.util.Scanner;

//��Ŀ�������ѧ����ÿ��ѧ����3�ſεĳɼ����Ӽ��������������ݣ�����ѧ���ţ����������ſγɼ�����
//�����ƽ���ɼ�����ԭ�е����ݺͼ������ƽ����������ڴ����ļ�"stud"�С�
public class Programe50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[][] a = new String[5][6];
		for(int i = 1; i<6;i++) {
			System.out.println("�������"+i+"��ѧ����ѧ�ţ�");
			a[i-1][0]= sc.nextLine();
			System.out.println("�������"+i+"��ѧ����������");
			a[i-1][1]= sc.nextLine();
			for(int j = 1;j<4;j++) {
				System.out.println("�������ѧ���ĵ�"+j+"���ɼ���");
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
				System.out.println("�ļ����ڣ�");
			}else {
				System.out.println("�ļ������ڣ����ڴ����ļ�");
				f.createNewFile();	//�ļ������ڣ������ļ�
			}
			BufferedWriter output = new BufferedWriter(new FileWriter(f));
			for(int i = 0; i < 5; i++) {
				for(int j = 0; j< 6;j++) {
					s1 = a[i][j]+"\r\n";
					output.write(s1);
				}
			}
			output.close();
			System.out.println("�����Ѿ�д��e���ļ�stud�У�");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
