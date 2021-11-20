import java.util.Scanner;

public class Runn {

	public static void main(String[] args) {
	
		 int count = 1; 
		 int computerNum = (int) (Math.random()*10 + 1);
		 int userAnswer = 0;	
		 
	    	do {
	         try{		     		 
		    	 Scanner inputNum = new Scanner(System.in);  	     
		    	 System.out.println("Enter a guess between 1 and 10 " + " Guessing Game");  
			 
		    	 userAnswer = inputNum.nextInt();		    	 
		    	 System.out.println(decision(userAnswer, count, computerNum));
		    	 
		    	 if (userAnswer != computerNum) {
		    		 System.out.println("The correct guess " + computerNum);
		    	 }    
	    	 
		    	 count++;
		    	 
	          } catch(Exception e) {
	        	  System.out.println("Something went wrong. Try again " + e);
	          }
	         } 
	    	  while (userAnswer != computerNum);   
	}
	
	public static String decision(int num, int count, int computerNum) {
		 if (num <=0 || num >10) {
	            return "Your guess is invalid";	            
	        }
	        else if (num == computerNum ){
	            return "Correct!\nTotal Guesses: " + count;
	        }
	        else if (num > computerNum) {
	            return "Your guess is too high, try again.\nGuess Count: " + count;
	        }
	        else if (num < computerNum) {
	            return "Your guess is too low, try again.\nGuess Count: " + count;
	        }
	        else {
	            return "Your guess is incorrect\nGuess Count: " + count;
	        }
	}

}
