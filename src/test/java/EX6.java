
public class EX6 
{
	public static void main(String[] args)
	{
		 String s = "2a3b4c";
		 char ch[] = s.toCharArray();
		 String rev = "";
		 
		 for(int i = 0 ; i <ch.length ; i++)
		 {
			 if(ch[i]>='0'&& ch[i]<='9')
			 {
				 char c = ch[i+1];
				 int value=Character.getNumericValue(ch[i]);
				 
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
