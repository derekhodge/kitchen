package kitchen;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BatchFactory {

	private static final Logger LOG = LogManager.getLogger(Cook.class);

	public List<Batch> makeBatches(List<File> order) {
		List<Batch> batches = new ArrayList<Batch>();
		String type = null;
		String flour = null;
		String water = null;
		String salt = null;
		String butter = null;
		Batch DBatch = new Batch();
		Batch CBatch = new Batch();
		Batch LBatch = new Batch();
		batches.add(DBatch);
		batches.add(CBatch);
		batches.add(LBatch);

		for (File o : order) {

			Properties p = new Properties();

			try {

				p.load(new FileInputStream(o));

			} catch (IOException e) {

				LOG.error("error", e);

			}

			type = p.getProperty("type");
			flour = p.getProperty("flourWeight");
			water = p.getProperty("waterWeight");
			salt = p.getProperty("saltWeight");
			butter = p.getProperty("butterWeight");

			if (type != null) {

				if (type.equalsIgnoreCase("doughnut")) {
					Doughnut donut = new Doughnut();
					DBatch.batch.add(donut);
					donut.butterWeight = Double.parseDouble(butter);
					donut.saltWeight = Double.parseDouble(salt);
					donut.waterWeight = Double.parseDouble(water);
					donut.flourWeight = Double.parseDouble(flour);

				} else if (type.equalsIgnoreCase("croissant")) {
					Croissant croissant = new Croissant();
					CBatch.batch.add(croissant);
					croissant.butterWeight = Double.parseDouble(butter);
					croissant.saltWeight = Double.parseDouble(salt);
					croissant.waterWeight = Double.parseDouble(water);
					croissant.flourWeight = Double.parseDouble(flour);


				} else if (type.equalsIgnoreCase("loafofbread")) {
					LoafOfBread LOB = new LoafOfBread();
					LBatch.batch.add(LOB);
					LOB.butterWeight = Double.parseDouble(butter);
					LOB.saltWeight = Double.parseDouble(salt);
					LOB.waterWeight = Double.parseDouble(water);
					LOB.flourWeight = Double.parseDouble(flour);



				}

			} else {
				LOG.warn("type is not defined");
			}

		}

		return batches;

	}

}
