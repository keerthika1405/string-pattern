
   public class stringimmutable {
        public static void main(String[] args) {

            String originalString = "Hello"; // Original string(mutable)
            System.out.println("Original String: " + originalString);
    
            // Concatenating a new string creates a new object
            String modifiedString = originalString.concat(", World!"); //modification
            System.out.println("Modified String: " + modifiedString);
    
            // The original string remains unchanged
            System.out.println("Original String after Concatenation: " + originalString);
    
            /******************************************************** */
            //To Change  The original string 

            // Reassigning the reference creates a new object
            originalString = originalString.toUpperCase();
            System.out.println("Original String after Conversion: " + originalString);
          
          //Using StringBuilder:(immutable)
          StringBuffer mutableString = new StringBuffer("Hello");
          mutableString.append(", World!");  // Append new content
          mutableString.insert(5, " Java");          // Insert at a specific index 
          mutableString.replace(0, 5, "Greetings"); // Replace a portion of the string
          mutableString.delete(10, 16);   // Delete characters
  

        //Using StringBuilder (immutable)
        StringBuffer stringBuffer = new StringBuffer("Hello");
        stringBuffer.append(", Universe!"); // Append new content
        stringBuffer.insert(5, " Java"); // Insert at a specific index
        stringBuffer.replace(0, 5, "Greetings");  // Replace a portion of the string
        stringBuffer.delete(10, 19);    // Delete characters
        

      }

    }



    
/* 
*Once Created, Cannot Be Changed:
When a string object is created in Java, its value cannot be altered. Any operation that appears to modify the string actually creates a new string object.

*String Modification Creates New Strings:
If you perform operations like concatenation or substring extraction on a string, Java creates a new string object to store the modified value. The original string remains unchanged.

*String Pool:
Java maintains a special memory area called the "string pool." String literals are stored in the string pool, and Java reuses
 existing strings from the pool whenever possible. This behavior enhances memory efficiency.

*Security and Thread Safety:
Immutability makes strings inherently thread-safe. Since strings cannot be modified, they can be 
safely shared among multiple threads without the risk of concurrent modification. Immutability also plays a role in 
ensuring the security of sensitive information, as string contents cannot be changed once set.
    */

