/*
 *  Name : Amirreza Mirzaei
 *  Description: Fish Price Calculator
 */
package FishPriceCalculator;

public class Fishnet{
	private int largeFishCount;
	private int mediumFishCount;
	
	Fishnet(){}
	
	Fishnet(int largeFishCount, int mediumFishCount ){
		this.largeFishCount = largeFishCount;
		this.mediumFishCount = mediumFishCount;
	}
	
	public double getLargeFishCount() {
		return largeFishCount;
	}
	public void setLargeFishCount(int largeFishCount) {
		this.largeFishCount = largeFishCount;
	}
	public double getMediumFishCount() {
		return mediumFishCount;
	}
	public void setMediumFishCount(int mediumFishCount) {
		this.mediumFishCount = mediumFishCount;
	}
	
	public double calculateValue() {
		double largeFishValue = largeFishCount * 42.50;
		double mediumFishValue = mediumFishCount * 15.50;
		return largeFishValue + mediumFishValue;
	}
}
