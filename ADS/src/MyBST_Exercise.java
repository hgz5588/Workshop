import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

//StudentName:ZenghuangHuang
//StudentID:2352729h
public class MyBST_Exercise {

	/********************************************************
	 * Section 1: Using Java in-built LinkedList class Total marks for Section1: 6
	 ******************************************************/

	// Display elements of your linkedList. Use the "Enhanced For Loop" (new way to
	// loop) for this section

	private static void iterateMyList(LinkedList<String> hzhFruits) {
		System.out.println();
		System.out.println("This is hzhFruits LinkedList:");
		System.out.println();
		for (String fruit : hzhFruits) {
			System.out.println(fruit);
		}
	}

	// Check if gooseberries is in your_initialsFruits list

	private static <T> void checkGoose(LinkedList<String> hzhFruits) {
		String goose = "Gooseberries";
		System.out.println();
		if (hzhFruits.contains(goose)) {
			System.out.println("inkedList contains the element 'Gooseberries");
		} else
			System.out.println("LinkedList doesn't contain the element 'Gooseberries'");
		System.out.println();

	}
	/*
	 * Insert "Gooseberries" after "Blackberries". Then display the updated
	 * linkedList your_initialsFruits after adding Gooseberries. Use appropriate
	 * message.
	 */

	private static void insertGoose(LinkedList<String> hzhFruits) {
		System.out.println();
		System.out.println("This is hzhFruits linkedList after adding Gooseberries: ");
		int index = hzhFruits.indexOf("Blackberries");
		hzhFruits.add(index + 1, "Gooseberries");
		System.out.println(hzhFruits);

	}
	/*
	 * Display the element that is not ending with "berries". Use variable called
	 * notBerries. Appropriate title/message. Remove that element and display
	 * your_initialsFruits linkedList after removing that element. Use appropriate
	 * title.
	 */

//    his is mbaFruits linkedList after removing...
	private static void notEndingWithBerries(LinkedList<String> hzhFruits) {

		for (int i = 0; i < hzhFruits.size(); i++) {
			if (!(hzhFruits.get(i).endsWith("berries"))&& (!hzhFruits.get(i).contains(" "))) {
				System.out.println();
				System.out.println();
				System.out.println("Element not ending with Berries is: " + hzhFruits.get(i));
				System.out.println();
				hzhFruits.remove(i);
				System.out.println("This is hzhFruits linkedList after removing " + hzhFruits.get(i) + ": \n" + hzhFruits);
				System.out.println();
				System.out.println();
			}
		}
	}

	// Method: convertLinkedListToArray. Convert your linkedList into Array called
	// "bstFruit" and display.

	private static void convertLinkedListToArray(LinkedList<String> hzhFruits, ArrayList<String> bstFruits) {
		;
		for (String fruit : hzhFruits) {
			bstFruits.add(fruit);
		}
		System.out.println("Array Elements - This is bstFruits linkedList after converting hzhFruits in an array: ");
		for (String fruit : bstFruits) {
			System.out.println(fruit);
		}
	}

	// Sort the your_initialsFruits List (example: mbaFruits) in ascending order
	// using Collections and display

	private static void sortedLinkedList(LinkedList<String> hzhFruits) {
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("This is hzhFruits linkedList after sorting in ascending order: ");
		Collections.sort(hzhFruits);
		System.out.println(hzhFruits);
	}

	/**
	 * @param args
	 */

	public static void main(String[] args) throws IOException {
		/**************************************************************************************************************************************
		 * Section 1 (6 marks)- Using Java in-built LinkedList class - Create an empty
		 * Linked List "your_initial"Fruit (for example: mbaFruits) Populate the
		 * LinkedList with the content of File_fruits.txt. perform the operations
		 * required in this sections.
		 * 
		 * Section 2- (9 marks) construct a Balanced Binary Search Tree, the BST should
		 * not be extremely unbalanced. Note: It is not AVL tree Ensure there is a space
		 * between your outputs to increase readability.
		 ***************************************************************************************************************************************/

		// Create an empty Linked List of Strings your_initialsFruits (example:
		// mbaFruits)
		// Use the add() method to populate the linkedList mbaFruits with the elements
		// in file_fruits.txt.
		// Method called "iterateMyList": Use the Enhanced loop to print out your
		// linkedList with appropriate title
		// such as "This is your_initials"Fruits LinkedList (Example, This is mbaFruits
		// LinkedList).
		// (1 mark)
		LinkedList<String> hzhFruits = new LinkedList<>();

		String[] s = { "Strawberries", "Raspberries", "Blueberries", "Cranberries", "Blackberries", "Apples",
				"Honeyberries", "Goji Berries", "Wineberries", "Tayberries", };
		for (int i = 0; i < s.length; i++) {
			hzhFruits.add(s[i]);
		}

		iterateMyList(hzhFruits);

		// Method "CheckGoose". Find Gooseberries in the linked list. Use variable name:
		// goose.
		// If goose exists display the message "LinkedList contains the element
		// 'Gooseberries".
		// Otherwise "LinkedList doesn't contain the element 'Gooseberries'".
		// (1 mark)
		checkGoose(hzhFruits);

		// Method called "insertGoose" - Insert the fruit name "Gooseberries" after
		// "Blackberries".Display the updated
		// linkedList your_initialsFruits after adding Gooseberries. Use appropriate
		// message.(1 mark)
		insertGoose(hzhFruits);

		// Method called "notEndingWithBerries" - Display the element that is not ending
		// with "berries". Use variable called notBerries. Appropriate title
		// Remove that element and display your_initialsFruits after removing that
		// element.
		// Use appropriate title. Example, this is mbaFruits linkedList after
		// removing....(1 mark)
		//
		notEndingWithBerries(hzhFruits);

		// Method called "convertLinkedListToArray" - Convert your_initialsFruits
		// LinkedList to Array called "bstFruits"
		// and display bstFruits array content (1 mark)
		ArrayList<String> bstFruits = new ArrayList<>();
		convertLinkedListToArray(hzhFruits, bstFruits);

		// Sort the your_initialsFruits List (example: mbaFruits) in ascending order
		// using Collections. Display sorted LinkedList (1 mark)

		sortedLinkedList(hzhFruits);

		/*
		 * *****************************************************************************
		 * *********************** Section - 2 Implementing a BST
		 * 
		 * Now convert your array of berries fruits into a binary search tree called
		 * "myTree". Display the in-order, pre-order and postOrder of "myTree".
		 *
		 * Note: This should not result in an extremely unbalanced tree Total marks: 9
		 ***************************************************************************************************/

		// Create a binary search tree called "myTree" - you convert your array of
		// fruits into a BST (4.5 marks)

		BSTree myTree = new BSTree();
		int r = bstFruits.size() / 2;
		FruitNode rootNode = new FruitNode();
		rootNode.val = bstFruits.get(r-1);
		myTree.insert(rootNode);
		for (int i = 0; i < bstFruits.size(); i++) {
			if (i == r-1)
				continue;
			FruitNode node = new FruitNode();
			node.val = bstFruits.get(i);
			myTree.insert(node);
		}

		// Call class method: Display the elements of the binary Search tree "myTree" -
		// inOrder traversal (1.5 mark)
		System.out.println();
		System.out.println("This is myTree inOrder traversal:");
		myTree.inorderT(rootNode);
		System.out.println();

		// Call class method: Display the elements of the binary Search tree "myTree" -
		// postOrder traversal (1.5 mark)
		System.out.println();
		System.out.println("This is myTree postOrder traversal:");
		myTree.postorderT(rootNode);
		System.out.println();

		// Call class method: Display the elements of the binary Search tree "myTree" -
		// preOrder traversal (1.5 mark)
		System.out.println();
		System.out.println("This is myTree preOrder traversal");
		myTree.preorderT(rootNode);
		System.out.println();
	}
}

/*********************************************************************************************************
 * Create a binary search tree using a class called "BSTree". You will need to
 * define a FruitNode class. FruitNode will be used to store the elements of
 * your fruit_file.txt. You will be implementing the following methods for your
 * BSTree: insert method - this will help you convert your array of fruits into
 * a binary search tree called "myTree" public inOrder() - An in-order traversal
 * to return the list of fruits in order. This is the fruits in alphabetical
 * order public postOrder() - a post-order traversal - start from left to right
 * going upward. public preOrder() - A pre-order traversal to return the list of
 * fruits pre-order. This is the order in which the list is inserted. As you get
 * the list in one of the section above and insert it to a new tree myTree. Each
 * of the traversal functions has a recursive helper function: void
 * inorderT(FruitNode t) void preOrderT(FruitNode t) void preOrderT(FruitNode t)
 * 
 ********************************************************************************************************/

/*************************************************
 *
 * the FruitNode class
 *
 **************************************************/
// FruitNode: a node in a binary search tree
class FruitNode {

	String val;
	FruitNode right;
	FruitNode left;

}

/************************************************
 *
 * BSTree class
 * 
 * @param <E>
 * 
 *************************************************/
// BSTree: binary search tree
class BSTree {
	private FruitNode root; // hidden root node

	/************************************************
	 * insert
	 *************************************************/
	// insert: if new entry, insert in tree (use compareTo).
	public void insert(FruitNode fruitnode) {

		if (root == null) {
			root = fruitnode;
		} else {
			FruitNode curr = root;
			FruitNode parent = null;
			for (;;) {
				parent = curr;
				if (fruitnode.val.compareTo(parent.val) <= 0) {
					curr = curr.left;
					if (curr == null) {
						parent.left = fruitnode;
						return;
					}
				} else {
					curr = curr.right;
					if (curr == null) {
						parent.right = fruitnode;
						return;
					}
				}
			}
		}
	}

	/*************************************************
	 *
	 * Your three TRAVERSALS
	 *
	 **************************************************/
	// inOrder traversal

	// inorderT: recursive function
	public void inorderT(FruitNode fruitnode) {
		if (fruitnode != null) {
			inorderT(fruitnode.left);
			System.out.print(fruitnode.val + " ");
			inorderT(fruitnode.right);
		}
	}

	// postOrderTraversal

	// postOrderT: recursive function
	public void postorderT(FruitNode fruitnode) {
		if (fruitnode != null) {
			postorderT(fruitnode.left);
			postorderT(fruitnode.right);
			System.out.print(fruitnode.val + " ");
		}
	}

	// preOrderTraversal

	// preorderT: recursive function
	public void preorderT(FruitNode fruitnode) {
		if (fruitnode != null) {
			System.out.print(fruitnode.val + " ");
			preorderT(fruitnode.left);
			preorderT(fruitnode.right);
		}
	}

}
