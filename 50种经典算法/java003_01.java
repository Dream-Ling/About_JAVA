/*
 * 	数组
 * 		对同一种数据类型的数据，进行同一（类似）的操作
 * 
 * 	          本质： 在内存中  占用连续的存储单元
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
 * 案例1.循环输出数组元素
 * 
 * int arr[] = {1,2,3}
 * for(int i = 0; i < arr.length; i++){
 * 		 System.out.println(arr[i]);
 * }
 * 
 *案例1.找出数组中最小的元素
 *   
 *案例2.寻找数组中指定的值，删除
 * 
 * 
 * 扩展： SQL 注 入
 * 		如何防止 sql注入？ 	加密         字符串转义  
 * 
 * 
 * 选择排序	从i位置起，找最小值，与i位置 元素 交换
 * 
 * 从i位置起
 * for(int i = 0; i<arr.length-2;i++){
 * 		int minIndex = i;
 * 		for(int j = i+1;j<arr.length;j++){
 * 			if(arr[j]<arr[minIndex]){
 * 				minIndex = j;
 * 			} 
 * 		}
 * 		//交换
 * 		int temp = arr[i];
 * 		arr[i] = arr[minIndex];
 * 		arr[i] = temp; 
 * }
 * 
 * */

public class java003_01 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 9, 3, 4, 10, 5, 6, 7, 8 };

		// 找出数组中的最小值
		// ---------------方法1--------------
		//
		// int min = arr[0];
		// for (int i = 0; i < arr.length; i++) {
		// if (arr[i] < min) {
		// min = arr[i];
		// }
		// }
		// System.out.println(min);

		// ----------------方法2-------------
		// int minIndex = 0;
		// for(int i = 1;i<arr.length;i++) {
		// if(arr[minIndex]>arr[i]) {
		// minIndex = i;
		// }
		// }
		// System.out.println(minIndex);
		// System.out.println(arr[minIndex]);

		// int n = 4;
		// // 默认不存在，
		// int index = -1;
		// // 寻找指定的数 删除
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
			// 交换
			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
		}
		for (int k = 0; k < arr.length; k++) {
			System.out.print(arr[k] + "\t");
		}

	}
}
