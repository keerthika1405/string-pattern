package stringbuildin;
public class codebefore {
        public static void main(String[] args) {
            String text = "Hello,😊World!";
            int index = 0;
    
            while (index < text.length()) {
                int codePoint = text.codePointAt(index);
                System.out.println("Code Point at index " + index + ": " + codePoint);
                index = text.offsetByCodePoints(index, 1);
            }
        }
     }
    
    
        // public static void main(String[] args) {
        //     String str = "Hello,😊😊World!."; // String with Unicode and non-Unicode characters
        //     String str1 = "Hello,World!."; 
        //       System.out.println(str.length());   
         
        //     int codePointCount = str.codePointCount(0, 8); //index(0-8)=>(Hello,😊😊) surrogate pair of emoji represent single unicode character
        //     int codePointCount1 = str1.codePointCount(0, 8);// index (0-8)=>(Hello,Wo) 


        //     System.out.println("Number of Unicode code points: " + codePointCount); // Output: Number of Unicode code points: 7
        //    System.out.println("Number of Unicode code points: " + codePointCount1);//Output: Number of Unicode code points: 8
        // }       
   

    //   public static void main(String[] args) {
    //         String str = "Hello, World!";
    //         int index = 8; 
    
    //         int unicodeCodePoint = codePointBefore(str, index);
    //         System.out.println("Unicode code point before index " + index + ": " + unicodeCodePoint); // Output: Unicode code point before index 8: 32
    //     }

    //     public static int codePointBefore(String str, int index) {
    //         if (index > 0 && index < str.length()) {
    //             char currentChar = str.charAt(index-1);
               
    //             if (Character.isLowSurrogate(currentChar)) {
    //                 char lowSurrogate = currentChar;
    //                 char highSurrogate = str.charAt(index - 1);
                  
    //                 if (Character.isHighSurrogate(highSurrogate)) {
    //                     return Character.toCodePoint(highSurrogate, lowSurrogate);
    //                 }
    //             }
    //             return (int) currentChar;
    //         }
    //         return -1;
    //     }
    
    




        // public static void main(String[] args) {
        //     String str = "Hello, World!";
        //     int index = 8; 
    
        //     int codePoint = str.codePointBefore(index);
    
       
        //     System.out.println("Unicode code point before index " + index + ": " + codePoint); // Output: Unicode code point before index 8: 32
        // //current index is 8 : o (but it will print  before the index of 8, character is W :87)
        // }
    
    

