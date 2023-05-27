package in.election.test;
import in.election.domain.Voter;
import in.election.file.VotersList;
import in.election.main.Menu;
import java.io.*;
import java.util.List;
import java.util.Scanner;

public class ElectionCommission {
static Scanner sc = new Scanner(System.in);	

	//Case 1 in main menu : Election Commission user name and password
	public static void password(List<Voter> arrList) {
		
    String username = "election";
    String password = "eci123";
    System.out.println("Enter username: ");
    String usernameEntered = sc.nextLine();
    System.out.println("Enter password: ");
    String passwordEntered = sc.nextLine();
    
    if (username.equals(usernameEntered) && password.equals(passwordEntered)) {

     		int choice;
            while ((choice = Menu.menuListElection()) != 6) {
					switch (choice) {
					    case 1:
					        VoterTest.acceptRecord(arrList);
					        break;
					    case 2:
					        VoterTest.searchRecord(arrList);
					        break;
					    case 3:
					        VoterTest.updateRecord(arrList);
					        break;
					    case 4:
					        arrList = VoterTest.removeRecord(arrList);
					        break;
					    case 5:
					        VoterTest.printRecord(arrList);
					        break;              
					}	
				}
            }
    	
    else {
            System.out.println("Invalid password. Access restricted to Election Commission officials only");
        }
    }

}