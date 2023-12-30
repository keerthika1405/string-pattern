/* 
MACRO_CASE----->
Macro case is naming with all letters Capitalized but the words are joined with _ ( underscore)
Generally, Macro case is used for Preprocessor and constants
Ex :- NEW_WORD, MACRO_CASE

Train-Case---->
Train Case is naming with first character of every word of name is Capitalised and words are connected with — ( hyphen ).
Ex :- New-Word, Train-Case
*/

public class upperorlower {
    public static void main(String[] args) {    
            
        String str1="KeeRthIkA";    
        StringBuffer newStr=new StringBuffer(str1);
//A string buffer is like a String , but can be modified. At any point in time it contains some particular sequence of characters, but the length and content of the sequence can be changed through certain method calls. String buffers are safe for use by multiple threads.       
//The setCharAt(int index, char ch) method of StringBuilder class is used to set the character at the position index passed as ch
//The toLowerCase() method converts a string to lower case letters. 
//The toUpperCase() method converts a string to upper case letters
            
        for(int i = 0; i < str1.length(); i++) {   
            if(Character.isLowerCase(str1.charAt(i))) {    
                newStr.setCharAt(i, Character.toUpperCase(str1.charAt(i))  );    
            }      

            else if(Character.isUpperCase(str1.charAt(i))) {    
                newStr.setCharAt(i, Character.toLowerCase(str1.charAt(i)));    
            }    
        }    
        System.out.println("case conversion : " + newStr);    
    }    
    
}
