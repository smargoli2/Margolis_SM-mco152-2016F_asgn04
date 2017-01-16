package observablePattern;

import java.util.ArrayList;
import java.util.Observable;

public class Observers extends VotesReporting {

	IPopularVoteStrategy popStrat;
	IElectoralVoteStrategy elecStrat;
	private ArrayList<States> states;

	// call Base class constructor
	public Observers(Observable observable, IPopularVoteStrategy pop, IElectoralVoteStrategy elec,
			ArrayList<States> states) {
		super(observable, pop, elec, states);
		this.popStrat = pop;
		this.elecStrat = elec;
		this.states = states;
	}

	public String display() {
		return "The Republicans have " + this.popStrat.getRepPopVotes(states) + 
				" popular votes and the Democrats have "+ this.popStrat.getDemPopVotes(states) 
				+ " popular votes.\nWe predict that the Republicans will get " + this.elecStrat.getRepElecVotes(states)
				+ " electoral votes and the Democrats will get " + this.elecStrat.getDemElecVotes(states) + ".\n" + this.getLegaMessage();
	}

}
