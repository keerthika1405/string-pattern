public class findingduplicatestr {
    public static void main(String[] args) {  
        String str1 = "radar";  
        int len=str1.length();
        // System.out.println(len);
        int count=0;  
        char string[] = str1.toCharArray();  
          
        for(int i = 0; i <len; i++) { 
            for(int j = i+1; j <len; j++) {
                // System.out.println("str[i]"+string[i]); 
                // System.out.println("str[j]"+string[j]); 

                if(string[i] == string[j] && string[i] != ' ') {  
                    count++; 
                    // System.out.println("count"+count); 

                    //Set string[j] to 0 to avoid printing visited character  
                 string[j] = '0';   //important one is the first character printed means(ie r) 
                 //it won't take it in considerartion again for other char comparison
                }  
            }  
            //A character is considered as duplicate if count is greater than 1  
            if(count > 0 && string[i] != '0')  
                System.out.print(""+string[i]+" ");  
        }  
    }    
}
