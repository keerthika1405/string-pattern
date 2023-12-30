import java.io.IOException;

public class countingvowels {
     public static void main(String[] args)
        throws IOException
    {
        String str = "WinOrLose";
        str = str.toLowerCase();
        int l=str.length();
        int count = 0;
 
        for (int i = 0; i < l; i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e'|| str.charAt(i) == 'i'|| str.charAt(i) == 'o'
                || str.charAt(i) == 'u'|| str.charAt(i) == 'A' || str.charAt(i) == 'E'|| str.charAt(i) == 'I'|| 
                str.charAt(i) == 'O'|| str.charAt(i) == 'U')
            {
                count++;
            }
        }
        System.out.println("Total no of vowels in string are: " + count);
    }
    
}
