public class get {

        public static String customTrim(String original) {
            int start = 0;
            
            int end = original.length() - 1;
    
            // Find the index of the first non-whitespace character from the start
            while (start <= end && Character.isWhitespace(original.charAt(start))) {
                start++;
            }
    
            // Find the index of the first non-whitespace character from the end
            while (end >= start && Character.isWhitespace(original.charAt(end))) {
                end--;
            }
    
            // Return the substring between the first non-whitespace characters
            return original.substring(start, end + 1);
        }
    
        public static void main(String[] args) {
            String original = "   Hello, World!   ";
    
            // Trim the string using custom method
            String trimmed = customTrim(original);
    
            // Print the results
            System.out.println("Original: '" + original + "'");
            System.out.println("Trimmed: '" + trimmed + "'");
            // Output:
            // Original: '   Hello, World!   '
            // Trimmed: 'Hello, World!'
        }
    
    



    // public static void main(String[] args) {
      
    //     String result = String.join("| ", "apple", "banana", "orange");

      
    //     System.out.println("Joined String: " + result);  // Output: Joined String: apple, banana, orange
    // }

    // // public static String customReplaceFirst(String original, String target, String replacement) {
    //     int index = original.indexOf(target);

    //     // If the target substring is found, replace it; otherwise, return the original string
    //     if (index != -1) {
    //         return original.substring(0, index) + replacement + original.substring(index + target.length());
    //     } 
    //     else {
    //         return original;
    //     }
    // }
    // public static void main(String[] args) {
    //     String str = " banana apple orange apple";

    //     String result = customReplaceFirst(str, "apple", "fruit");

    //     System.out.println("Modified String: " + result); // Output: Modified String: fruit banana apple orange apple
    // }



        // public static int customIndexOf(String target, String str) {
        //     for (int i = 0; i <= str.length() - target.length(); i++) {
        //         if (str.substring(i, i + target.length()).equals(target)) {
        //             return i;  // Return the index if the substring is found
        //         }
        //     }
        //     return -1;  
        // }
    
        // public static void main(String[] args) {
        //     String myString = "Hello, World!";
        //     String targetSubstring = "World";
    
        //     int indexOfWorld = customIndexOf(targetSubstring, myString);
    
        //     System.out.println("Index of 'World': " + indexOfWorld);  // Output: Index of 'World': 7
        // }
    }
    
    // public static void main(String[] args) {
    //     String str1 = "Collection of tutorials";
    //     String str2 = "Consists of different tutorials";
    //     /* matches characters from index 14 in str1 to characters from
    //        index 22 in str2 considering same case of the letters */
    //     boolean match1 = str1.regionMatches(14, str2, 22, 9);
    //     System.out.println("region matched = " + match1);    
    //     /* considering different case, "true" is set which will ignore
    //        case when matched */
    //     str2 = "Consists of different Tutorials";
    //     match1 = str1.regionMatches(true, 14, str2, 22, 9); 
    //     System.out.println("region matched = " + match1);   
    //  }



    
//     public static void main(String[] args) {
//         String str1 = "apple";
//         String str2 = "Orange";

//         // Compare strings lexicographically ignoring case differences
//         int result = str1.compareToIgnoreCase(str2);

//         if (result < 0) {
//             System.out.println("str1 comes before str2");
//         } else if (result > 0) {
//             System.out.println("str1 comes after str2");
//         } else {
//             System.out.println("str1 and str2 are equal ignoring case");
//         }
//     }
//     // In this example, str1 and str2 are compared lexicographically ignoring case differences. Since "apple" comes before "Orange" in dictionary order (when ignoring case), 
//     // result will be a negative integer, indicating that str1 comes before str2. If the two strings were equal ignoring case, result would be 0. If str1 came after str2 ignoring case, result would be a positive integer.
// }






        // public static void main(String[] args) {
        //     String str1 = "apple";
        //     String str2 = "orange";
    
        //     // Compare strings lexicographically
        //     int result = str1.compareTo(str2);
    
        //   //Since 'a' (97) comes before 'o' (111) in Unicode order, the result of the comparison is negative.
        //   //Specifically, the difference between the Unicode values of 'o' and 'a' is 111 - 97 = -14.
        //     if (result < 0) {    //negative
        //         System.out.println("str1 comes before str2");
        //     } 
        //     else if (result > 0) {  //positive
        //         System.out.println("str1 comes after str2");
        //     } 
        //     else { //equal
        //         System.out.println("str1 and str2 are equal");
        //     }
        // }





    
    // public static void main(String[] args) {
    //     String str = "Hello, World!";

    //     byte[] byteArray = str.getBytes();

    //     for (byte b : byteArray) {
    //         System.out.print(b + " ");
    //     }
    // }





//   import java.nio.charset.Charset;
    // public static void main(String[] args) {
    //     String str = "Hello, World!";
       
    //     byte[] byteArray = str.getBytes(Charset.forName("UTF-8"));

    //     for (byte b : byteArray) {
    //         System.out.print(b + " ");
    //     }
    // }




// import java.io.UnsupportedEncodingException;
    // public static void main(String[] args) {
    //     String str = "Hello, World!";
    
    //     try {
    //         byte[] byteArray = str.getBytes("UTF-8");

    //         for (byte b : byteArray) {
    //             System.out.print(b + " ");
    //         }
    //     } 
    //     catch (UnsupportedEncodingException e) {
    //         System.out.println("Unsupported encoding: " );
    //     }
    // }




        // public static void main(String[] args) {
        //     String str = "Hello, World!";
        //     char[] charArray = new char[10]; // Destination character array
    
        //     str.getChars(7, 13, charArray, 0);
    
        //     for (char c : charArray) {
        //         System.out.print(c); // Output: World!
        //     }
        // }

