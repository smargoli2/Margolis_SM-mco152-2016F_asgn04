package observablePattern;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Observable;
import java.util.Observer;

public abstract class VotesReporting implements Observer {

	private IPopularVoteStrategy popularStrat;
	private IElectoralVoteStrategy electoralStrat;
	private ArrayList<States> states;
	DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
	Date date = new Date();

	public VotesReporting(Observable observable, IPopularVoteStrategy popularStrat,
			IElectoralVoteStrategy electoralStrat, ArrayList<States> states) {
		observable.addObserver(this);
		this.popularStrat = popularStrat;
		this.electoralStrat = electoralStrat;
		this.states = states;
	}

	public void update(Observable observable, Object stateObject) {
		if (stateObject instanceof ArrayList) {
			states = (ArrayList<States>) stateObject;

		}
	}

	public Integer getRepublicanPopularVote() {
		return popularStrat.getRepPopVotes(states);
	}

	public Integer getDemocratPopularVote() {
		return popularStrat.getDemPopVotes(states);
	}

	public Integer getRepublicanElectoralVote() {
		return electoralStrat.getRepElecVotes(states);
	}

	public Integer getDemocratElectoralVote() {
		return electoralStrat.getDemElecVotes(states);
	}

	public String getLegaMessage() {
		return "Current time: " + df.format(date)
				+ "\nThe above statements are purely observational and not legally binding in any way.";
	}

}
