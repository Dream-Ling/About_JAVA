/*
 * 	����
 * 		��ͬһ���������͵����ݣ�����ͬһ�����ƣ��Ĳ���
 * 
 * 	          ���ʣ� ���ڴ���  ռ�������Ĵ洢��Ԫ
 * 
 * 
 * int a = 1;
 * int b = 2;
 * int c = 3;
 *  
 * System.out.println(a);
 * System.out.println(b);
 * System.out.println(c);
 * 
 * ����1.ѭ���������Ԫ��
 * 
 * int arr[] = {1,2,3}
 * for(int i = 0; i < arr.length; i++){
 * 		 System.out.println(arr[i]);
 * }
 * 
 *����1.�ҳ���������С��Ԫ��
 *   
 *����2.Ѱ��������ָ����ֵ��ɾ��
 * 
 * 
 * ��չ�� SQL ע ��
 * 		��η�ֹ sqlע�룿 	����         �ַ���ת��  
 * 
 * 
 * ѡ������	��iλ��������Сֵ����iλ�� Ԫ�� ����
 * 
 * ��iλ����
 * for(int i = 0; i<arr.length-2;i++){
 * 		int minIndex = i;
 * 		for(int j = i+1;j<arr.length;j++){
 * 			if(arr[j]<arr[minIndex]){
 * 				minIndex = j;
 * 			} 
 * 		}
 * 		//����
 * 		int temp = arr[i];
 * 		arr[i] = arr[minIndex];
 * 		arr[i] = temp; 
 * }
 * 
 * */

public class java003_01 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 9, 3, 4, 10, 5, 6, 7, 8 };

		// �ҳ������е���Сֵ
		// ---------------����1--------------
		//
		// int min = arr[0];
		// for (int i = 0; i < arr.length; i++) {
		// if (arr[i] < min) {
		// min = arr[i];
		// }
		// }
		// System.out.println(min);

		// ----------------����2-------------
		// int minIndex = 0;
		// for(int i = 1;i<arr.length;i++) {
		// if(arr[minIndex]>arr[i]) {
		// minIndex = i;
		// }
		// }
		// System.out.println(minIndex);
		// System.out.println(arr[minIndex]);

		// int n = 4;
		// // Ĭ�ϲ����ڣ�
		// int index = -1;
		// // Ѱ��ָ������ ɾ��
		// for (int i = 0; i < arr.length; i++) {
		// if (arr[i] == n) {
		// index = i;
		// break;
		// }
		// }
		// System.out.println(index);
		// for (int i = index; i < arr.length - 1; i++) {
		// arr[i] = arr[i + 1];
		// }
		// arr[arr.length - 1] = 0;
		// for (int i = 0; i < arr.length; i++) {
		// System.out.print(arr[i] + "\t");
		// }
		for (int i = 0; i < arr.length - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			// ����
			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
		}
		for (int k = 0; k < arr.length; k++) {
			System.out.print(arr[k] + "\t");
		}

	}
}
