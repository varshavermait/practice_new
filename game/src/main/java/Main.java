import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	public static void main(String args[])
	{
		String s = "";
		
		String original = "[0-9a-zA-Z #,/.''&\\-@!$%*()_+={}|:;’ `\\[\\]\\^\\~\\\\\"]{1,60}$";
		String regexEncoded = "5b302d39612d7a412d5a20232c2f2e27265c2d402124252a28295f2b3d7b7d7c3a3be2809920605c5b5c5d5c5e5c7e5c5c225d7b312c36307d24";
		
		if (regexEncoded != null && !regexEncoded.isEmpty()) {
			
			// ByteBuffer buffer = StandardCharsets.UTF_8.encode(original);
			
//			ByteBuffer buffer =  str_to_bb(regexEncoded, StandardCharsets.UTF_16);
//			// System.out.println("got from buffer*** "+buffer.array().hashCode());
//			String utf8EncodedString = StandardCharsets.UTF_16.decode(buffer).toString();
//			
	        byte[] decodedBytes = new BigInteger(regexEncoded, 16).toByteArray();
	        String regex = new String(decodedBytes, StandardCharsets.UTF_8);
	        System.out.println("regex after doing decoding {}"+ regex);
	        s = regex;
	    }
		
		s = "[0-9a-zA-Z #,/.'&\\-@!$%*()_+={}|:;\\u2019 `\\[\\]\\^\\~\\\\\"]{1,60}$";
		String c = "Morgan\u2019s Checking";
		Main m = new Main();
		System.out.println(c);
		System.out.println("" + m.isMatched(s, c));
	}
	
	public boolean isMatched(String regex, String name) {
		System.out.println("regex and name {} {}"+ regex+", "+ name);
		Pattern pattern = Pattern.compile(regex);
        System.out.println("pattern in common util {}"+ pattern);
        Matcher matcher = pattern.matcher(name);
        System.out.println("matcher in common util {}"+ matcher);
        System.out.println("matcher matches in common util {}"+ matcher.matches());
        // Pattern.matches(regex, name);
        return matcher.matches();
    }
	
	public static ByteBuffer str_to_bb(String msg, Charset charset){
	    return ByteBuffer.wrap(msg.getBytes(charset));
	}
	
	public static String bb_to_str(ByteBuffer buffer, Charset charset){
	    byte[] bytes;
	    if(buffer.hasArray()) {
	        bytes = buffer.array();
	    } else {
	        bytes = new byte[buffer.remaining()];
	        buffer.get(bytes);
	    }
	    return new String(bytes, charset);
	}

}
