
public class Ex5 {

	public static void main(String[] args) {
		
		String s = "a2b2a1b1c1";
		String rev = "";
		char ch[] = s.toCharArray();
		for(int i = 0 ; i<ch.length ; i++)
		{
			if(ch[i]>='0'&& ch[i]<='9')
			{
				char c = ch[i-1];
				int value = Character.getNumericValue(ch[i]);
				while(value!=0)
				{
					rev=rev+c;
					value--;
				}
			}
		}
		System.out.println(rev);
	}
}
