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
	}
}

























