package in.election.file;
import java.util.ArrayList;
import java.io.*;
import java.util.List;
import in.election.domain.Voter;

public class VotersList {
	
    @SuppressWarnings("unchecked")
	public static List<Voter> readRecord(String pathName) {
    	
	    List<Voter> arrList = new ArrayList<>();
	    try {
	        FileInputStream fileIn = new FileInputStream(pathName);
	        ObjectInputStream in = new ObjectInputStream(fileIn);
	        List<Voter> data = (List<Voter>) in.readObject();
	        arrList.addAll(data);              
	        in.close();
	        fileIn.close();
	    } catch (IOException | ClassNotFoundException e) {
	        e.printStackTrace();
	    }
	    return arrList;

    }

    public static void writeRecord(String pathName, List<Voter> arrList) {
        try {
            FileOutputStream fileOut = new FileOutputStream(pathName);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(arrList);
            out.close();
            fileOut.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}




