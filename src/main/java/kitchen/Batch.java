package kitchen;

import java.util.ArrayList;
import java.util.List;

public class Batch {
	List<Pastry> batch = new ArrayList<>();

	@Override
	public String toString() {
		return "Batch [batch=" + batch + "]";
	}

	public List<Pastry> getBatch() {
		return batch;
	}

	public void setBatch(List<Pastry> batch) {
		this.batch = batch;
	}

}
