import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Representative_Distributor {
	
	public static void main(String args[]) {
		
		//Totals
		float totalPopulation = 332673191;
		float totalRepresentatives = 52;
		
		//State info arrays
		String[] states = {
				"CA",
				"TX",
				"FL",
				"NY",
				"PA",
				"IL",
				"OH",
				"GA",
				"NC",
				"MI",
				"NJ",
				"VA",
				"WA",
				"AZ",
				"MA",
				"TN",
				"IN",
				"MO",
				"MD",
				"WI",
				"CO",
				"MN",
				"SC",
				"AL",
				"LA",
				"KY",
				"OR",
				"OK",
				"CT",
				"UT",
				//"PR",
				"IA",
				"NV",
				"AR",
				"MS",
				"KS",
				"NM",
				"NE",
				"ID",
				"WV",
				"HI",
				"NH",
				"ME",
				"MT",
				"RI",
				"DE",
				"SD",
				"ND",
				"AK",
				//"DC",
				"VT",
				"WY"
		};
		
		float[] populations = {
				39538223,
				29145505,
				21538187,
				20201249,
				13002700,
				12812508,
				11799448,
				10711908,
				10439388,
				10077331,
				9288994,
				8631393,
				7705281,
				7151502,
				7029917,
				6910840,
				6785528,
				6177224,
				6154913,
				5893718,
				5773714,
				5706494,
				5118425,
				5024279,
				4657757,
				4505836,
				4237256,
				3959353,
				3605944,
				//3285874,
				3271616,
				3190369,
				3104614,
				3011524,
				2961279,
				2937880,
				2117522,
				1961504,
				1839106,
				1793716,
				1455271,
				1377529,
				1362359,
				1097379,
				1084225,
				989948,
				886667,
				779094,
				733391,
				//689545,
				643077,
				576851
		};
		
		float[] popRatios = {
				populations[0]  / totalPopulation,
				populations[1]  / totalPopulation,
				populations[2]  / totalPopulation,
				populations[3]  / totalPopulation,
				populations[4]  / totalPopulation,
				populations[5]  / totalPopulation,
				populations[6]  / totalPopulation,
				populations[7]  / totalPopulation,
				populations[8]  / totalPopulation,
				populations[9]  / totalPopulation,
				populations[10] / totalPopulation,
				populations[11] / totalPopulation,
				populations[12] / totalPopulation,
				populations[13] / totalPopulation,
				populations[14] / totalPopulation,
				populations[15] / totalPopulation,
				populations[16] / totalPopulation,
				populations[17] / totalPopulation,
				populations[18] / totalPopulation,
				populations[19] / totalPopulation,
				populations[20] / totalPopulation,
				populations[21] / totalPopulation,
				populations[22] / totalPopulation,
				populations[23] / totalPopulation,
				populations[24] / totalPopulation,
				populations[25] / totalPopulation,
				populations[26] / totalPopulation,
				populations[27] / totalPopulation,
				populations[28] / totalPopulation,
				populations[29] / totalPopulation,
				populations[30] / totalPopulation,
				populations[31] / totalPopulation,
				populations[32] / totalPopulation,
				populations[33] / totalPopulation,
				populations[34] / totalPopulation,
				populations[35] / totalPopulation,
				populations[36] / totalPopulation,
				populations[37] / totalPopulation,
				populations[38] / totalPopulation,
				populations[39] / totalPopulation,
				populations[40] / totalPopulation,
				populations[41] / totalPopulation,
				populations[42] / totalPopulation,
				populations[43] / totalPopulation,
				populations[44] / totalPopulation,
				populations[45] / totalPopulation,
				populations[46] / totalPopulation,
				populations[47] / totalPopulation,
				populations[48] / totalPopulation,
				populations[49] / totalPopulation
				//populations[50] / totalPopulation,
				//populations[51] / totalPopulation
		};
		
		//Representatives Info Arrays
		float[] reps = {
				1,
				1,
				1,
				1,
				1,
				1,
				1,
				1,
				1,
				1,
				1,
				1,
				1,
				1,
				1,
				1,
				1,
				1,
				1,
				1,
				1,
				1,
				1,
				1,
				1,
				1,
				1,
				1,
				1,
				1,
				1,
				1,
				1,
				1,
				1,
				1,
				1,
				1,
				1,
				1,
				1,
				1,
				1,
				1,
				1,
				1,
				1,
				1,
				1,
				1
				//1,
				//1	
		};
		
		float[] sens = {
				3,
				3,
				3,
				3,
				3,
				3,
				3,
				3,
				3,
				3,
				3,
				3,
				3,
				3,
				3,
				3,
				3,
				3,
				3,
				3,
				3,
				3,
				3,
				3,
				3,
				3,
				3,
				3,
				3,
				3,
				3,
				3,
				3,
				3,
				3,
				3,
				3,
				3,
				3,
				3,
				3,
				3,
				3,
				3,
				3,
				3,
				3,
				3,
				3,
				3
				//3,
				//3	
		};
		
		float[] repRatios = {
				reps[0]  / totalRepresentatives,
				reps[1]  / totalRepresentatives,
				reps[2]  / totalRepresentatives,
				reps[3]  / totalRepresentatives,
				reps[4]  / totalRepresentatives,
				reps[5]  / totalRepresentatives,
				reps[6]  / totalRepresentatives,
				reps[7]  / totalRepresentatives,
				reps[8]  / totalRepresentatives,
				reps[9]  / totalRepresentatives,
				reps[10] / totalRepresentatives,
				reps[11] / totalRepresentatives,
				reps[12] / totalRepresentatives,
				reps[13] / totalRepresentatives,
				reps[14] / totalRepresentatives,
				reps[15] / totalRepresentatives,
				reps[16] / totalRepresentatives,
				reps[17] / totalRepresentatives,
				reps[18] / totalRepresentatives,
				reps[19] / totalRepresentatives,
				reps[20] / totalRepresentatives,
				reps[21] / totalRepresentatives,
				reps[22] / totalRepresentatives,
				reps[23] / totalRepresentatives,
				reps[24] / totalRepresentatives,
				reps[25] / totalRepresentatives,
				reps[26] / totalRepresentatives,
				reps[27] / totalRepresentatives,
				reps[28] / totalRepresentatives,
				reps[29] / totalRepresentatives,
				reps[30] / totalRepresentatives,
				reps[31] / totalRepresentatives,
				reps[32] / totalRepresentatives,
				reps[33] / totalRepresentatives,
				reps[34] / totalRepresentatives,
				reps[35] / totalRepresentatives,
				reps[36] / totalRepresentatives,
				reps[37] / totalRepresentatives,
				reps[38] / totalRepresentatives,
				reps[39] / totalRepresentatives,
				reps[40] / totalRepresentatives,
				reps[41] / totalRepresentatives,
				reps[42] / totalRepresentatives,
				reps[43] / totalRepresentatives,
				reps[44] / totalRepresentatives,
				reps[45] / totalRepresentatives,
				reps[46] / totalRepresentatives,
				reps[47] / totalRepresentatives,
				reps[48] / totalRepresentatives,
				reps[49] / totalRepresentatives
				//reps[50] / totalRepresentatives,
				//reps[51] / totalRepresentatives
		};
		
		float[] repError = {
				(popRatios[0]  - repRatios[0])  / popRatios[0],
				(popRatios[1]  - repRatios[1])  / popRatios[1],
				(popRatios[2]  - repRatios[2])  / popRatios[2],
				(popRatios[3]  - repRatios[3])  / popRatios[3],
				(popRatios[4]  - repRatios[4])  / popRatios[4],
				(popRatios[5]  - repRatios[5])  / popRatios[5],
				(popRatios[6]  - repRatios[6])  / popRatios[6],
				(popRatios[7]  - repRatios[7])  / popRatios[7],
				(popRatios[8]  - repRatios[8])  / popRatios[8],
				(popRatios[9]  - repRatios[9])  / popRatios[9],
				(popRatios[10] - repRatios[10]) / popRatios[10],
				(popRatios[11] - repRatios[11]) / popRatios[11],
				(popRatios[12] - repRatios[12]) / popRatios[12],
				(popRatios[13] - repRatios[13]) / popRatios[13],
				(popRatios[14] - repRatios[14]) / popRatios[14],
				(popRatios[15] - repRatios[15]) / popRatios[15],
				(popRatios[16] - repRatios[16]) / popRatios[16],
				(popRatios[17] - repRatios[17]) / popRatios[17],
				(popRatios[18] - repRatios[18]) / popRatios[18],
				(popRatios[19] - repRatios[19]) / popRatios[19],
				(popRatios[20] - repRatios[20]) / popRatios[20],
				(popRatios[21] - repRatios[21]) / popRatios[21],
				(popRatios[22] - repRatios[22]) / popRatios[22],
				(popRatios[23] - repRatios[23]) / popRatios[23],
				(popRatios[24] - repRatios[24]) / popRatios[24],
				(popRatios[25] - repRatios[25]) / popRatios[25],
				(popRatios[26] - repRatios[26]) / popRatios[26],
				(popRatios[27] - repRatios[27]) / popRatios[27],
				(popRatios[28] - repRatios[28]) / popRatios[28],
				(popRatios[29] - repRatios[29]) / popRatios[29],
				(popRatios[30] - repRatios[30]) / popRatios[30],
				(popRatios[31] - repRatios[31]) / popRatios[31],
				(popRatios[32] - repRatios[32]) / popRatios[32],
				(popRatios[33] - repRatios[33]) / popRatios[33],
				(popRatios[34] - repRatios[34]) / popRatios[34],
				(popRatios[35] - repRatios[35]) / popRatios[35],
				(popRatios[36] - repRatios[36]) / popRatios[36],
				(popRatios[37] - repRatios[37]) / popRatios[37],
				(popRatios[38] - repRatios[38]) / popRatios[38],
				(popRatios[39] - repRatios[39]) / popRatios[39],
				(popRatios[40] - repRatios[40]) / popRatios[40],
				(popRatios[41] - repRatios[41]) / popRatios[41],
				(popRatios[42] - repRatios[42]) / popRatios[42],
				(popRatios[43] - repRatios[43]) / popRatios[43],
				(popRatios[44] - repRatios[44]) / popRatios[44],
				(popRatios[45] - repRatios[45]) / popRatios[45],
				(popRatios[46] - repRatios[46]) / popRatios[46],
				(popRatios[47] - repRatios[47]) / popRatios[47],
				(popRatios[48] - repRatios[48]) / popRatios[48],
				(popRatios[49] - repRatios[49]) / popRatios[49]
				//(popRatios[50] - repRatios[50]) / popRatios[50],
				//(popRatios[51] - repRatios[51]) / popRatios[51]
		};
		
		distributor house = new distributor();
		distributor senate = new distributor();
		DecimalFormat f = new DecimalFormat("#0.00");
		float totaldelegation = 0;
				
		reps = house.distribute(totalRepresentatives, totalPopulation, reps, repRatios, popRatios, repError, 1, 1);
		sens = senate.distribute(totalRepresentatives, totalPopulation, sens, repRatios, popRatios, repError, 3, 3);
		
		for(int i = 0; i < reps.length; i++) {
			totaldelegation += reps[i];
			totaldelegation += sens[i];
		}
		
		
		FileWriter file;
		try {
			file = new FileWriter("Output.txt");
		

		
			for(int i = 0; i < states.length; i++) {
				file.write("State:  ");
				file.write(states[i] + System.lineSeparator());
				file.write("	Population: ");
				file.write(NumberFormat.getIntegerInstance().format(populations[i]) + System.lineSeparator());
				file.write("	Representatives: ");
				file.write((int)reps[i] + System.lineSeparator());
				file.write("	Senators: ");
				file.write((int)sens[i] + System.lineSeparator());
				file.write("	Population Share: ");
				file.write((f.format(100 * popRatios[i])) + " %" + System.lineSeparator());
				file.write("	House Representation: ");
				file.write((f.format(100 * reps[i] / Math.round(Math.cbrt(totalPopulation)))) + " %" + System.lineSeparator());
				file.write("	Senate Representation: ");
				file.write((f.format(100 * sens[i] / Math.round(Math.cbrt(totalPopulation) / 3)) + " %" + System.lineSeparator()));
				file.write("	Combined Representation: ");
				file.write((f.format(100 * (sens[i] + reps[i]) / totaldelegation) + " %" + System.lineSeparator()));
			}
			file.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//System.out.println(totalRepresentatives);
	}
	
	
}