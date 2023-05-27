package in.election.domain;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@SuppressWarnings("serial")
@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class Voter implements Serializable {
	private String name;
	private int age;	
	private String gender;
	private long aadhar;
	private long phoneNumber;
	private String parentName;
	private String address;
	private int voterId;
	private boolean hasVoted;
	
	@Override
	public String toString() {
		
		return String.format("%-20s%-10d%-10s%-20d%-20d%-20s%-30s%-20d", this.name, this.age, this.gender, this.aadhar, this.phoneNumber, this.parentName, this.address, this.voterId);
	}

}
