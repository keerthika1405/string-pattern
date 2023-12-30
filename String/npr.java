public class npr {

    /*
     * Define a string.
Fix a character and swap the rest of the characters.
Call the generatePermutation() for rest of the characters.
Backtrack and swap the characters again.
     */
      public static void main(String[] args)  
    {  
        String str = "ABC";  
        int len = str.length();   
        Permutation(str, 0, len);  
    }  
     public static void Permutation(String str, int start, int end)  
    {  
        if (start == end-1) { //print
            System.out.println(str);
            // System.out.println("-----------------------");  
        }
        else  
        {  
            for (int i = start; i < end; i++)  
            {  
                str = swapString(str,start,i);  //Swapping the string by fixing a character 
                //  System.out.println("start1"+start);
                //  System.out.println("i1"+i); 
                //  System.out.println("str1"+str);  
                //Recursively calling function generatePermutation() for rest of the characters   
                Permutation(str,start+1,end);  
                  
                 str = swapString(str,start,i);//Backtracking and swapping the characters again.
                //  System.out.println("start2"+start);
                //  System.out.println("i2"+i);  
                // System.out.println("str2"+str);  
            }  
        }  
    } 
    public static String swapString(String a, int i, int j) {  
        char[] b =a.toCharArray();  
        char ch;  
        // System.out.println("b[i]"+b[i]); 
        ch = b[i];  
        b[i] = b[j]; 
        b[j] = ch; 
        // System.out.println("b[j]"+b[j]); 
        // System.out.println("valueof(b)"+String.valueOf(b)); 
        return String.valueOf(b);  
    }     
}

/*valueOf() in Java is used to convert any non String variable or Object
 such as int, double, char, and others to a newly created String object. 
 It returns the string representation of the argument passed.*/
