/* 
snake case---->
Snake Case is naming with words separated by _ ( underscore ) and all small letters
Generally, Snake Case is used for Variable Naming
Ex :- snake_case, new_word 
kebab-case----->
Kebab Case is naming with words separated by — ( hyphen ) with all small letters
Generally, Kebab Case is used for CSS naming
Ex :- new-word, kebab-case
*/

public class snakecase {
     public static void main(String args[])
    {
        String str = "AllTheBest";
        System.out.print(camelToSnake(str));
    }
    public static String camelToSnake(String str)
    {
        String result = "";
        
        char c = str.charAt(0);
        result = result + Character.toLowerCase(c);

        for (int i = 1; i < str.length(); i++)
        {
            char ch = str.charAt(i);
 
            // Check if the character is upper case  then append '_' and such character  (in lower case) to result string
            if (Character.isUpperCase(ch)) {
                result = result + '_';
                result= result+ Character.toLowerCase(ch);
            }
 
            // If the character is lower case then add such character into result string
            else {
                result = result + ch;
            }
        }
 
        return result;
    }
 
   
    
}
