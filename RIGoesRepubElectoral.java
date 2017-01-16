package observablePattern;

import java.util.ArrayList;

public class RIGoesRepubElectoral extends IElectoralVoteStrategy{
	
	private ArrayList<States> states;
	private Integer repElecs = 0;
	private Integer demElecs = 0;
	
	public RIGoesRepubElectoral(ArrayList<States> states){
		this.states = states;
	}
	
	public ArrayList<Integer> calculateVotes(){
		ArrayList<Integer> votes = new ArrayList<Integer>();
		for (int i = 0; i < states.size() - 1; i++){//don't count RI
			if (states.get(i).getDemVotes() > states.get(i).getRepVotes()){
				this.demElecs += states.get(i).getElecVotes();
			}
			else{
				this.repElecs += states.get(i).getElecVotes();
			}
		}
		//add RI electoral votes to republican total
		this.repElecs += states.get(4).getElecVotes();
		votes.add(this.repElecs);
		votes.add(this.demElecs);
		return votes;
	}
	
	public Integer getRepElecs(){
		return this.repElecs;
	}
	
	public Integer getDemElecs(){
		return this.demElecs;
	}

}
