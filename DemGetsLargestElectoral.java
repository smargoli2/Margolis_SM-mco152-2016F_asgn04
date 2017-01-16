package observablePattern;

import java.util.ArrayList;

public class DemGetsLargestElectoral extends IElectoralVoteStrategy {

	private ArrayList<States> states;
	private Integer repElecs = 0;
	private Integer demElecs = 0;

	public DemGetsLargestElectoral(ArrayList<States> states) {
		this.states = states;
	}

	public ArrayList<Integer> calculateVotes() {
		ArrayList<Integer> votes = new ArrayList<Integer>();
		//skip (0) - NY is largest
		for (int i = 1; i < states.size(); i++) {
			if (states.get(i).getDemVotes() > states.get(i).getRepVotes()) {
				this.demElecs += states.get(i).getElecVotes();
			} else {
				this.repElecs += states.get(i).getElecVotes();
			}
		}
		//NY electoral votes go to democrat by default
		this.demElecs += states.get(0).getElecVotes();
		votes.add(this.repElecs);
		votes.add(this.demElecs);
		return votes;
	}
	
	public Integer getRepElecs(){
		return this.repElecs;
	}
	
	public Integer getDemElecs(){
		return this.demElecs;
	}

}
