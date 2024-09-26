
public class Star1 {

	public static void main(String[] args) {
		
		// row
		for(int i = 1 ; i<=3 ; i++)
		{
			for(int k = 1 ; k<=3-i; k++)
			{
				System.out.print(" ");
			}
			for(int j = 1 ; j<=i ; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
