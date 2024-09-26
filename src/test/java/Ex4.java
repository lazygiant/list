
public class Ex4 {

	public static void main(String[] args) {
		
		String s = "a1b34%c5$";
		char ch[] = s.toCharArray();
		int sum = 0 ;
		for(int i = 0 ; i<ch.length ; i++)
		{
			if(ch[i]>='0'&& ch[i]<='9')
			{
				int value = Character.getNumericValue(ch[i]);
				sum = sum + value;
			}
		}
		System.out.println(sum);
	}
}
