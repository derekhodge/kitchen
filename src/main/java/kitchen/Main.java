package kitchen;

import java.io.File;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
	
	private static final Logger LOG = LogManager.getLogger(Main.class);
	
	
	String inputDir = "C:\\temp\\kitchen\\input";
	String outputDir = "C:\\temp\\kitchen\\output";
	
	public void receiveOrder() {
		File directory = new File(inputDir);
		File[] directoryListing = directory.listFiles();
	    for (File inputFile : directoryListing) {
	    	System.out.println(inputFile);
	      }
	}
	
	
	
	
	
	public static void main(String[] args) {
		Main main = new Main();
		main.receiveOrder();
		Croissant c1 = new Croissant();
		Croissant c2 = new Croissant();
		Croissant c3 = new Croissant();
		Croissant c4 = new Croissant();
		Croissant c5 = new Croissant();
		Croissant c6 = new Croissant();
		Croissant c7 = new Croissant();
		Croissant c8 = new Croissant();
		
		Batch batch = new Batch();
		batch.makeBatch(c1, c2, c3, c4, c5, c6, c7, c8);
		
		
		Oven oven1 = new Oven();
		oven1.bake(c1);

	}
}






















