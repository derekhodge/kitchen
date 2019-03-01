package kitchen;

import java.util.Timer;
import java.util.TimerTask;

public class Oven {
		public void bake(Pastry pastry) {
			System.out.println("batch started");
			Timer timer = new Timer();
			timer.schedule(new TimerTask() {
				  @Override
				  public void run() {
				    System.out.println("batch finished");
				  }
				}, 5000);
			
		}
}
