package in.election.test;
import java.util.List;
import java.util.Scanner;
import in.election.domain.Voter;
import in.election.main.*;

public class Ballot {
	static Scanner sc = new Scanner(System.in);	
	
	   public static void votingBallot(List<Voter> arrList) {
		
	    System.out.println("Enter Voter ID to confirm you are on the Electoral Roll");
	    int voterIdEntered = 0;
		try {
			voterIdEntered = sc.nextInt();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    boolean voterIDFound = false;
	    for (int index = 0; index < arrList.size(); index++) {
	        Voter voter = arrList.get(index);
	        if (voter.getVoterId() == voterIdEntered) {
	            if (voter.isHasVoted()) {
	                System.out.println("Sorry, you have already voted!");
	                return;
	            }
	            voter.setHasVoted(true);       
	            voterIDFound = true;
	            break;
	        }
	    }
	    if (!voterIDFound) {
	        System.out.println("Voter ID not found in Electoral Roll");
	        return;
	    }
	
		int choice;
		while((choice = Menu.menuListBallot()) != 12) {
	
				switch(choice) {
				
				case 1: Candidate.AAP();
					break;
				
				case 2:  Candidate.SS();
					break;
					
				case 3: Candidate.TMC();
					break;
					
				case 4: Candidate.BSP();
					break;
				
				case 5: Candidate.DMK();
					break;
				
				case 6: Candidate.BJP();
					break;
					
				case 7: Candidate.JD();
					break;
				
				case 8: Candidate.Congress();
					break;
				
				case 9: Candidate.NCP();
					break;
								
				case 10: Candidate.SSUBT();
					break;
				
				case 11: Candidate.NOTA();	
					break;
			}
		System.out.println("Vote has been recorded");
		break;
	}
	}
}