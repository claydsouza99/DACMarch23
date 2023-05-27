package in.election.test;
import java.util.List;
import in.election.domain.Voter;
import in.election.main.Menu;

public class Results {

	public static void result(List<Voter> arrList) {
	
	int choice;
	while((choice = Menu.menuListResult()) != 3) {

	switch(choice) {
	
	case 1:	System.out.println("=================================");
			System.out.println(String.format("%-20s %-10s", "Candidate", "Vote Count") + "\033[0m");
			System.out.println("=================================");
			System.out.printf("%-20s %d\n", "Arvind Kejriwal ", Candidate.getAAPVotes());
			System.out.printf("%-20s %d\n", "Eknath Shinde ", Candidate.getSSVotes());
			System.out.printf("%-20s %d\n", "Mamata Banerjee ", Candidate.getTMCVotes());
			System.out.printf("%-20s %d\n", "Mayawati ", Candidate.getBSPVotes());
			System.out.printf("%-20s %d\n", "MK Stalin ", Candidate.getDMKVotes());
			System.out.printf("%-20s %d\n", "Narendra Modi ", Candidate.getBJPVotes());
			System.out.printf("%-20s %d\n", "Nitish Kumar ", Candidate.getJDVotes());
			System.out.printf("%-20s %d\n", "Rahul Gandhi ", Candidate.getCongressVotes());
			System.out.printf("%-20s %d\n", "Sharad Pawar ", Candidate.getNCPVotes());
			System.out.printf("%-20s %d\n", "Uddhav Thackeray ", Candidate.getSSUBTVotes());
			System.out.printf("%-20s %d\n", "NOTA ", Candidate.getNOTAVotes());
			
		break;
	
	
	case 2: System.out.println("==========================================");
			System.out.println(String.format("%-30s %-10s", "Party", "Vote Count") + "\033[0m");
			System.out.println("==========================================");
			System.out.printf("%-30s %d\n", "Aam Aadmi Party ", Candidate.getAAPVotes());
			System.out.printf("%-30s %d\n", "Shiv Sena (Shinde) ", Candidate.getSSVotes());
			System.out.printf("%-30s %d\n", "Trinamool Congress ", Candidate.getTMCVotes());
			System.out.printf("%-30s %d\n", "Bahujan Samaj Party ", Candidate.getBSPVotes());
			System.out.printf("%-30s %d\n", "Dravida Munnetra Kazhagam  ", Candidate.getDMKVotes());
			System.out.printf("%-30s %d\n", "Bharatya Janata Party ", Candidate.getBJPVotes());
			System.out.printf("%-30s %d\n", "Janata Dal ", Candidate.getJDVotes());
			System.out.printf("%-30s %d\n", "Indian National Congress ", Candidate.getCongressVotes());
			System.out.printf("%-30s %d\n", "Nationalist Congress Party ", Candidate.getNCPVotes());
			System.out.printf("%-30s %d\n", "Shiv Sena ", Candidate.getSSUBTVotes());
			System.out.printf("%-30s %d\n", "NOTA ", Candidate.getNOTAVotes());

		break;
	}
break;
}
}}