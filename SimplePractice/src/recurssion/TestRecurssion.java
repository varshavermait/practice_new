package recurssion;

import java.math.BigDecimal;
import java.security.SecureRandom;
import java.util.Random;

public class TestRecurssion {
	public static Long OAUTH_EWS_TOKEN_EXPIRES_IN = null;
	public static void main(String args[]) {
//		System.out.println("***** Revising recurssion *****");
//		PowerOfN pn = new PowerOfN();
//		System.out.println(pn.calculatePow(2,200));
//		System.out.println(pn.calculatePowRec(5, 3));
//		System.out.println(pn.calculatePowRecOpt(5, -1));
		
		SecureRandom rand = new SecureRandom();
		Random rand1 = new Random();
		
		System.out.println("BigDecimal.valueOf(rand.nextFloat());"+BigDecimal.valueOf(rand.nextFloat()));
		System.out.println("BigDecimal.valueOf(rand.nextFloat());"+BigDecimal.valueOf(rand1.nextFloat()));
		
		
		System.out.println(OAUTH_EWS_TOKEN_EXPIRES_IN);
	}
}
