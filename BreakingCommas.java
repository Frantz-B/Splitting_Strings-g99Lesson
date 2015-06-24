class BreakingCommas{
	// Very sure this is going to be useful or a snippet will
	public static void main(String[] args){
		//feel like putting the below in an array already however I can see the use if an User was entering this data.
		String teams = "Alpha Team, Bravo Team, Delta Team, Gamma Team, Sigma Team";
		String[] omegaSplit = teams.split(", ");//knew the print would have a space before the text til I made the change
		for (int i=0; i<omegaSplit.length; i++){
			System.out.println(omegaSplit[i]);
		}
		String[] topTeams = teams.split(", ", 4);//modified this from omegaSplit to topTeam, but initially got an error.
		//arrayOutOfBounds exception when it was 4, but understand why now.  For loop must have one of the arrays w/ on 3 things
		System.out.println("\n\n\n");
		for (int i=0; i<topTeams.length; i++){
			System.out.println("The Top Team(s) with a High Succes : "+topTeams[i]);
		}
	}
}