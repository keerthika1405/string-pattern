
public  class permutation {
    public static void main(String[] args) {
        String s = "abc";
        printPermutation(s, "");
    }

    static void printPermutation(String str, String ans) {
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
           
            char ch = str.charAt(i);
            
            String ros = str.substring(0, i) + str.substring(i + 1);
           
            printPermutation(ros, ans + ch);
        }
    }
}


// public class permutation {
//     public static void main(String[] args)
//     {
//         String s = "abc";
//        System.out.print(" final out " +printPermutation(s, " "));
//     }
//     static String printPermutation(String str, String ans)
//     {
        
//         if (str.length() == 0) {
//             return " ";
//         }

//         for (int i = 0; i < str.length(); i++) {
//             char ch = str.charAt(i);
//             String ros = str.substring(0, i) + str.substring(i + 1);
           
//             printPermutation(ros, ans + ch);
            
//         }
//         return ;
//     }
// }

 // System.out.print(ans + " ");
            // System.out.print("len"+str.length());
//   System.out.println("ansch"+ans+ch);
// Rest of the string after excluding
            // the ith character
 // System.out.println("sub[0]"+str.substring(0, i));  
            // System.out.println("sub[1]"+str.substring(i + 1));
            //   System.out.println("ros"+ros);
            // Recursive call