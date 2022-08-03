/*
 * This program performs some calculation with water volumes in ocean and human
 */


public class Exercise1Water {
	
	public static void main(String[] args) {
		//water constants 
		 final int WATER_VOLUME_EARTH = 332519000 ;
		 final float OCEAN_WATER_PROPORTION = 0.9935F; //99.35% 
		 final float M3_TO_GALLON = 264.172F; //conversion m3 to gallon
		
		//human constants
		 final float HUMAN_BODY_VOLUME = 0.062F; //cubic meters
		 final long HUMAN_NUMBER = 7400000000L; //must be a long as it is greater thank (2^31)-1
		 final float HUMAN_WATER_PRPORTION = 0.75F; // 75%
		 
		//calculating the volume of ocean
		double ocean_volume_m3 = WATER_VOLUME_EARTH * OCEAN_WATER_PROPORTION; 
		double ocean_volume_gallon = ocean_volume_m3 * M3_TO_GALLON;
		
		//printing volume
		System.out.println("Ocean volume: " + ocean_volume_m3 + " m3 => " + ocean_volume_gallon + " gallons");
		
		//calculating and printing the total water in human
		double total_human_water = HUMAN_BODY_VOLUME * HUMAN_WATER_PRPORTION * HUMAN_NUMBER;
		System.out.println("Total human water: "+ total_human_water);
		
		//calculating the ratio human over ocean
		double human_ocean_water_ratio = total_human_water / ocean_volume_m3 ;
		System.out.println("Ration Human/Ocean= "+ human_ocean_water_ratio);
		System.out.println("----------------------------------------------");
		
		if(human_ocean_water_ratio >= 1) {
			System.out.println("Surprising, human have more water that ocean!");
		}else {
			System.out.println("Normal, ocean is much larger!");
		}
	}

}
