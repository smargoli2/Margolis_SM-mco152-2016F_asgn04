package observablePattern;

import java.util.ArrayList;

public class SmallestDemLeadGoesRepElec extends IPopularVoteStrategy {

	private ArrayList<States> states;
	private Integer repElecs = 0;
	private Integer demoElecs = 0;

	public SmallestDemLeadGoesRepElec(ArrayList<States> states) {
		this.states = states;
	}

	public ArrayList<Integer> calculateVotes() {
		Integer smallestDif = states.get(0).getDemVotes() - states.get(0).getRepVotes();
		States demSmallestLeadState = new States("", 0, 0, 0);
		ArrayList<Integer> votes = new ArrayList<Integer>();
		for (int i = 0; i < states.size(); i++) {
			if (states.get(i).getDemVotes() - states.get(i).getRepVotes() < smallestDif) {
				smallestDif = states.get(i).getDemVotes() - states.get(i).getRepVotes();
				demSmallestLeadState = states.get(i);
			}
			if (states.get(i).getDemVotes() > states.get(i).getRepVotes()) {
				this.demoElecs += states.get(i).getElecVotes();
			} else {
				this.repElecs += states.get(i).getElecVotes();
			}
		}
		// turn the votes in favor of the republicans
		// Split the votes, favoring repub if odd
		this.demoElecs -= demSmallestLeadState.getElecVotes();
		if (smallestDif % 2 == 0) {
			this.repElecs += demSmallestLeadState.getElecVotes() / 2;
			this.demoElecs += demSmallestLeadState.getElecVotes() / 2;
		} else {
			this.repElecs += demSmallestLeadState.getElecVotes() / 2;
			this.repElecs++;
			this.demoElecs += demSmallestLeadState.getElecVotes() / 2;
		}
		votes.add(this.repElecs);
		votes.add(this.demoElecs);
		return votes;
	}

	public void display() {

	}
	
	public Integer getRepElecs(){
		return this.repElecs;
	}
	
	public Integer getDemElecs(){
		return this.demoElecs;
	}

}
