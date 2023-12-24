import java.util.Scanner;//importing java scanner so we can take input from user
/**
 * Write a description of class Menu here.
 *
 * @author (Sujal Thakur)
 * @version (a version number or a date)
 */

public class Menu
{
        public void displayMenu(){
        System.out.println("please select one of the options below");
        System.out.println("1. Calculate Grade for your percentage");
        System.out.println("2. Calculate Square , Cube and Square root of your given limits");
        System.out.println("3. Calculate Additions , Average , Min value and Max value");
        System.out.println("4. Calculate percentage");        
        System.out.println("0. Exit");
        }
        
        // creating a default constructor
        public Menu(){
        
        }
        
        
        public void processUSerChoices(){
            int userInput;
             do{
        displayMenu();
        Scanner s = new Scanner(System.in);
        userInput = s.nextInt();
        switch(userInput){
           case 1:
          System.out.println("Enter percentage below");
        Scanner S = new Scanner(System.in);
        int takeInput = S.nextInt();
        
           Choice.Grade(takeInput);
           break;
           
           case 2:
           Choice.Maths();
           break;
           
           case 3:
           Choice.Sum();
           break;
               
           case 4:
           Choice.choice4();
           break;
               
           case 0:
           Choice.exit();
           System.exit(0);
           break;
           
           default:
               System.out.println("Not Valid Input");
                }
               
                    
                }
                while(userInput != -1);
            
          
          
        }
        /**
         * A main method to create an instance of menu class
         * and run the processUserChoice method
         */
        public static void main(String[] args){
            Menu m = new Menu();
            m.processUSerChoices();  
        }
        
        
        
      
    
}