public class missingChar {
  public static void main(String[] args) {
    String word = "Robocop";
    
    // Get "rob"
   	 String a = word.substring(0, 3);
   

    //Get "cop"
	String b = word.substring(4, 7);
      
    // Print
    System.out.println(a + " " + b);
  }
}

