package kitchen;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Croissant extends Pastry{
	
	private static final Logger LOG = LogManager.getLogger(Cook.class);
	
	public Croissant() {
		super();
		type = "croissant";
	}
}
