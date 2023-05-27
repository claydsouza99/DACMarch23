package in.election.test;
import in.election.domain.Voter;
import in.election.file.VotersList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VoterTest {
static Scanner sc = new Scanner(System.in);

public static List<Voter> getArray() {

    List<Voter> arr = new ArrayList<>();

    arr.add(new Voter("Rajesh Sharma", 32, "M", 123456789012L, 9876543210L, "Ram Sharma", "123 Main St, Mumbai", 61, false));
    arr.add(new Voter("Sarika Gupta", 25, "F", 234567890123L, 9876543211L, "Alok Gupta", "456 Park Rd, Delhi", 90, false));
    arr.add(new Voter("Anil Patel", 45, "M", 345678901234L, 9876543212L, "Ramesh Patel", "789 Orchard Ave, Bangalore", 23, false));
    arr.add(new Voter("Priya Singh", 28, "F", 456789012345L, 9876543213L, "Rajesh Singh", "567 Elm St, Pune", 54, false));
    arr.add(new Voter("Amit Kumar", 38, "M", 567890123456L, 9876543214L, "Suresh Kumar", "890 Maple Rd, Kolkata", 21, false));
    arr.add(new Voter("Preeti Sharma", 31, "T", 678901234567L, 9876543215L, "Rahul Sharma", "234 Cedar St, Chennai", 45, false));
    arr.add(new Voter("Rajendra Prasad", 52, "M", 789012345678L, 9876543216L, "Girish Prasad", "567 Pine Ave, Hyderabad", 46, false));
    arr.add(new Voter("Geeta Patel", 29, "F", 890123456789L, 9876543217L, "Hitesh Patel", "123 Oak St, Jaipur", 32, false));
    arr.add(new Voter("Manoj Singh", 40, "M", 901234567890L, 9876543218L, "Amit Singh", "456 Walnut Rd, Ahmedabad", 19, false));
    arr.add(new Voter("Sunita Gupta", 35, "F", 123456789012L, 9876543219L, "Vijay Gupta", "789 Cherry Ave, Lucknow", 29, false));

    return arr;
}
	
	// Case 1 : Register new voter
	public static void acceptRecord(List<Voter> arrList) {

	    if(arrList != null) {
	        Voter newVoter = new Voter();
	        
	        System.out.println("Enter voter name: ");
	        newVoter.setName(sc.nextLine());

	        System.out.println("Enter age: ");
	        try {
	            int age = sc.nextInt();
	            if(age >= 18) {
	                newVoter.setAge(age);
	            } else {
	                System.out.println("Ineligible to vote");
	    	        sc.nextLine();
	                return;
	            }
    	       sc.nextLine();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }

	        System.out.println("Enter gender in char: ");
	        String gender = sc.nextLine().toUpperCase();
	        if (gender.equals("M") || gender.equals("F") || gender.equals("T")) {
	            newVoter.setGender(gender);
	        } else {
	            System.out.println("Invalid input. Please enter M / F / T");
	        }


	        System.out.println("Enter Aadhar number: ");
	        boolean valid = false;
	        while (!valid) {
	            try {
	                long aadhar = sc.nextLong();
	                if (String.valueOf(aadhar).length() == 12) {
	                    newVoter.setAadhar(aadhar);
	                    valid = true;
	                } else {
	                    System.out.println("Aadhar number should be exactly 12 digits.");
	                }
	            } catch (Exception e) {
		            e.printStackTrace();
	                sc.nextLine();
	            }
	        }

	        System.out.println("Enter Phone number: ");
	        valid = false;
	        while (!valid) {
	            try {
	                long phone = sc.nextLong();
	                if (String.valueOf(phone).length() == 10) {
	                    newVoter.setPhoneNumber(phone);
	                    valid = true;
	                } else {
	                    System.out.println("Phone number should be exactly 10 digits.");
	                }
	            } catch (Exception e) {
		            e.printStackTrace();
	                sc.nextLine();
	            }
	        } sc.nextLine();

	        System.out.println("Enter parent's name: ");
	        newVoter.setParentName(sc.nextLine());

	        System.out.println("Enter address: ");
	        newVoter.setAddress(sc.nextLine());

	        System.out.println("Enter a unique Voter ID:");
	        boolean idExists = false;
	        while (!idExists) {
	            try {
	                int voterId = sc.nextInt();
	                boolean found = false;
	                for (Voter voter : arrList) {
	                    if (voter.getVoterId() == voterId) {
	                        found = true;
	                        break;
	                    }
	                }
	                if (found) {
	                    System.out.print("Voter ID already exists. Enter unique Voter ID: ");
	                } else {
	                    newVoter.setVoterId(voterId);
	                    idExists = true;
	                }
	            } catch (Exception e) {
	                e.printStackTrace();
	            }
	        }
	        
	        arrList.add(newVoter);
	        System.out.println("New Voter Registered!");
	        VotersList.writeRecord("VotersList.txt", arrList);
	    }}



	
	// Case 2 : Find voter's details
	public static void searchRecord(List<Voter> arrList) {
	    if(!arrList.isEmpty()) {
	        System.out.println("Enter Voter ID to search: ");
	        int voterId=0;
			try {
				voterId = sc.nextInt();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        boolean found = false;
	        for(Voter element : arrList) {
	            if(element.getVoterId() == voterId) {
	                System.out.printf("%-20s%-10s%-10s%-20s%-20s%-20s%-30s%-20s\n", "Name", "Age", "Gender", "Aadhar", "Phone number", "Parent Name", "Address", "Voter ID");
	                System.out.println(element.toString());
	                found = true;
	                break;
	            }
	        }
	        if(!found) {
	            System.out.println("Voter record not found!");
	        }
	    }         VotersList.writeRecord("VotersList.txt", arrList);
	}

	
	//Case 3: Update Details of Voter
	public static void updateRecord(List<Voter> arrList) {
	    if (arrList != null) {
	        System.out.println("Enter Voter ID to update: ");
	        int voterId=0;
			try {
				voterId = sc.nextInt();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        boolean found = false;
	        for (Voter voter : arrList) {
	            if (voter.getVoterId() == voterId) {
	                System.out.println("Choose the option to update: ");
	                System.out.println("1. Name");
	                System.out.println("2. Age");
	                System.out.println("3. Gender");
	                System.out.println("4. Aadhar");
	                System.out.println("5. Phone number");
	                System.out.println("6. Parent's name");
	                System.out.println("7. Address");
	                System.out.println("8. Voter ID");
	                int choice = sc.nextInt();
	                sc.nextLine();
	                switch (choice) {
	                    case 1:
	                        System.out.println("Enter new name: ");
	                        voter.setName(sc.nextLine());
	                        System.out.println("Name updated successfully!");
	                        break;
	                    case 2:
	                    	 System.out.println("Enter age: ");
	             	        try {
	             	            int age = sc.nextInt();
	             	            if(age >= 18) {
	             	                voter.setAge(age);
	             	            } else {
	             	                System.out.println("Ineligible to vote");
	             	    	        sc.nextLine();
	             	                return;
	             	            }
	                 	       sc.nextLine();
	             	        } catch (Exception e) {
	             	            e.printStackTrace();
	             	        }
	                    case 3:
	                        System.out.println("Enter new gender: ");
	                        voter.setGender(sc.nextLine());
	                        System.out.println("Gender updated successfully!");
	                        break;
	                    case 4:
	                        System.out.println("Enter new Aadhar number: ");
						try {
							voter.setAadhar(sc.nextLong());
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
	                        System.out.println("Aadhar number updated successfully!");
	                        break;
	                    case 5:
	                        System.out.println("Enter new phone number: ");
						try {
							voter.setPhoneNumber(sc.nextLong());
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
	                        System.out.println("Phone number updated successfully!");
	                        break;
	                    case 6:
	                        System.out.println("Enter new parent's name: ");
	                        voter.setParentName(sc.nextLine());
	                        System.out.println("Parent's name updated successfully!");
	                        break;
	                    case 7:
	                        System.out.println("Enter new address: ");
	                        voter.setAddress(sc.nextLine());
	                        System.out.println("Address updated successfully!");
	                        break;
	                    case 8:
	                        System.out.println("Enter new Voter ID: ");
						try {
							voter.setVoterId(sc.nextInt());
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
	                        System.out.println("Voter ID updated successfully!");
	                        break;
	                    default:
	                        System.out.println("Invalid choice!");
	                        break;
	                } 
	                found = true;
	                VotersList.writeRecord("VotersList.txt", arrList);
	                break;
	            }
	        }
	        if (!found) {
	            System.out.println("Voter record not found!");
	        } }
	}


	// Case 4: Remove voter's details
	public static List<Voter> removeRecord(List<Voter> arrList) {
	    System.out.println("Enter Voter ID to remove: ");
	    int id=0;
		try {
			id = sc.nextInt();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    boolean found = false;
	    for(int index = 0; index < arrList.size(); index++) {
	        if(arrList.get(index) != null && arrList.get(index).getVoterId() == id) {
	            arrList.remove(index);
	            found = true;
	            System.out.println("Voter record removed successfully");
	            break;
	        }
	   }
	    if(!found) {
	        System.out.println("Voter record not found");
	    }
        VotersList.writeRecord("VotersList.txt", arrList);
	    return arrList; 
	    
	}



	// Case 5: Print all voter's details
	public static void printRecord(List<Voter> arrList) {
	    if(arrList != null && !arrList.isEmpty()) {
	        System.out.printf("%-20s%-10s%-10s%-20s%-20s%-20s%-30s%-20s\n", "Name", "Age", "Gender", "Aadhar", "Phone number", "Parent Name", "Address", "Voter ID");
	        for(Voter element : arrList) {
	            if(element != null) {
	                System.out.println(element.toString());
	            }
	        }
	    }
	}		
}
