import java.util.Base64;

public class Testing_Encryp_Decrypt_1 {

	public static void main(String[] args) {
		
		String p = "HODFNO23ONCN90DSHEWBCN12JCKCNSHD";
		String rc = "";
		
		byte[] encrypt = Base64.getEncoder().encode(p.getBytes());
		rc= new String(encrypt);
		
		System.out.println("Encrypted:- "+rc);
		
		byte[] decrypt = Base64.getDecoder().decode(encrypt);
		rc=new String(decrypt);
		
		System.out.println("Decrypted:- "+ rc);
	}
}
