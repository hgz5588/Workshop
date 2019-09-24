import java.util.ArrayList;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Railway {
	int segement;
	static ArrayList<String> railway = new ArrayList<String>();
	static ArrayList<Train> trains;
	String name;
	protected int length;
	protected int capacity;
	static int size;
	protected ReentrantLock lock = new ReentrantLock();
	protected Condition condtion = lock.newCondition();
	
	public int getLength() {
		return length;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setLength(int l) {
		length= l;
	}

	public void setCapacity(int c) {
		capacity = c;
	}

	public void createRoute() {
		String route = Station.railway.get(0);
	}

	//public abstract void addTrain(Train train);


}
