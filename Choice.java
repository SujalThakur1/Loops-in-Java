
import java.util.Scanner;
/**
 * Write a description of class Choice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Choice 
{
    // Creating a method
    public static void Grade(int takeInput){
        if(takeInput <= 100 && takeInput > 69){
            System.out.println("A grade");
        }
        else if(takeInput < 69 && takeInput > 59){
            System.out.println("B Grade");
        }
        else if(takeInput <59 && takeInput>49){
            System.out.println("C Grade");
        }
        else if(takeInput < 49 && takeInput > 39){
            System.out.println("D Grade");
        }
        else if(takeInput < 40 && takeInput >= 0){
            System.out.println("E Grade");
        }
        else if(takeInput > 100 || takeInput < 0){
            System.out.println("Incorrect Input." + "" + "Please try again with valid input ");
        }
    }
    //Creating 2nd method
    public static void Maths(){
        System.out.println("Enter Lower Bound Here:");
                Scanner lowerBound = new Scanner(System.in);
                double lowerBoundValue = lowerBound.nextInt();

                System.out.println("Enter Upper Bound Here:");
                Scanner upperBound = new Scanner(System.in);
                double upperBoundValue = upperBound.nextInt();
                if (lowerBoundValue > upperBoundValue){
                System.out.println("error");
            
            }
            System.out.format("%-8s %-8s %-8s %-8s","Value", "Square", "Cube", "Square Root");
            System.out.println("");
              


        for (double i = lowerBoundValue; i < upperBoundValue + 1  ; i++) {
           System.out.println("--------------------------------------------------");

            
            System.out.format("%-8s %-8s %-8s %-8s", i   , i*i ,  i*i*i ,  Math.sqrt(i));
            
            System.out.println("");
            
            
            
        }
        
        

        }
        
    
    //creating third method
    public static void Sum(){
        int number = -1;
        Scanner input = new Scanner(System.in);
        System.out.println("Type a number (or -1 to stop): ");
        double num = input.nextInt();
        double max = num;
        double min = num;
        double sum = 0;
        double average = 0;
        double count = 0;
        while(num != -1 )
        {
            if(num != -1){
                sum = sum + num;
                count = count + 1;
                
            }
            
            if(num>max){
                max = num;
            }
            if(num<min){
                min = num;
            }
            System.out.println("Type a number (or -1 to stop): ");
            
            num = input.nextInt();
            
            average = sum/count;
            
            
        }
        if(min != number){
            System.out.println("Sum of your numbers are: " + sum);
            System.out.println("average of your numbers are: " + average);
            System.out.println("Your maximum value is:  " + max);
            System.out.println("Your minimum value is:  " + min);
        }

    }
    //creating 4th method
    public static void choice4(){
        
        boolean boo = false;
        do{
        int Input;
        System.out.println("Enter your percentage");
        Scanner S = new Scanner(System.in);  
        Input = S.nextInt();
        

        if (Input > 100){
            System.out.println("Your input should be smaller than or equal to 100");
        }
        else if (Input < 0){
            System.out.println("Your input should be smaller than or equal to 0");
        }
        else if (Input <= 100 || Input >= 0){
            Grade(Input);
            boo = true;
        }
                
        }
        while(!boo);
    }
    
    // creating exit method so system can exit
    public static void exit(){
        
         System.out.println("'Goodbye'");
         System.out.println("Have a nice day :-)");



    }
    
    
}