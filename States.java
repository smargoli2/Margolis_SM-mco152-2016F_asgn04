package observablePattern;

public class States {

	private String state;
	private Integer demoVotes;
	private Integer repubVotes;
	private Integer electoralVotes;

	public States(String name, Integer demo, Integer repub, Integer elecVotes) {
		this.state = name;
		this.demoVotes = demo;
		this.repubVotes = repub;
		this.electoralVotes = elecVotes;

	}

	public String getStateName() {
		return this.state;
	}

	public Integer getDemVotes() {
		return this.demoVotes;
	}

	public Integer getRepVotes() {
		return this.repubVotes;
	}
	
	public Integer getElecVotes(){
		return this.electoralVotes;
	}

	public void setDemVotes(Integer votes) {
		this.demoVotes = votes;
		
	}

	public void setRepubVotes(Integer votes) {
		this.repubVotes = votes;
		
	}
	
}
