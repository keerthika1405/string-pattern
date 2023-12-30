/*pascal case----->
Pascal Case is naming with First letter of each word is Capitalized.
Generally, Pascal Case is used for Class Naming
Ex :- NewWord, PascalCase*/

public class pascalcase {
     public static void main(String[] args) {
        String snake_string ="book or internet";
        String[] parts = snake_string.split(" ");
        int l=parts.length;
        System.out.println(l);
        String PascalString = "";
        
        for (int i = 0; i < l; i++){
            String string = parts[i];
            System.out.println(string.substring(0, 1));
            String temp = string.substring(0, 1).toUpperCase()+string.substring(1);
            PascalString = PascalString.concat(temp);
        }  
        System.out.println(PascalString);
    }
}
