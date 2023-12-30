public class stringbuilder {
            public static void main(String[] args) {
            // Create a StringBuilder object
            StringBuilder stringBuilder = new StringBuilder("Hello");
    
            // Append text to the StringBuilder
            stringBuilder.append(", World!");

            // Insert text at a specific position
            stringBuilder.insert(6, "Java ");
    
            // Replace a portion of the string
            stringBuilder.replace(0, 5, "Greetings");
    
            // Delete characters from the StringBuilder
            stringBuilder.delete(10, 18);
    
            // Print the final content of the StringBuilder
            System.out.println("Final String: " + stringBuilder.toString());
        }
    }
    

