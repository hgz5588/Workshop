
public class Print implements Runnable {
	Railway railway;
	StringBuilder sb = new StringBuilder();

	public StringBuilder print() {

		sb.insert(16, ",");

		return sb;
	}

	@Override
	public void run() {
		sb.append(Railway.route);
		// TODO Auto-generated method stub
		while (true) {
			System.out.println(print());
			try {
				Thread.sleep(1000); // print every second
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			sb.setLength(0); // reset print String
			sb.append(Railway.route);
		}

	}
}
