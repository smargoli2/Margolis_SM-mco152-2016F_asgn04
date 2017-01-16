package observablePattern;

import java.util.ArrayList;

public class UseElectionsReporting {

	public static void main(String[] args) {
		ArrayList<States> states = new ArrayList<States>();
		ArrayList<Integer> votes = new ArrayList<Integer>();
		States NY = new States("New York", 100, 200, 29);
		States NJ = new States("New Jersey", 130, 200, 14);
		States PA = new States("Philadelphia", 100, 300, 20);
		States CT = new States("Connecticut", 180, 50, 7);
		States RI = new States("Rhode Island", 99, 250, 4);
		states.add(NY);
		states.add(NJ);
		states.add(PA);
		states.add(CT);
		states.add(RI);
		ElectionsData electionsData = new ElectionsData(states);
		//1
		DisfavorDemoPopBy5Strategy popularStrategy = new DisfavorDemoPopBy5Strategy(states);
		RegularElectoralStrategy electoralStrategy = new RegularElectoralStrategy(states);

		Observers observer1 = new Observer1(electionsData, popularStrategy, electoralStrategy, states);
		System.out.println(observer1.display().toString());
		//2
		RegularPopularStrategy pop2 = new RegularPopularStrategy(states);
		DemGetsLargestElectoral elec2 = new DemGetsLargestElectoral(states);

		Observers observer2 = new Observer2(electionsData, pop2, elec2, states);
		System.out.println(observer2.display().toString());
		//3
		IgnoreLargestRepubStrategy pop3 = new IgnoreLargestRepubStrategy(states);
		RIGoesRepubElectoral elec3 = new RIGoesRepubElectoral(states);

		Observers observer3 = new Observer3(electionsData, pop3, elec3, states);
		System.out.println(observer3.display().toString());
		//4
		IgnoreLargestRepubStrategy pop4 = new IgnoreLargestRepubStrategy(states);
		RegularElectoralStrategy elec4 = new RegularElectoralStrategy(states);

		Observers observer4 = new Observer4(electionsData, pop4, elec4, states);
		System.out.println(observer4.display().toString());
		//5
		RegularPopularStrategy pop5 = new RegularPopularStrategy(states);
		RegularElectoralStrategy elec5 = new RegularElectoralStrategy(states);

		Observers observer5 = new Observer5(electionsData, pop5, elec5, states);
		System.out.println(observer5.display().toString());
		
		
	}

}
