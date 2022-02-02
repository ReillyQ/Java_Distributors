
public class distributor {
	public float[] distribute(float total, float population, float[] base, float[] representation, float[] share, float[] err, float step, float divisor) {
		float[] delegations = base;
		while(total < Math.round(Math.cbrt(population) / divisor)) {
			//popRatios = calcShare(populations, totalPopulation);
			total = calcTotalReps(delegations);
			representation = calcRepresentation(delegations, total);
			err = calcErr(representation, share);
			delegations = iterate(delegations, step, err);
			
			//System.out.println(totalRepresentatives);
		}	
		return delegations;
	}
	
	private static float[] calcShare(float[] populations, float totalPopulation) {
		float[] popRatios = new float[populations.length];
		for(int i = 0; i < popRatios.length; i++) {
			popRatios[i] = populations[i] / totalPopulation;
		}
		return popRatios;
	}
	
	private static float calcTotalReps(float[] reps) {
		float totalRepresentatives = 0;
		for(int i = 0; i < reps.length; i++) {
			totalRepresentatives += reps[i];
		}
		return totalRepresentatives;
	}
	
	private static float[] calcRepresentation(float[] reps, float totalRepresentatives) {
		float[] repRatios = new float[reps.length];
		for(int i = 0; i < repRatios.length; i++) {
			repRatios[i] = reps[i] / totalRepresentatives;
		}
		return repRatios;
	}
	
	private static float[] calcErr(float[] repRatios, float[] popRatios) {
		float[] repError = new float[repRatios.length];
		for(int i = 0; i < repError.length; i++) {
			repError[i] = ((popRatios[i] - repRatios[i]) / popRatios[i]);
		}
		return repError;
	}
	
	private static int findGreatestErr(float[] repError) {
		int largest = 0;
		  for ( int i = 1; i < repError.length; i++ )
		  {
		      if ( repError[i] > repError[largest] ) largest = i;
		  }
		  return largest;
	}
	
	private static float[] iterate(float[] reps, float step, float[] repError) {
		float[] newReps = reps;
		newReps[findGreatestErr(repError)] = reps[findGreatestErr(repError)] + step;
		return newReps;
	}
}
