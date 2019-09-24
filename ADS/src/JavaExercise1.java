import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
//StudentName:ZenghuangHuang
//StudentID:2352729h
public class JavaExercise1<E> {

	/****************************************************************
	 * ArrayList Implement the following methods Display the elements of an
	 * ArrayList using different methods after add and remove operations Total
	 * marks: 5
	 *
	 **************************************************************/

	// Display elements using iterator loop. Make sure you print out the section's
	// title "Title - Original ArrayList" before displaying the elements. mba (from
	// mbaList) are my initials, use yours.
	public static <E> Iterator<E> MyListIterator(ArrayList<E> hzhList) {
		return hzhList.iterator();
	}

	// Add two elements at given index. Display elements after add operation. Use
	// the "Enhanced For Loop" (new way to loop) for this section
	public static void MyEnhancedLoop(ArrayList<String> hzhList)

	{
		for (String list : hzhList) {
			System.out.println(list);
		}

	}

	// Display elements after remove operation of "Camera Obscura and World of
	// Illusions". Use the While Loop for this section
	public static <E> void MyWhileLoop(ArrayList<E> hzhList) {

		int i = 0;
		while (i < hzhList.size()) {
			System.out.println(hzhList.get(i));
			i++;
		}

	}

	// Remove an element from a specified index. Displaying elements after remove
	// operation. Use the regular "For Loop"for this section
	public static <E> void MyForLoop(ArrayList<E> hzhList) {
		for (int j = 0; j < hzhList.size(); j++) {

			System.out.println(hzhList.get(j));

		}
	}

	/**
	 * @param args
	 */

	public static void main(String args[]) throws FileNotFoundException {

		/*
		 * Create an ArrayList (type safety) called "your_initials"List for example
		 * mbaList Here mba stands for my initials Mireilla Bikanga Ada. For each of the
		 * output, make sure there is a space between the title and the elements
		 * displayed. Also, ensure there is a space between your outputs to increase
		 * readability. File_museums.txt contains the museums that need to be added to
		 * the ArrayList.
		 */

		// Create ArrayList and add elements to your ArrayList one by one. (1 mark)
		ArrayList<String> ml = new ArrayList<>();
		ml.add("Kelvingrove Art Gallery and Museum");
		ml.add("National Museum of Scotland");
		ml.add("Royal Yacht Britannia");
		ml.add("Camera Obscura and World of Illusions");
		ml.add("Morayvia");
		ml.add("Montrose Air Station Heritage Centre");

		// Display elements using iterator loop. Make sure print out the section's title
		// "Title - Original ArrayList" before displaying the elements (1 mark)
		Iterator<String> i = MyListIterator(ml);
		System.out.println();
		System.out.println("Title - Original ArrayList");
		System.out.println();
		while (i.hasNext()) {
			System.out.println(i.next());
		}

		// Add element at the given index (1 mark)
		// Add element "Peterhead Prison Museum" at first position
		// Add element "Wick Heritage Museum" at second position
		// Displaying elements after add operation. Use the "Enhanced For Loop" (new way
		// to loop) for this section.
		// Make sure it prints out the section's title "Title - ArrayList after adding
		// elements" before displaying the elements
		ml.add(0, "Peterhead Prison Museum");
		ml.add(1, "Wick Heritage Museum");
		System.out.println();
		System.out.println("Title - ArrayList after adding elements");
		System.out.println();
		MyEnhancedLoop(ml);

		// Remove elements from ArrayList (1 mark)
		// Remove "Camera Obscura and World of Illusions" from ArrayList
		// Display elements using a "while loop".
		// Make sure print out the section's title "Title - ArrayList after remove
		// operation" before displaying the elements
		ml.remove("Camera Obscura and World of Illusions");
		System.out.println();
		System.out.println("Title - ArrayList after remove operation");
		System.out.println();
		MyWhileLoop(ml);

		// In this section, you are required to remove an element from the specified
		// index. (1 mark)
		// Task: Remove the fifth element.
		// Task: Display elements using a "For Loop" (regular for loop).
		// Make sure print out the section's title "Title - Final ArrayList" before
		// displaying the elements.
		ml.remove(4);
		System.out.println();
		System.out.println("Title - Final ArrayList");
		System.out.println();
		MyForLoop(ml);
	}
}
