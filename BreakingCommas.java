class BreakingCommas{
	// Very sure this is going to be useful or a snippet will
	public static void main(String[] args){
		//feel like putting the below in an array already however I can see the use if an User was entering this data.
		String teams = "Alpha Team, Bravo Team, Delta Team, Gamma Team, Sigma Team";
		String[] omegaSplit = teams.split(",");//tried on purpose w/o putting an argument & was not allowed
		for (int i=0; i<omegaSplit.length; i++){
			System.out.println(omegaSplit[i]);
		}
	}
}