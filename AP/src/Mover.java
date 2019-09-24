import java.util.Random;

public class Mover implements Runnable {
	private int id = 0;
	Random random = new Random();
	Train newTrain;
	

	public int getRandom(int min, int max) { //get random number 

		int randomNumber = random.nextInt((max + 1) - min) + min;
		return randomNumber;
	}

	public long delay() { // set up delay between 0 to 3000
		final double d = Math.random();
		final int delay = (int) (d * 3000);
		return delay;
	}

	public Train createTrain() {
		id++;
		newTrain = new Train(id, getRandom(1, 2));
		return newTrain;
	}
	
//	@Override
//	public synchronized void addTrain(Train train) { // checks the capacity of the station, if its full the train waits
//		while (trains.size() > capacity) {
//			try {
//				wait();
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
//		// if the station has space it can receive a train
//		trains.add(train);
//		// synchronizes with other objects
//		notifyAll();
//	}

	@Override
	public void run() {
		Station s1 = new Station("Glasgow", 3);
		Track t1 = new Track();
		Station s2 = new Station("Stirling", 2);
		Track t2 = new Track();
		Station s3 = new Station("Perth", 2);
		
		s1.createRoute();
		
		while (true) {

			Print print = new Print();
			Thread printThread = new Thread(print);
			printThread.start();
			
			try {
				Thread.sleep(delay());// delay randomly to create thread

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			Train t = createTrain(); //create random train thread
			//Thread t = new Thread(train);
			t.start();
		}
		
	}

}
