
public class Track extends Railway {
	private Train train;
	public Track() {
		super.name = "track";
		super.railway.add(name);
		this.capacity = 1;
		super.setLength(1000);
	}

}
