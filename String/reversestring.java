public class reversestring {
    public static void main(String []args){
        String st = "program";
         String nstr="";
         char ch;
          for (int i=0; i<st.length(); i++)
          {
            ch= st.charAt(i); //extracts each character
            nstr= ch+nstr; //adds each character in front of the existing string
            System.out.println(nstr);
          }
          System.out.println("Reversed word: "+ nstr);
        }
 }
 
// p
// rp
// orp
// gorp
// rgorp
// argorp
// margorp
// Reversed word: margorp
