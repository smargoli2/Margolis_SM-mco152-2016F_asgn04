package observablePattern;

import java.util.ArrayList;

public class DisfavorDemoPopBy5Strategy extends IPopularVoteStrategy {

	private ArrayList<States> states;
	private Integer repVotes = 0;
	private Integer demoVotes = 0;

	public DisfavorDemoPopBy5Strategy(ArrayList<States> states) {
		for (int i = 0; i < states.size(); i++){
			this.repVotes += states.get(i).getRepVotes();
		}
		for (int i = 0; i < states.size(); i++){
			this.demoVotes += states.get(i).getDemVotes();
		}
		this.states = states;
	}

	public ArrayList<Integer> calculateVotes() {
		ArrayList<Integer> votes = new ArrayList<Integer>();
		for (int i = 0; i < states.size(); i++) {
			this.repVotes += states.get(i).getRepVotes();
			this.demoVotes += states.get(i).getDemVotes();
		}
		// turn the votes in favor of the republicans
		this.demoVotes = (int) (demoVotes * .95);
		votes.add(this.repVotes);
		votes.add(this.demoVotes);
		return votes;
	}
	
	public Integer getRepVotes(){
		return this.repVotes;
	}

	public Integer getDemVotes(){
		return this.demoVotes;
	}
	
	public void display() {

	}

}
