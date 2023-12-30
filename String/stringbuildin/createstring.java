package stringbuildin;
import java.io.UnsupportedEncodingException;
public class createstring {
    public static void main(String[]args) throws UnsupportedEncodingException{
        String str1 = "Hello"; // Using a string literal

        String originalString = "Hello, World!";
        String substring = new String(originalString.substring(0, 5)); // Using a substring

        char[] charArray = {'H', 'e', 'l', 'l', 'o'};
        String str2 = new String(charArray); // Using a character array

        char[] charArray1 = {'H', 'e', 'l', 'l', 'o', ',', ' ', 'W', 'o', 'r', 'l', 'd'};
        String str3 = new String(charArray1, 0, 5); // Creates a string from charArray starting from index 0 with length 5

        String emptyString = new String(); // Creates an empty string

        String originalString1 = "Hello";
        String str5 = new String(originalString1); // String created from another string object

        StringBuilder stringBuilder = new StringBuilder("Hello");
        String str6 = new String(stringBuilder); // String created from StringBuilder

        StringBuffer stringBuffer = new StringBuffer("Hello");
        String str7 = new String(stringBuffer); // String created from StringBuffer

  
        String str8 = new String("Hello".getBytes()); // String created from byte array using the platform's default charset

        String str = "Hello, World!";//(A-Z==65-91) (a-z==97-123)
        byte[] byteArray = str.getBytes();//output - 72 101 108 108 111 44 32 87 111 114 108 100 33 
        byte[] byteArray2 = str.getBytes("UTF-8");//throw unsupportedexception
        byte[] byteArray3 = str.getBytes(java.nio.charset.StandardCharsets.UTF_8);
     
        //In Java, the getBytes() method in the String class is used to encode the string into a sequence of bytes using the platform's default charset and returns the resulting byte array. 


    }
}
