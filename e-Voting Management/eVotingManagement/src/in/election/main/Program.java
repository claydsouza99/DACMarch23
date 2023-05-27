package in.election.main;
import in.election.domain.Voter;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import in.election.test.ElectionCommission;
import in.election.test.Ballot;
import in.election.test.Results;
import in.election.file.VotersList;
import in.election.test.VoterTest;


public class Program {
  static List<Voter> arrList = new ArrayList<>();
	
	public static void main(String[] args) {

		System.out.println("=====================================================");
		System.out.println("~~~~~~~~~~~~~~~~~~ e-Voting Portal ~~~~~~~~~~~~~~~~~~");
		System.out.println("=====================================================");
		
		String pathName = "VotersList.txt";
        File file = new File(pathName);

        if (file.exists()) {
            arrList = VotersList.readRecord(pathName);
        } else {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
            
            arrList = VoterTest.getArray();
        }        
		int choice;
		while((choice = Menu.menuList()) != 0) {
	
			switch(choice) {
			
			case 1: ElectionCommission.password(arrList);
				break;
			
			case 2: Ballot.votingBallot(arrList);
				break;
				
			case 3: Results.result(arrList);
				break;
	
			}   VotersList.writeRecord(pathName, arrList);  
		}  	
	}
}
