public class uppertolowercase{
    public static void main(String []args){
        String st="KeeRthIkA";
        System.out.println(st);
        uppertolowercases(st);
    }
    //uppercasetolowercase
    public static void uppertolowercases(String st){
        char[]s=st.toCharArray();// toCharArray() method converts the given string into a sequence of characters
    for(int i=0;i<s.length;i++){
        char ch=s[i];
        if(ch>='A'&&ch<='Z'){ // for lower to upper case -->(ch>='a'&&ch<='z')
            char ansch=(char)(ch-'A'+'a');// for lower to upper case--> (ch-'a'+'A')
            s[i]=ansch;
        }
    } 
    for(char c:s){
        System.out.print(c);
    }
}
}
    