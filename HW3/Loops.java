package HW3;
import java.util.Scanner;

public class Loops {

    //NOTE: DO NOT change anything in the boiler plate
    //1. If I added default code it is meant to be there
    //and should not be adjusted unless otherwise noted
    //(return statments are usually changed)

    //Make a method that will return true if a given 
    //String contains between 1 and 3 'e' chars.
    //Ex.
    //loopE("eat") -> true
    //eeat -> true
    //eeeat -> true
    //eeeeat -> false 
    public static boolean loopE(String str){
    char[] letters = str.toCharArray();
    int count = 0;
		for (int i = 0; i < letters.length; i++) {
		if (letters[i] == 'e') {
				count++;
  //   System.out.println(Loops.loopE("eat"));
		// System.out.println(Loops.loopE("eeat"));
  //   System.out.println(Loops.loopE("eeeat"));
		// System.out.println(Loops.loopE("eeeeat"));
			}
		}
		if (count == 1 || count== 2 || count == 3) {
		return true;
		}
		return false; 
      
	}


    //2. Given a String str and int n return a larger string
    //that is n copies of the original string 
    //Ex.
    //stringTimes("Code",2) ->"CodeCode"
    //stringTimes("Code",4) ->"CodeCodeCodeCode"
    // public static String stringTimes(String str, int n) 
    //     return null; // <- this should be changed 
     
    public static String stringTimes(String str, int n) {
        String s = "";
        for ( int i = 0; i < n; i++ )
        {
            s = s + str;
        }
        return s; 
    } 

    //3. Create a method Given a string, return the string where all of the "z"
    //Have been removed. Except do not remove a z at the start
    //or end
    //Ex.
    //stringT("zHelloz") -> "zHelloz"
    //stringT("nozthaznks") -> "nothanks"
    //stringT("xksiazdjaasldzsajzasdz") -> "xksiadjaasldsajasdz"

  public static String stringZ(String str){
      for (int i = 0 ;i < str.length(); i++){
        if (str.substring(0,1).equals("z") &&  str.substring(str.length()-1).equals("z")){
          return str = "z"+ str.replace("z", "")+"z";
        }
        else if (str.substring(0,1).equals("z")){   
          return str ="z"+ str.replace("z", "");
        }
        else if(str.substring(str.length()-1).equals("z")){   
          return str =str.replace("z", "") +"z";
        }
        else{
        return str= str.replace("z", "");
        }
      }
      return str;      
     }

  
    ////////// take the string and check if there is a z in the beginning or the end 

    // String s = "";
    // for (int i = 1; i < str.length() - 1; i++) {
    // if (str.charAt(i) != 'z') s += str.charAt(i);
    // }

  
    // += is helpful here as well
    
  
    // public static String stringZ(String str){
    
    // }

    //4. Create a method that contains a while loop that allows for
    //The user to input numbers until the number 0 is entered. Each time a number is 
    //entered the total will be summed and then prompted for a second number. 
    //NOTE: I require the use of scanner here to get each integer from the user
    //Assume the numbers entered are integers
    //Also note that the method is void meaning you will not need to return anything
    //It will need to sysout the numbers however
    //Below is a sample output what I would like
    // I will add up the numbers you give me....
    // Number: 12
    // The total so far is 12.
    // Number: 2
    // The total so far is 14.
    // Number: 3
    // The total so far is 17.
    // Number: 4
    // The total so far is 21.
    // Number: 1
    // The total so far is 22.
    // Number: 2
    // The total so far is 24.
    // Number: 3
    // The total so far is 27.
    // Number: 0
    // TOTAL ENDED --- The total is 27.
    public static void sum(){
    int num = 1;
    int sum = 0;
    Scanner keyboard = new Scanner(System.in);
    while(num > 0){ 
      System.out.println("Enter a number:");
      num = keyboard.nextInt();
      sum += num;
      if(num != 0){
        System.out.println("total = " + sum);
        }else{
        System.out.println("TOTAL ENDED ---- THE TOTAL IS " + sum);
        
        }
        
      }
      
  
    }






      


public static void main(String[] args) {
Scanner keyboard = new Scanner(System.in);
System.out.println("input a word for number one.");
System.out.println(loopE(keyboard.next()));
System.out.println("input a word for number two as well as how many times to repeat.");
System.out.println(stringTimes(keyboard.next(), keyboard.nextInt()));
System.out.println("input a word with z's in it to see when removed.");
System.out.println(stringZ(keyboard.next()));
System.out.println("Add up numbers you give, enter as many as you would like, to then get the sum");
sum();
  
  
}
      
      
      


      
}
    


