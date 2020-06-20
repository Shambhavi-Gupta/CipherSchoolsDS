package program;
import java.util.*;
public class RockPaperScissor {

	public static final String ROCK="ROCK";
	public static final String PAPER="PAPER";
	public static final String SCISSORS="SCISSORS";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("...Welcome to Magical game...");
		System.out.println("Enter any of these:");
		System.out.println("1.ROCK");
		System.out.println("2.PAPER");
		System.out.println("3.SCISSORS");
		System.out.println();
		String playerMove=getPlayerMove();
		String computerMove=getComputerMove();
		if(playerMove.equals(computerMove))
		{
			System.out.println("Game is Tie!!");
		}
		else if(playerMove.equals(RockPaperScissor.ROCK))
		{
	        System.out.println(computerMove.equals(RockPaperScissor.PAPER) ? "Ohh!! Computer Wins..Better luck next time": "YIPEE!! You win");
		}
		else if (playerMove.equals(RockPaperScissor.PAPER))
	        System.out.println(computerMove.equals(RockPaperScissor.SCISSORS) ? "Ohh!! Computer Wins..Better luck next time": "YIPEE!! You win");   
	       
	      else
	        System.out.println(computerMove.equals(RockPaperScissor.ROCK) ? "Ohh!! Computer Wins..Better luck next time": "YIPEE!! You win");  
		
	}
     public static String getComputerMove()
     {
    	 String computermove;
    	 Random random=new Random();
    	 int input=random.nextInt(3)+1;
    	 if(input==1)
    	 {
    		 computermove=RockPaperScissor.ROCK;
    	 }
    	 else if(input==2)
    	 {
    		 computermove=RockPaperScissor.PAPER;
    	 }
    	 else
    	 {
    		 computermove=RockPaperScissor.SCISSORS;
    	 }
    	 System.out.println("Computer move is:"+computermove); 
    	 System.out.println();
    	 return computermove;
     }
     public static String getPlayerMove()
     {
    	 Scanner in=new Scanner(System.in);
    	 String input=in.next();
    	 String playermove=input.toUpperCase();
    	 System.out.println("Player move is:"+playermove);
    	 return playermove;
     }
}


