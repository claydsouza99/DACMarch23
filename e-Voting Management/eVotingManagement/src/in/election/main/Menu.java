package in.election.main;
import java.util.Scanner;


public class Menu {
static Scanner sc = new Scanner(System.in);	

	public static int menuList() {
		
		System.out.println("1. Election Commission login");
		System.out.println("2. Voting ballot ");
		System.out.println("3. Result");
		System.out.print("Enter choice: ");
			
		return sc.nextInt();
	}
	
	//Menu List for case 1 of main menu
	public static int menuListElection() {
		System.out.println("1. Register a new voter");       
		System.out.println("2. Find a voter's details");
		System.out.println("3. Update record");
		System.out.println("4. Remove a voter from the roll");
		System.out.println("5. Print Electoral roll");
		System.out.println("6. Exit");
		System.out.print("Enter choice: ");
		
		return sc.nextInt();
		
	}
	
	//Menu List for case 2 of main menu
	public static int menuListBallot() {
		System.out.println("======================================");
		System.out.println("~~~~~~~~~~~~~~~ Ballot ~~~~~~~~~~~~~~~");
		System.out.println("======================================");

		
		System.out.println("Vote for your candidate -");
		System.out.println("1. Arvind Kejriwal (AAP)");
		System.out.println("2. Eknath Shinde (Shiv Sena)");
		System.out.println("3. Mamata Banerjee (TMC)");
		System.out.println("4. Mayawati (BSP)");
		System.out.println("5. MK Stalin (DMK)");
		System.out.println("6. Narendra Modi (BJP)");
		System.out.println("7. Nitish Kumar (Janata Dal)");
		System.out.println("8. Rahul Gandhi (Congress)");
		System.out.println("9. Sharad Pawar (NCP)");
		System.out.println("10. Uddhav Thackeray (Shiv Sena-UBT)");
		System.out.println("11. NOTA");
		System.out.println("12. Exit");
		System.out.print("Enter choice: ");
		return sc.nextInt();
		
	}
	
	//Menu List for case 3 of main menu
	public static int menuListResult() {
		
		System.out.println("1. Display Result by candidate");
		System.out.println("2. Display Result by party");
		System.out.println("3. Exit");
		System.out.print("Enter choice : ");
		return sc.nextInt();
	}
	

}


	
