/*
 * Remark, data used here is not official; it is for illustration purpose only!
 */
import java.util.Scanner;

public class Exercise3Chlorides {


	public static void main(String[] args) {
		 final  int 	minFlowAmazon 			= 70000, 		maxFlowAmazon		=200000 ;  
		 final  int 	minFlowCongo 			= 40000, 		maxFlowCongo 		= 80000;   
		 final  int 	minFlowYangTseKiang 	= 600, 			maxFlowYangTseKiang = 50000;  
		 final  int 	minFlowDanube 			= 6300, 		maxFlowDanube 		= 22000; 
		 final  int 	minFlowRhine 			= 780, 			maxFlowRhine 		= 9000; 
		 final  int 	minFlowRhone 			= 1760, 		maxFlowRhone 		= 12000; 
		 final  int 	minFlowLoire 			= 75, 			maxFlowLoire 		= 10000; 
		 final  int 	minFlowElbe 			= 150, 			maxFlowElbe 		= 3600; 
		 final  int 	minFlowSeine 			= 50, 			maxFlowSeine 		= 1650;
		 final  float 	polutionElbe 			= 0.8F;
		 final  float 	polutionLoire 			= 0.8F;
		 final  float 	polutionRhone 			= 1.0F;
		 final  float 	polutionRhine 			= 0.8F;
		 final  float 	polutionDanube 			= 0.7F;
		 final  float 	polutionYangTseKiang	= 0.5F;
		 final  float 	polutionCongo 			= 0.2F;
		 final  float 	polutionAmazon 			= 0.9F; 
		 final  float 	polutionSeine 			= 1.0F;

		// create a scanner to read form keyboard
		Scanner keyboard = new Scanner(System.in);

		// user enters the name of a river
		System.out.println ("Select a river: Amazon, Congo, Yang Tse Kiang, Danube, Rhine, Rhone, Loire, Elbe, Seine");
		String river = keyboard.nextLine(); // get the line entered by the user as a String
		
		int averageFlow =0;
		double pollutionCoefficient =0 ;
		
		switch(river) {
			case "Amazon":
				 averageFlow = (minFlowAmazon + maxFlowAmazon)/2;
				 pollutionCoefficient = polutionAmazon;
				 break;
			case "Congo":
				 averageFlow = (minFlowCongo + maxFlowCongo)/2;
				 pollutionCoefficient = polutionCongo;
				 break;
			case  "Yang Tse Kiang":
				 averageFlow = (minFlowYangTseKiang + maxFlowYangTseKiang)/2;
				 pollutionCoefficient = polutionYangTseKiang;
				 break;
			case  "Danube":
				 averageFlow = (minFlowDanube + maxFlowDanube)/2;
				 pollutionCoefficient = polutionDanube;
				 break;
			case  "Rhine":
				 averageFlow = (minFlowRhine + maxFlowRhine)/2;
				 pollutionCoefficient = polutionRhine;
				 break;
			case  "Rhone":
				 averageFlow = (minFlowRhone + maxFlowRhone)/2;
				 pollutionCoefficient = polutionRhone;
				 break;
			case  "Loire":
				 averageFlow = (minFlowLoire + maxFlowLoire)/2;
				 pollutionCoefficient = polutionLoire;
				 break;
			case  "Elbe":
				 averageFlow = (minFlowElbe + maxFlowElbe)/2;
				 pollutionCoefficient = polutionElbe;
				 break;
			case  "Seine":
				 averageFlow = (minFlowSeine + maxFlowSeine)/2;
				 pollutionCoefficient = polutionSeine;
				 break;
			default: //unknown 
				averageFlow = 0;
				pollutionCoefficient  = -1;
		}
		long chloridesAnnual = (long) (40 * averageFlow * pollutionCoefficient * 60 * 60 * 24 * 365 /  1000000); // 60 seconds, 60 minutes, 24 hours, 365 days
		
		System.out.print("La rivier " + " discharges " + chloridesAnnual + " tons per year");

		keyboard.close();
	}

}

