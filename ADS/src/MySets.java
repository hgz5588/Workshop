import java.io.FileNotFoundException;
import java.util.*;
//StudentName:ZenghuangHuang
//StudentID:2352729h
public class MySets {

	/******
	 * @param args
	 */

	public static void main(String args[]) throws FileNotFoundException {

		/***********************************************************************
		 * SET OPERATIONS/MANIPULATION Total marks: 9 (breakdown of mark below) You can
		 * test your code by calling your methods.
		 *
		 ***********************************************************************/

		/*
		 * Create and display three Sets of type "String"called mbaSet1,mbaSet2 and
		 * mbaSet3; where mba stands for my initials (Mireilla Bikanga Ada). You must
		 * use YOUR OWN initials. File_veggies.txt contains 3 lists of vegetables.
		 * Members of mbaSet1 are vegetables grown in the UK in March members of mbaSet2
		 * are April vegetables. The third set, "your_initials"Set3 (example mbaSet3),
		 * should contains the name of the vegetables produced in the UK in May. Ensure
		 * there is a space between your outputs to increase readability. add all the
		 * members of each set at once (not one by one) and the output should be sorted
		 * in ascending order for Set 1 and Set 2. The output of Set 3 should be in no
		 * particular order. Display the 3 sets. (1 mark)
		 */

		Set<String> hzhSet1 = new TreeSet<>();
		Set<String> hzhSet2 = new TreeSet<>();
		Set<String> hzhSet3 = new HashSet<>();

		String[] vMarch = { "Radishes", "Purple Sprouting Broccoli", "Artichoke", "Beetroot", "Cabbage", "Sorrel",
				"Spring Greens", "Carrots", "Spring Onions", "Watercress", "Chicory", "Cucumber", "Leeks", "Parsnip",
				"Rhubarb" };

		String[] vApril = { "Beetroot", "Kale", "Spring Onions", "Morel Mushrooms", "Parsnips", "Radishes", "Rhubarb",
				"Rocket", "Cabbage", "Carrots", "Sorrel", "Spinach", "Chicory", "New Potatoes", "Spring Greens",
				"Watercress", "Artichoke" };

		String[] vMay = { "Beetroot", "Chillies", "Lettuce", "Marrow", "Rhubarb", "Rocket", "Pineapple", "Asparagus",
				"Aubergine", "Samphire", "Orange", "Spinach", "Banana", "Spring Onions", "Peppers", "Radishes",
				"Watercress", };
		
		for (int i = 0; i < vMarch.length; i++) {
			hzhSet1.add(vMarch[i]);
		}
		for (int i = 0; i < vApril.length; i++) {
			hzhSet2.add(vApril[i]);
		}
		for (int i = 0; i < vMay.length; i++) {
			hzhSet3.add(vMay[i]);
		}

		System.out.println("hzhSet1:" + hzhSet1);
		System.out.println("hzhSet2:" + hzhSet2);
		System.out.println("hzhSet3:" + hzhSet3);

		// Find the union called "union" of the first two sets - your_initialsSet1 and
		// your_initialSets2. Example, mbaSet1 and mbaSet2.
		// Title of this output should be "Union of your_initials"Set1 and
		// "your_initials"Set2". For example, Union of mbaSet1 and mbaSet2 (1 mark)
		//
		System.out.println();
		System.out.println("Union of hzhSet1 and hzhSet2");
		System.out.println(union(hzhSet1, hzhSet2));

		/*
		 * Find the union called "union1" of the last two sets - your_initialsSet2 and
		 * your_initialSets3. Title of output: Union of
		 * your_initials"Set2 and "your_initials"Set3. (0.5 mark)
		 */
		System.out.println();
		System.out.println("Union of hzhSet2 and hzhSet3");
		Set<String> union = union1(hzhSet2, hzhSet3);
		System.out.println(union);

		// Convert output of the union operation of mbaSet2 and mbaSet3 into a list
		// called "uList". Output with title:
		// Union of your_initials"Set2 and "your_initials"Set3 converted into a list
		// called uList (1 mark)
		System.out.println();
		System.out.println("Union of hzhSet2 and hzhSet3 converted into a list called uList: ");
		ArrayList<String> uList = convSet(union);
		System.out.println(uList);

		// Find the size of the output above (it should be 27). No need to create a
		// separate method for this one but if you did, great!.Title: "Size of uList is
		// :" (0.25 mark)
		System.out.println();
		int size = uList.size();
		System.out.println("Size of uList is" + size);

		/*
		 * Find intersection called "intersection1" between
		 * "your_initials"Set1,"your_initials"Set2 and "your_initial"Set3. Example,
		 * mbaSet1, mbaSet2 and mbaSet3 Title of this output should be
		 * "Intersection of your_initials"Set1, "your_initials"Set2 and
		 * "your_initials"Set3 is: ". For example, Intersection of mbaSet1, mbaSet2 and
		 * mbaSet3 is (1 mark)
		 */
		System.out.println();
		System.out.println("Intersection of of hzhSet1, hzhSet2 and hzhSet3 is: ");
		System.out.println(intersection1(hzhSet1, hzhSet2, hzhSet3));

		/*
		 * Find the difference called "diff" between "your_initials"Set1 and
		 * "your_initials"Set2. Example, mbaSet1 and mbaSet2 Title of this output should
		 * be "Difference of your_initials"Set1 and "your_initials"Set2". For example,
		 * Difference of mbaSet1 and mbaSet2 (1 mark)
		 */
		System.out.println();
		System.out.println("Difference of of hzhSet1 and hzhSet2  is: ");
		System.out.println(diff(hzhSet1, hzhSet2));

		/*
		 * Find the size of Your_initialsSet3 - it should be 17 - (o.25 mark). Check the
		 * presence of banana, pineapple, orange and strawberries in Your_initialsSet3
		 * using contains() method. Display results of checks with appropriate messages.
		 * For example "Is banana present in Your_initialsSet3: (1 mark) if Set3
		 * contains these elements, remove them (0.75 mark). Note: It is possible to
		 * perform a checking and remove operations with just one line of code. However,
		 * for this exercise, you are required to check first, display results of
		 * checks; and then remove them and display the updated list
		 *
		 */
		System.out.println();
		System.out.println("Size of hzhSet3 = " + hzhSet3.size());

		System.out.println();
		System.out.println("Checking if hzhSet3 Contains banana, pineapple, orange and strawberries");
		System.out.println();
		System.out.println("Is banana present in Your_initialsSet3?: " + hzhSet3.remove("Banana"));
		System.out.println("Is Pineapple present in Your_initialsSet3?: " + hzhSet3.remove("Pineapple"));
		System.out.println("Is Orange present in Your_initialsSet3?: " + hzhSet3.remove("Orange"));
		System.out.println("Is Strawberries present in Your_initialsSet3?: " + hzhSet3.remove("Strawberries"));

		/*
		 * Display the remaining members (after remove operation above) of
		 * your_initialsSet3 using an iterator method called "iterator". The output
		 * should be in no particular order (UNSORTED). Title of this output should be
		 * "Iterating your_initials"Set3 after removing the fruits". (1 mark)
		 */
		System.out.println();
		System.out.println("****Iterating Set3 after removing the fruits*******");
		System.out.println();
		Iterator<String> iterator = iterator(hzhSet3);
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		// Display the new size of Your_initialsSet3 (it should be 14).
		// Do not forget the appropriate message/title (0.25 mark)
		System.out.println();
		System.out.println("Size of hzhSet3 is now =" + hzhSet3.size());

	}

	/*********************************************************************************
	 *
	 * All your methods. You can add them all in here or in a separate document
	 * (best practice) which you will call in your Main in order to test
	 *
	 *********************************************************************************/
	// Union of mbaSet1 and mbaSet2 sets using addAll()
	public static Set<String> union(Set<String> hzhSet1, Set<String> hzhSet2) {
		Set<String> union = new TreeSet<>();
		union.addAll(hzhSet1);
		union.addAll(hzhSet2);
		return union;
	}

	// Union of mbaSet2 and mbaSet3 sets using addAll()
	public static Set<String> union1(Set<String> hzhSet2, Set<String> hzhSet3) {
		Set<String> union = new HashSet<>();
		union.addAll(hzhSet2);
		union.addAll(hzhSet3);
		return union;

	}

	// Convert output of union1 to a list called uList
	public static ArrayList<String> convSet(Set<String> union1) {

		ArrayList<String> uList = new ArrayList<>();
		uList.addAll(union1);
		return uList;
	}

	// Intersection of all three Sets
	public static Set<String> intersection1(Set<String> set1, Set<String> set2, Set<String> set3) {

		Set<String> inersection = new TreeSet<>();
		for (String s : set1)
			if (set2.contains(s) == true && set3.contains(s) == true) {
				inersection.add(s);
			}

		return inersection;

	}

	// Find difference between Set1 and set2
	public static Set<String> diff(Set<String> set1, Set<String> set2) {

		Set<String> diffenrent= new TreeSet<>();
		for (String s : set1)
			if (set2.contains(s) != true) {
				diffenrent.add(s);
			}

		return diffenrent;

	}

	// Display members of third set using Iterator after removing fruits
	public static Iterator<String> iterator(Set<String> set) {

		Iterator<String> iterator = set.iterator();

		return iterator;
	}

}