/** Checks if a given string is a palindrome. */
public class Palindrome {

	public static void main(String[]args) {
    	System.out.println(isPalindrome(args[0]));
    }
	
	/** Checks if the given string is a palindrome. */
	public static boolean isPalindrome(String s) {
		for(int i = 0 ; i < s.length()/2 ; i++)
			{
				if(Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(s.length() - 1 - i))) {
					{
						return false;
					}
			}
    }
		return true;
	}
}