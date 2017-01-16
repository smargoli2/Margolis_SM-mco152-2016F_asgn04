package observablePattern;

import java.util.Observable;
import java.util.ArrayList;
import java.util.HashSet;

public class ElectionsData extends Observable {

	private ArrayList<States> states;

	public ElectionsData(ArrayList<States> states) {
		this.states = states;
	}

	// push new data
	public void votesChanged(ArrayList<States> states) {
		setChanged();
		notifyObservers(states);

	}

	public void setRepubPopVotes(ArrayList<Integer> votes) {
		// set values for states
		for (int i = 0; i < states.size(); i++) {
			states.get(i).setRepubVotes(votes.get(0));
		}
	}

	public void setDemoPopVotes(ArrayList<Integer> votes) {
		// set values for states
		for (int i = 0; i < states.size(); i++) {
			states.get(i).setDemVotes(votes.get(1));
		}
	}

}
