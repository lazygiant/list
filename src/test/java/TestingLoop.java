
public class TestingLoop {

	public static void main(String[] args) {
		
		for(int i = 1; i<=23 ; i++)
		{
			System.out.println(i);
			
			if(i==10)
			{
				System.out.println(89/0);
			}
		}
	}
}
