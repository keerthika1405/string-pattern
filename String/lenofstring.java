public class lenofstring {
    public static void main(String[] args){
        String s = "all the best";
        String r=s.replaceAll(" ", "");
        System.out.println(r);
        length(r);   
    }
        public static void length(String r){  
        int count = 0;
        for(char ch: r.toCharArray()) {
           count++;
        }
        System.out.println(count);
      
}
}
 // int count=0;
        // int i=0;
        // while(r.charAt(i) !='\0')
        //     {
        //      count++;
        //      i++;
        //     } 


//  for(int i = 0; i<r.charAt(i); i++){
//             count++;

        // int count = 0;
        // String s = "all the best";
        // for (int i = 0; i<s.length; i++)
        //     if (s[i] != ' ')
        //         s[count++] = s[i]; // here count is
        //                                 // incremented
             
        // return count;

    
		// int length=0;
		
            // String s = "all the best";
            // int length=0,i=0;
            // String n=s+'\\';
            // while(n.charAt(i) != '\\')
            // {
            // length++;
            // i++;
            // }
            // System.out.println("length of String is "+length); }
    
        //     length(s);
        // }
        //     public static int length(String s){
        //     int len=0;
        //     while(s.isEmpty!=true)
        //     {
        //     s=s.substring(1);
        //     len++;
        //     }
        //     return len;}
        //remove space
            //  for (char c : s.toCharArray()) {
            //      if (c != ' '){
            //          System.out.print(c);}
          //1.
            // for (int i=0;i<s.length();i++)
			// length++;

            //2.
           
            // for (char c : s.toCharArray()){ 
			//     length++;}
            //System.out.println("Length of String is : "+length);

            //3.
           
            // int length=0;
            // for(int i=0;i++){
            //     length++;
            // }
            //  System.out.println("Length of String is : "+length);       
		
   


