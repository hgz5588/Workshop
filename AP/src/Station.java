import java.util.ArrayList;

public class Station extends Railway {

	public Station(String name, int capcity) {

		super.name = name;
		super.capacity = capcity;
		super.railway.add(name);
		super.setLength(100);;
	}
	
//	@Override
//	   public synchronized void addTrain(Train train)
//	   {  // checks the capacity of the station, if its full the train waits
//	      while (trains.size() > capacity)
//	      {
//	         try
//	         {
//	            wait();
//	         }
//	         catch (InterruptedException e)
//	         {
//	            e.printStackTrace();
//	         }
//	      }
//	      //if the station has space it can receive a train
//	      trains.add(train);
//	      //synchronizes with other objects
//	      notifyAll();
//	   }

}