package kitchen;

import java.io.File;
import java.io.IOException;
import java.io.Writer;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Oven {
	
	private static final Logger LOG = LogManager.getLogger(Oven.class);
	
		public void bake(Batch batch) {	
			Random random = new Random();
			String outputDir = "C:\\temp\\kitchenInputOutput\\output";
			Timer timer = new Timer();
			
			for(Pastry pastry : batch.getBatch()) {
				pastry.weight += pastry.butterWeight + pastry.flourWeight + pastry.saltWeight + (pastry.waterWeight / 4);
				int rn = random.nextInt(3000);
				LOG.debug("batch started");
				if (rn < 1000) {
					pastry.cookedStatus = CookedStatus.Raw;
				}else if(rn < 2000 && rn > 1000) {
					pastry.cookedStatus = CookedStatus.Cooked;
				}else if(rn > 2000) {
					pastry.cookedStatus = CookedStatus.Burned;
				}
			
				timer.schedule(new TimerTask() {
					@Override
					  public void run() {
					   LOG.debug("batch finished. it is " + pastry.cookedStatus + ". It took " + rn + " milleseconds" + "total weight was " + pastry.weight);
					  }
					}, rn);
				
				File file = new File("C:\\temp\\kitchenInputOutput\\output\\" + rn + ".txt");
				try {
					file.createNewFile();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
		}
		
}
