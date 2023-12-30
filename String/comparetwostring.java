public class comparetwostring {
    public static void main(String args[])
    {
        String string1 = new String("Geeksforgeeks");
        String string2 = new String("Practice");
        String string3 = new String("Geeks");
        String string4 = new String("Geeks");
        System.out.println("Comparing " + string1 + " and " + string2 + " : " + stringCompare(string1, string2));
        System.out.println("Comparing " + string3 + " and " + string4 + " : " + stringCompare(string3, string4));
        System.out.println("Comparing " + string1 + " and " + string4 + " : " + stringCompare(string1, string4));
    }
    public static int stringCompare(String str1, String str2)
    {
        int l1 = str1.length();
        int l2 = str2.length();
        int lmin = Math.min(l1, l2);
        System.out.println("min"+lmin);
//negative
        for (int i = 0; i < lmin; i++) {
            int str1_ch = (int)str1.charAt(i);
            int str2_ch = (int)str2.charAt(i);
            System.out.println(str1_ch);
            System.out.println(str2_ch);
            if (str1_ch != str2_ch) {
                return str1_ch - str2_ch;
            }
        }
//positive
        if (l1 != l2) {
            return l1 - l2;
        }
//both the strings are equal
        else {
            return 0;
        }
    }   
}
