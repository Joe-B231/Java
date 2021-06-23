import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class zodiacIf {
   public static void main(String[] args) {
      ArrayList<String> zodiac = new ArrayList<String>();
      String[] otherList = new String[] {"Monkey", "Rooster", "Dog", "Pig", "Rat", "Ox", "Tiger", "Rabbit", "Dragon", "Snake", "Horse", "Goat", };
      Scanner keyboard = new Scanner(System.in);
      int answer = 0;
      
      for (int i = 0; i < otherList.length; i++) {
         zodiac.add(otherList[i]);
      }
      System.out.print("What is the year that you want to convert? ");
      answer = keyboard.nextInt();
      int value = answer % 12;
      if (answer >= 0) {
         if (value == 0) {
            System.out.println("This is the year of the " + zodiac.get(value)); 
            } else if (value == 1) {
          System.out.println("This is the year of the " + zodiac.get(value));
            } else if (value == 2) {
            System.out.println("This is the year of the " + zodiac.get(value));
            } else if (value == 3) {
            System.out.println("This is the year of the " + zodiac.get(value));
            } else if (value == 4) {
          System.out.println("This is the year of the " + zodiac.get(value));
            } else if (value == 5) {
            System.out.println("This is the year of the " + zodiac.get(value));
            } else if (value == 6) {
            System.out.println("This is the year of the " + zodiac.get(value));
            } else if (value == 7) {
          System.out.println("This is the year of the " + zodiac.get(value));
            } else if (value == 8) {
            System.out.println("This is the year of the " + zodiac.get(value));
            } else if (value == 9) {
            System.out.println("This is the year of the " + zodiac.get(value));
            } else if (value == 10) {
          System.out.println("This is the year of the " + zodiac.get(value));
            } else if (value == 11) {
             System.out.println("This is the year of the " + zodiac.get(value)); 
            } 
     } else {
      System.out.println("This year didn't exist.");
      }
   }
}