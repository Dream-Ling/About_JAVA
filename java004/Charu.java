public class Charu{
	public static void main(String[] args){
		int []arr = {24,34,45,567,8,90,234,67,123};
		for(int i = 1; i < arr.length; i++){
			if(arr[i]<arr[i-1]){
				int pos = i-1;
				for(int j = 0; j<i;j++){
					if(arr[j]>arr[i]){
						pos = j;
						break;
					}
				}
				int temp = arr[i];
				for(int j = i-1; j>=pos;j--){
					arr[j+1] = arr[j];
				}
				arr[pos] = temp
			}			
		}		
		for(int i = 0;i<arr.length;i++){
			System.out.print(arr[i]+"\t");
		}
	}

}


























