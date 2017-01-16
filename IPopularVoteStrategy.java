package observablePattern;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public abstract class IPopularVoteStrategy {

	public String displayLegalMessage() {
		//DateFormat format = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();

		return "Time now: " + date + "\nAll reports are purely observational and not legally binding in any way.";
	}

	public Integer getRepPopVotes(ArrayList<States> states){
		Integer votes = 0;
		for (int i = 0; i < states.size(); i++){
			votes += states.get(i).getRepVotes();
		}
		return votes;
	}
	
	public Integer getDemPopVotes(ArrayList<States> states){
		Integer votes = 0;
		for (int i = 0; i < states.size(); i++){
			votes += states.get(i).getDemVotes();
		}
		return votes;
	}

}
