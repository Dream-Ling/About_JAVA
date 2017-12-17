public class Xuanze{
	public static void main(String[] args){
		int []arr = {123,3,4,546,234,78,4,4,56};
		for(int x =0;x<arr.length-1;x++){
			for(int y = x+1;y<arr.length;y++){
				if(arr[x]>arr[y]){
					int temp = arr[x];
					arr[x] = arr[y];
					arr[y] = temp;					
				}	
			}
		}
		for(int x = 0;x < arr.length; x++){
			System.out.prints(arr[x]+"\t");
		}
	}
}