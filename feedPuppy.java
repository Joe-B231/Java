import java.util.ArrayList;
import java.util.Scanner;

public class feedPuppy {
   public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);
      ArrayList<String> toDoList = new ArrayList<String>();
      ArrayList<String> response = new ArrayList<String>();
      int taskToDo = 0;
      
      System.out.print("How many tasks do you have to do? ");
      taskToDo = keyboard.nextInt();
      if (taskToDo > 0) { 
         keyboard.nextLine();
         while (taskToDo != toDoList.size()) {
            System.out.print("Enter your next task: ");
            toDoList.add(keyboard.nextLine());
         }        
         System.out.println("Here are your tasks: ");
         int num = 1;
         for (int i = 0; i < toDoList.size(); i++) {
         //System.out.println(num + "." + toDoList.get(counter));
            System.out.println(String.format(num + "%s" + toDoList.get(i), "."));
            num++;
         } 
         
         String answer = " ";
         for (int i = 0; i < toDoList.size(); i++) {
            System.out.print("Have you completed \"" + toDoList.get(i) + "\"? (yes/no) ");
            answer = keyboard.nextLine();
            if (answer.toLowerCase().equals("no")) {
               response.add(toDoList.get(i));
            }        
         }
        
         for (int i = 0; i < response.size(); i++) {
               System.out.println("You still need to " + response.get(i));
         }  
         
      }// end of starting if
      else {
         System.out.println("That's either negative or zero");
      }
   }// end of main
}// end of class