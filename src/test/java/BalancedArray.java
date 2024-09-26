import java.util.Arrays;

public class BalancedArray {

	public static void main(String[] args)
	{	
	  int ar[] = {45, 11, 0 , 23, 89, 0 , 1, 0};	
	  int index = 0 ;
	  
	  for(int i = 0; i<ar.length; i++)
	  {
		  if(ar[i]!=0)
		  {
		    ar[index++] = ar[i];
		  }
	  }
	  while(index<ar.length)
	  {
		  ar[index++]=0;
	  }
	  
	  System.out.println(Arrays.toString(ar));
	
	}
}
