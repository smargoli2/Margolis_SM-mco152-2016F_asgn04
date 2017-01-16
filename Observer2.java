package observablePattern;

import java.util.ArrayList;
import java.util.Observable;

public class Observer2 extends Observers {
	private ArrayList<States> states;
	IPopularVoteStrategy popular;
	IElectoralVoteStrategy elect;

	public Observer2(Observable observable, RegularPopularStrategy pop, DemGetsLargestElectoral elec,
			ArrayList<States> states) {
		super(observable, pop, elec, states);
		this.popular = new RegularPopularStrategy(states);
		this.elect = new DemGetsLargestElectoral(states);
	}

	public Integer getRepublicanPopularVote() {
		return popular.getRepPopVotes(states);
	}

	public Integer getDemocratPopularVote() {
		return popular.getDemPopVotes(states);
	}

	public Integer getRepublicanElectoralVote() {
		return elect.getRepElecVotes(states);
	}

	public Integer getDemocratElectoralVote() {
		return elect.getDemElecVotes(states);
	}
}
