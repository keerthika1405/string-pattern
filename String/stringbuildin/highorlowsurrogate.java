package stringbuildin;

public class highorlowsurrogate {
      public static void main(String[] args) {
            String str = "Hello, World!";
            int index = 7; 
    
            int unicodeCodePoint = getUnicodeCodeAtPosition(str, index);
            System.out.println(  "Unicode code point at index " + index +" of character is "+str.charAt(index)+ ": " + unicodeCodePoint); // Output: Unicode code point at index 7: 87
        }

        public static int getUnicodeCodeAtPosition(String str, int index) {
            // Check if the index is valid
            if (index >= 0 && index < str.length()) {
                char charAtIndex = str.charAt(index);
            //UTF-16
                if (Character.isHighSurrogate(charAtIndex) && index + 1 < str.length()) {    // If the character is a surrogate pair (UTF-16 supplementary character)
                    char lowSurrogate = str.charAt(index + 1);
                    if (Character.isLowSurrogate(lowSurrogate)) {
                      
                        return Character.toCodePoint(charAtIndex, lowSurrogate);  // Calculate and return the Unicode code point for the surrogate pair
                    }
                }
                //The Unicode code point values for  high surrogates range from '\uD800' to '\uDBFF'. In decimal, these values are from 55296 to 56319.
                //The Unicode code point values for low surrogates range from '\uDC00' to '\uDFFF'. In decimal, these values are from 56320 to 57343.
              
                // If the character is not a surrogate pair, return its Unicode code point
                return (int) charAtIndex;
            } 
            else {
                return -1;
            }
        }
   }
    

