package kitchen;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Pastry {
	
	private static final Logger LOG = LogManager.getLogger(Cook.class);
	String type;
	double flourWeight;
	double waterWeight;
	double saltWeight;
	double butterWeight;
	double weight;
	CookedStatus cookedStatus = CookedStatus.Raw;
	
	Pastry() {
		super();
	}
	
	public Pastry(double flourWeight, double waterWeight, double saltWeight, double butterWeight) {
		this.butterWeight = butterWeight;
		this.waterWeight = waterWeight;
		this.saltWeight = saltWeight;
		this.flourWeight = flourWeight;
	}
	
	
	public double getFlourWeight() {
		return flourWeight;
	}
	public void setFlourWeight(double flourWeight) {
		this.flourWeight = flourWeight;
	}
	public double getWaterWeight() {
		return waterWeight;
	}
	public void setWaterWeight(double waterWeight) {
		this.waterWeight = waterWeight;
	}
	public double getSaltWeight() {
		return saltWeight;
	}
	public void setSaltWeight(double saltWeight) {
		this.saltWeight = saltWeight;
	}
	public double getButterWeight() {
		return butterWeight;
	}
	public void setButterWeight(double butterWeight) {
		this.butterWeight = butterWeight;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	@Override
	public String toString() {
		return "Pastry [flourWeight=" + flourWeight + ", waterWeight=" + waterWeight + ", saltWeight=" + saltWeight
				+ ", butterWeight=" + butterWeight + ", weight=" + weight + "]";
	}
	
}










