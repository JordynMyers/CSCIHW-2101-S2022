package HW2;
import java.util.Scanner;

public class MathGames {
    // 1. Create a method that will calculate the Pythagorean Theorem (https://en.wikipedia.org/wiki/Pythagorean_theorem)
    // c = sqrt(a^2+b^2)
    // NOTE: You can assume you will only need to calculate the Hypotenuse
    // Hint 1: Method should take in 2 sides(a and b) of the triangle and return the missing side.
    //      Remember the Triangle has a base, Perpendicular, and Hypotenuse
    // Hint 2: Math.pow and Math.sqrt are your friend here
    // Bonus points: Try to make it accept any 2 sides and return the 3rd. So it can take in
    // Hypotenuse and Perpendicular and return the base.

  // c is the hypotenuse, a and b are the other sides
    public void pythag(double adjacent, double opposite){
      double hypo = Math.sqrt((adjacent*adjacent)+(opposite*opposite));
      System.out.println(hypo);
     
    }
  
    // 2. Create a method that will calculate my grade in the class. You can use the grade range as follows
        // A: 100 - 90
        // B:  89 - 80
        // C:  79 - 70
        // D:  69 - 60
        // F:  60 -  0 
        // method should accept the grade as a double and return the letter grade of what I got
        // NOTE: Im a really nice guy and always round up on my grading so a 69.3 will round up to a 70.0
        // Hint 1: if statements are your friend here you will probably need at the least 5 if / ifelse / else statments
        // Hint 2: You will probably need to cast the double to an int
        // Hint 3: You will probably need to use the Math.ceil() method 

      public void grade(){
        // scope type NAME(PARAMETERS){}
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter percentage marks");
        double percentage = scan.nextDouble();
        // You need to run a Math.ceil() on the percentage
        if(percentage >= 89){
          System.out.println("Excellent: Grade A");
        }else if(percentage < 89 && percentage >= 79){
          System.out.println("Very Good: Grade B");
        }else if(percentage < 79 && percentage >= 69){
          System.out.println("Good: Grade C");
        }else if(percentage < 69 && percentage >= 59){
          System.out.println("Satisfactory: Grade D");
        }else if(percentage < 59 && percentage >= 0){
          System.out.println("Failed: Grade F");
        }
      }
        



    // 3. Create a method that will calculate the tip on a bill per person
    //      Method parameters: total bill, amount of people splitting the bill, percentage to tip.
    //      Note: I would like the total always rounded up to a whole number
    //      Hint 1: percentage can be made easier to work with if you divide by 100 so 18% is 18/100 = 0.18
    //      Hint 2: Using doubles will be helpful for when you need to calculate decimals
    //      Hint 3: It is possible you might need to Cast a double to an int or vice versa
    //      Hint 4: You will probably need to use the Math.ceil() method 
    //      total / people * percent

    // scope type NAME(PARAMETERS){}
   
public void tipcalc() {

        Scanner sc = new Scanner(System.in); 
        double bill;
        double tipPercentage; 
        double tip; 
        double billTip;
        int people;
        
       System.out.println("What is the amount of the bill?"); 
       bill = sc.nextDouble();
       
       System.out.println("What percentage would you like to tip?");
       tipPercentage = sc.nextDouble(); 
       
       tip = bill * (tipPercentage/100);
       billTip = bill * (tipPercentage/100) + bill;
       System.out.println("Ceiling value of " + billTip + " = " + Math.ceil(billTip));
       System.out.println("Your tip amount is $" + tip); 
       System.out.println("Your bill + tip is $" + billTip);
       
       System.out.println("How many people would you like to split the bill with?");
       people = sc.nextInt();
       
       System.out.println("Each person needs to pay $" + billTip/people); 
       
       System.out.println("Thank you, come again!");
  }
  // you do not need this main if you want to make a tester class
    public static void main(String[] args){
      // how do we call the pythag method knowing we have a MathGames Object

      // CLASSNAME NAME = new CLASSNAME()
      MathGames games = new MathGames();
      games.pythag(5,6);
      games.grade();
      games.tipcalc();     
        
    

      }

}
    
        



