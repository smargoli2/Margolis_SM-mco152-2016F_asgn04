package observablePattern;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class IElectoralVoteStrategy {
	public String displayLegalMessage() {
		//DateFormat format = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();

		return "Time now: " + date + "\nAll reports are purely observational and not legally binding in any way.";
	}

	public Integer getRepElecVotes(ArrayList<States> states){
		Integer votes = 0;
		for (int i = 0; i < states.size(); i++) {
			if (states.get(i).getDemVotes() < states.get(i).getRepVotes()) {
			votes += states.get(i).getElecVotes();	
			}
		}
		return votes;
	}
	
	public Integer getDemElecVotes(ArrayList<States> states){
		Integer votes = 0;
		for (int i = 0; i < states.size(); i++) {
			if (states.get(i).getDemVotes() > states.get(i).getRepVotes()) {
			votes += states.get(i).getElecVotes();	
			}
		}
		return votes;
	}
	
}
