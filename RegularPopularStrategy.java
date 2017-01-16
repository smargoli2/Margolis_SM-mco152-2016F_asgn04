package observablePattern;

import java.util.ArrayList;

public class RegularPopularStrategy extends IPopularVoteStrategy {

	private ArrayList<States> states;
	private Integer repVotes = 0;
	private Integer demoVotes = 0;

	public RegularPopularStrategy(ArrayList<States> states) {
		this.states = states;
	}

	public ArrayList<Integer> calculateVotes() {
		ArrayList<Integer> votes = new ArrayList<Integer>();
		for (int i = 0; i < states.size(); i++) {
			this.repVotes += states.get(i).getRepVotes();
			this.demoVotes += states.get(i).getDemVotes();
		}
		return votes;
	}

	public Integer getRepVotes() {
		return this.repVotes;
	}

	public Integer getDemVotes() {
		return this.demoVotes;
	}
}
