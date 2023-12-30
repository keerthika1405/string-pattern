
public class alphabeticheartpattern {
    public static void main(String[] args) {
    
        int n = 5;
        int alpha = 65;
    
        for (int i = n / 2; i < n; i += 2) 
        {   
          for (int j = 1; j < n - i; j += 2) {//print firt spaces
            System.out.print(" ");
          }
        
          for (int j = 1; j < i + 1; j++) {  // print first alphabets
            System.out.print((char)(alpha+j-1));
          }
       
          for (int j = 1; j < n - i + 1; j++) {   // print second spaces
            System.out.print(" ");
          }
        
          for (int j = 1; j < i + 1; j++) {  // print second alphabets
            System.out.print((char)(alpha+j-1));
          }
          System.out.println();
        }

        for (int i = n; i > 0; i--)        // lower part
         {
          for (int j = 0; j < (n - i); j++) 
          {
            System.out.print(" ");
          }
          for (int j = 1; j < (i * 2); j++) 
          {
            System.out.print((char)(alpha+j-1));
          }
          System.out.println();
        }
      }
}
