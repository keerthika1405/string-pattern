package stringbuildin;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class stringbuildin {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("apple");
        stringList.add("Banana");
        stringList.add("Orange");
        stringList.add("grapes");

        // Sorting the list using CASE_SENSITIVE_ORDER comparator
        Collections.sort(stringList);
          for (String str : stringList) {
            System.out.println(str);
        }
  //output      // Banana
                // Orange
                // apple
                // grapes

        Collections.sort(stringList, String.CASE_INSENSITIVE_ORDER);
        System.out.println();
        for (String str : stringList) {
            System.out.println(str);
        }
   //output      // apple
                // Banana
                // grapes
                // Orange

    }
}
