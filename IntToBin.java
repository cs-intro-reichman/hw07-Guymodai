/** Returns the binary representation of a given integer. */
public class IntToBin {

    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        System.out.println("Binary representation of " + x + " is: " + toBinary(x));
    }

    /** Returns the binary representation of the given integer, as a string of 0's and 1's.  */
    public static String toBinary(int x) 
        {
               String s = DecToBin1(x);
               if (s.length() == 0)
               {
                   return "0";
               }
               else
               {
                   return s;
               }
        }
    public static String DecToBin1(int number) {
        if(number == 0)
        {
            return "";
        }
        if(number%2 ==0)
        {
           return DecToBin1(number/2) + "0";
        }
        else
        {
           return DecToBin1(number/2) + "1";
        }
  }
}