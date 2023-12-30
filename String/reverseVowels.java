public class reverseVowels{
    public static void main(String []args){
        String st = "voltage";
        System.out.println(st);
        removeVowels(st);
    }
    public static void removeVowels(String st){
        char[] s=st.toCharArray();
        int i=0;
        int j=s.length-1;
        
        while(i<j){
            while(i<j){
                while(s[i]!='a'&& s[i]!='e'&& s[i]!='i' && s[i]!='o' &&s[i]!='u'){
                    System.out.println("i:"+s[i]);
                    i++;
                }
                while(s[j]!='a'&& s[j]!='e'&& s[j]!='j' && s[j]!='o' &&s[j]!='u'){
                    System.out.println("j:"+s[j]);
                    j--;
                }
                if(i>=j){
                    break;
                }
                char ch=s[i];
                  System.out.println("ch:"+ch);
                s[i]=s[j];
                s[j]=ch;
                i++;
                j--;
            }
        }
        for(char ch:s){
            System.out.print(ch);
        }
    }
}