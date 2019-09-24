
public class Train extends Thread {
	private int type;
	private int trainID;

	public Train(int trainID, int type) {
		this.trainID = trainID;
		this.type = type;
	}
	
	@Override
	public void run() {

		while (true) {
			try {
				
				
				
				Thread.sleep(1000);
//				if(type==1) {
//					if(Railway.getLength() == 1000) {
//						Thread.sleep(1000/500*1000);
//						position+=1000;
//					}
//					if(railway.length == 100) {
//						Thread.sleep(100/500*1000+5000);
//					}
//				}
//				if(type==2){
//					if(railway.length == 1000) {
//						Thread.sleep(1000/10*1000);
//					}
//					if(railway.length == 100) {
//						Thread.sleep(100/10*1000+5000);
//					}
//				}
				
				if (position >= Railway.size) { // stop thread when train arrive the end point
					break;
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
