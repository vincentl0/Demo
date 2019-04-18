package Demo;

/**
 * Hello world!
 *
 */

public class App 
{

	public static boolean isPalindrome(String inp) {
		String ret = "";
		for(int i = 0; i < inp.length(); i++) {
			ret = inp.charAt(i) + ret;
					}
		return ret.equals(inp);
	}
    public static void main( String[] args )
    {
    	
        System.out.println("is Hello a palindrome? : " + isPalindrome("HELLO"));
        System.out.println("is HANNAH a palindrome? : " + isPalindrome("HANNAH"));
        
    }
}
