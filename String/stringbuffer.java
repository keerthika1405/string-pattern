
   public class stringbuffer {


        public static void main(String[] args) {
           
            StringBuffer stringBuffer = new StringBuffer("Hello");//object
    
            // Append text to the StringBuffer
            stringBuffer.append(", World!");
            System.out.println(stringBuffer);
    
            // Insert text at a specific position
            stringBuffer.insert(6, "Java ");
    
            // Replace a portion of the string
            stringBuffer.replace(0, 5, "Greetings");
    
            // Delete characters from the StringBuffer
            stringBuffer.delete(10, 18);
    
            // Print the final content of the StringBuffer
            System.out.println("Final String: " + stringBuffer.toString());
        }
    }
    
      
    
    

//   public static void main(String[] args) {
        
//             StringBuffer sharedBuffer = new StringBuffer();//object
    
//             // Create multiple threads that modify the shared StringBuffer
//             System.out.println("thread1");
//             Thread thread1 = new Thread(new StringAppendTask(sharedBuffer, "Hello, "));
//              System.out.println("thread2");
//             Thread thread2 = new Thread(new StringAppendTask(sharedBuffer, "World!"));
    
//             // Start the threads
//             System.out.println("start1");
//             thread1.start();
//             System.out.println("start2");
//             thread2.start();
    
//             // Wait for threads to finish
//             try {
//                       System.out.println("try");
//                 thread1.join();
//                 thread2.join();
//             }
//             catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
    
//             // Print the final content of the shared StringBuffer
//             System.out.println("Final String: " + sharedBuffer.toString());
//         }
    
//         static class StringAppendTask implements Runnable {
            
//             private final StringBuffer stringBuffer;//variable
//             private final String appendString;//variable
    
//             public StringAppendTask(StringBuffer stringBuffer, String appendString) {
//                 System.out.println("strinappentask");
//                 this.stringBuffer = stringBuffer;
//                 this.appendString = appendString;
//             }
    
//             @Override
//             public void run() {
//                     System.out.println("run");
//                 // Perform thread-safe string append operation
//                 synchronized (stringBuffer) {
//                     stringBuffer.append(appendString);
//                 }
//             }
//         }