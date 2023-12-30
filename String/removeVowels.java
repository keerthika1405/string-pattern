public class removeVowels{
    public static void main(String []args){
        String st = "welcometocode";
        removeVowel(st);
    }
    public static void removeVowel(String st){
        for(int i=0;i<st.length();i++){
            char ch=st.charAt(i);// charAt()It returns a character at the specified index of the current string
        
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            continue;
        }
        System.out.print(ch);
        }
    }
}