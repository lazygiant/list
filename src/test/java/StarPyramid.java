
public class StarPyramid {

	public static void main(String[] args) {
		
		for(int i = 1 ; i <=3 ; i++)
		{
			for(int j = 1 ; j <=3-i ; j++)
			{
				System.out.print(" ");
			}
			for(int k = 1 ; k <2*i ; k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
