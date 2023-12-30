/*Camel case---->
Camel Case is actually inspired from animal “Camel”. 
Where first word will be small letters and from second word, first character will be captialized like camelCase.
Some of the big companies also inspired from this. 
Example like iPhone , eBay

*/
public class camelcase {
    static String convertString( String s )  
    {  
        int ctr = 0 ;  
        int n = s.length( ) ;   
        char ch[ ] = s.toCharArray( ) ;   
        int c = 0 ;  
        for ( int i = 0; i < n; i++ )  
        { 
            if( i==0 )  
            ch[ i ] = Character.toLowerCase( ch[ i ] ) ; 

            if ( ch[ i ] == ' ' )  
            {  
                ctr++ ;   
                ch[ i + 1 ] = Character.toUpperCase( ch[ i + 1 ] ) ;   
                continue ;
  /*The continue statement breaks one iteration (in the loop),
if a specified condition occurs, and continues with the next iteration in the loop  */
            }  
            else  
                ch[ c++ ] = ch[ i ] ;  
        }  
        return String.valueOf( ch, 0, n - ctr ) ;  
    }  
    
    public static void main( String args[ ] )  
    {  
        String str = "max marks()" ;  
        System.out.println( str+" ---> "+convertString( str ) ) ;   
        // String str1 = "Last name" ;  
        // System.out.println(str1+" ---> "+ convertString( str1 ) ) ;  
        // String str2 = "Programming languages." ;  
        // System.out.println( str2+" --->"+convertString( str2 ) ) ;  
    }  
    
}
