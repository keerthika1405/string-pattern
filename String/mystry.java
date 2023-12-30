public class mystry {
    public static void main(String[] args) {
        System.out.println(mystries("java"));
    }
    static String mystries(String input){
        if(input.length()<=1)
        {
            return input;
        }
        else{
             
            return mystries(input.substring(1))+input.charAt(0);
        }
    }
}
