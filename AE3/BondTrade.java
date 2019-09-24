import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;

public class BondTrade {
	//// ==========================================the method of max and min
	public double max(ArrayList<Double> l) {

		double maxIndex = l.get(0);
		ArrayList<Double> list = l;

		for (int i = 0; i < list.size(); i++) {
			if (maxIndex < list.get(i)) {
				maxIndex = list.get(i);
			}
		}
		double max = maxIndex;
		return max;
	}

	public double min(ArrayList<Double> l) {

		double minIndex = l.get(0);
		ArrayList<Double> list = l;

		for (int i = 0; i < list.size(); i++) {
			if (minIndex > list.get(i)) {
				minIndex = list.get(i);
			}
		}
		double min = minIndex;

		return min;

	}

	static boolean file = false;

	// declare Arraylist of YIELD,DAYS_TO_MATURITY and AMOUNT_CHF(000)
	static ArrayList<Double> a = new ArrayList<Double>();
	static ArrayList<Double> b = new ArrayList<Double>();
	static ArrayList<Double> c = new ArrayList<Double>();

	static ArrayList<Double> m = new ArrayList<Double>();
	static ArrayList<Double> n = new ArrayList<Double>();

	// declare max and min of YIELD,DAYS_TO_MATURITY and AMOUNT_CHF(000)
	static double amax;
	static double amin;
	static double bmax;
	static double bmin;
	static double cmax;
	static double cmin;
	// set filename
	public String filename = null;

	// ========================================================== csv file choose
	public void filechoose() throws IOException {
		JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
		FileNameExtensionFilter filter = new FileNameExtensionFilter("Allowed file", "csv", "CSV");
		jfc.setFileFilter(filter);
		int returnValue = jfc.showOpenDialog(null);

		if (returnValue == JFileChooser.APPROVE_OPTION) {

			File selectedFile = jfc.getSelectedFile();

			// catch file name
			String caselsh1 = selectedFile.getAbsolutePath()
					.substring(selectedFile.getAbsolutePath().lastIndexOf("/") + 1);
			filename = caselsh1.substring(0, caselsh1.lastIndexOf("."));

			// Judge file type
			BufferedReader br = null;
			try {
				br = new BufferedReader(new FileReader(selectedFile));
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			br.readLine();// read and skip first line
			String line = null;
			// declare row, column
			int row = 1;
			int col = 1;
			try {

				while ((line = br.readLine()) != null) {

					// The CSV format file is a comma separator file, which is divided according to
					// the comma.
					String item[] = line.split(",");

					// traversing the row
					for (int index = row - 1; index < line.length();) {
						if (item.length >= col - 1) { 
							// read the specified column
							String last1 = item[col - 1];
							String last2 = item[col];
							String last3 = item[col + 1];
							// convert to double
							a.add(Double.parseDouble(last1));
							b.add(Double.parseDouble(last2));
							c.add(Double.parseDouble(last3));
							// this step for initalising the same size of m,n as well as a,b,c
							m.add(Double.parseDouble(last1));
							n.add(Double.parseDouble(last1));
						}
						break;
					}
				}
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				if (br != null) {
					try {
						br.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
			// get the value of max and min for each Arraylist
			amax = max(a);
			amin = min(a);
			bmax = max(b);
			bmin = min(b);
			cmax = max(c);
			cmin = min(c);
		}

	}
}
