package observablePattern;

import java.util.ArrayList;

public class IgnoreLargestRepubStrategy extends IPopularVoteStrategy {
	private ArrayList<States> states;
	private Integer repVotes = 0;
	private Integer demoVotes = 0;

	public IgnoreLargestRepubStrategy(ArrayList<States> states) {
		this.states = states;
	}

	public ArrayList<Integer> calculateVotes(ArrayList<Integer> votes) {
		Integer greatestRepub = votes.get(0);
		// find the greatest republican voting state and remove the data about
		// that state
		for (int i = 0; i < states.size(); i++) {
			if (states.get(i).getRepVotes() > greatestRepub) {
				greatestRepub = states.get(i).getRepVotes();
			}
		}
		// count up the votes
		for (int i = 0; i < states.size(); i++) {
			this.repVotes += states.get(i).getRepVotes();
			this.demoVotes += states.get(i).getDemVotes();
		}
		// change the vote
		this.repVotes -= greatestRepub;
		return votes;

	}
	
	public Integer getRepVotes(){
		return this.repVotes;
	}

	public Integer getDemVotes(){
		return this.demoVotes;
	}

	public void display() {
		/*
		 * System.out.
		 * println("State:\tDemocratic votes:\tRepublican votes:\tElectoral votes:\n"
		 * ); for (int i = 0; i < 4; i ++){
		 * System.out.print(state.getStateVotes().get(i) + "\t"); }
		 */
	}

}
