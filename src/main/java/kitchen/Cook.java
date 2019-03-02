package kitchen;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Cook {
	
	private static final Logger LOG = LogManager.getLogger(Cook.class);
	
	
	String inputDir = "C:\\temp\\kitchenInputOutput\\input";
	String outputDir = "C:\\temp\\kitchenInputOutput\\output";

	
	
	public static void main(String[] args) {
		Cook cook = new Cook();
		List<File> order = cook.receiveOrder();
		BatchFactory BF = new BatchFactory();
		List<Batch> batches = BF.makeBatches(order);
		OvenFactory of = new OvenFactory();
		for(Batch batch : batches) {
			Oven o1 = of.getOven();
			o1.bake(batch);
		}

		
		
		
		
	}
	
	public List<File> receiveOrder() {
		File directory = new File(inputDir);
		File[] directoryListing = directory.listFiles();
		List<File> batchFiles = new ArrayList<File>();
	    for (File inputFile : directoryListing) {
	    	batchFiles.add(inputFile);

	      }
	    return batchFiles;
	}
}

