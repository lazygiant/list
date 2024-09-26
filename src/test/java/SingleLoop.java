import java.util.Arrays;

public class SingleLoop {

	public static void main(String[] args) {

		int arr[] = {34, 1, 223, 11, 89, 101};

		for(int i = 0, j = i+1 ; i<arr.length && j<arr.length ;i++,j++)
		{

			if(arr[i]>arr[j])
			{
				int temp=arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}

		}
		
		
		System.out.println(Arrays.toString(arr));



		/*
		 * for(int i = 0, j=i+1; i < arr.length && j<arr.length;) { if(arr[i] > arr[j])
		 * { int temp = arr[i]; arr[i] = arr[j]; arr[j] = temp; i=0; j=i+1; } else {
		 * i++; j++; } }
		 */

	}
}