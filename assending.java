import java.util.Scanner;

public class assending {
   public static void main(String[] args) {
      String input = " ";
      boolean outcome = true;
      Scanner keyboard = new Scanner(System.in);
      
      System.out.print("Enter your test string: ");  
      input = keyboard.nextLine(); 
      
      for (int i = 0; i < input.length()-1; i++) {
         if (input.toLowerCase().charAt(i) >= input.toLowerCase().charAt(i+1)) {
         // checks the second character compared to the first.
            outcome = false;
         }
      }
      if (outcome) {
         System.out.println("This string is ascending.");
      } else {
         System.out.println("This string is not ascending.");
      }
   }
}
/*
   If you want to start over and look at the start of an 
   array/arrayList or string you can use modulus and the length of the array/arrayList and/or string.
*/