
public class Runme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mover runnable = new Mover();
		Thread thread = new Thread(runnable);

		thread.start();
		
		
		try {
			thread.join();
		} catch (InterruptedException e) {
			e.getStackTrace();
		}
	}

}
