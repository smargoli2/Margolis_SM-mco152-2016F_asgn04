package observablePattern;

import java.util.ArrayList;
import java.util.Observable;

public class Observer3 extends Observers {
	private ArrayList<States> states;
	IPopularVoteStrategy popular;
	IElectoralVoteStrategy elect;

	public Observer3(Observable observable, IgnoreLargestRepubStrategy pop, RIGoesRepubElectoral elec,
			ArrayList<States> states) {
		super(observable, pop, elec, states);
		this.popular = new IgnoreLargestRepubStrategy(states);
		this.elect = new RIGoesRepubElectoral(states);
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
