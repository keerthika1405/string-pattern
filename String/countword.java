public class countword {
    public static void main(String[] args) {
     
        String msg = "Welcomes You!! All";
        String[] arrayStr = msg.split(" ");
        // To Count the number of words
        int totalWord = arrayStr.length;
        // printing the result
        System.out.println("Number of word " + totalWord);
     }
    
}
