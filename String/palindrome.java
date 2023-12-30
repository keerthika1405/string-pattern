public class palindrome {
    public static void main(String[] args) {
        String str = "madam"; 
        String reverseStr = "";
        
        int Len = str.length();

        for (int i = (Len - 1); i >=0; --i) {
          reverseStr = reverseStr + str.charAt(i);
          System.out.println(reverseStr);
        }

        if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
          System.out.println(str + " is a Palindrome String.");
        }
        else {
          System.out.println(str + " is not a Palindrome String.");
        }
      }  
}
// m
// ma
// mad
// mada
// madam
// madam is a Palindrome String.