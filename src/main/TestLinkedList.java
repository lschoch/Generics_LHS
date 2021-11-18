package main;

// Import the new classes along with the originals
import linkedlist.LinkedList;
import linkedlist.Node;
import linkedlist.GenericLinkedList;
import linkedlist.GenericNode;

/**
 * Class to test the classes and methods of this package.
 * 
 * @author rkelley/njohnson/lschoch Programming Project 1 Start Project CS131ON
 */
public class TestLinkedList {
	
	/**
	 * The main method. Instantiates four lists and prints their data.
	 * 
	 * @param args this method does not use command line arguments
	 */
	public static void main(String[] args) {
		
		// This is the original TestLinkedList code
		LinkedList myList=new LinkedList();
		
		Node aNode=new Node();
		aNode.setData("Element 1");
		myList.addNode(aNode);
		aNode = new Node();
		aNode.setData("Element 2");
		myList.addNode(aNode);
		
		Node tempnode=myList.getList();
		do 
		{
			System.out.println(tempnode.getData());
			tempnode=tempnode.getNextNode();
		} while (tempnode!=null);
		
		// This is the code added by lschoch
		// Create integerList
		GenericLinkedList<Integer> integerList = new GenericLinkedList<Integer>();
		// Create nodes for integerList
		GenericNode<Integer> intNode = new GenericNode<Integer>();
		intNode.setData(101);
		integerList.addNode(intNode);
		intNode = new GenericNode<Integer>();
		intNode.setData(202);
		integerList.addNode(intNode);
		intNode = new GenericNode<Integer>();
		intNode.setData(303);
		integerList.addNode(intNode);

		// Create doubleList
		GenericLinkedList<Double> doubleList = new GenericLinkedList<Double>();
		// Create nodes for doubleList
		GenericNode<Double> doubleNode = new GenericNode<Double>();
		doubleNode.setData(101.101);
		doubleList.addNode(doubleNode);
		doubleNode = new GenericNode<Double>();
		doubleNode.setData(202.202);
		doubleList.addNode(doubleNode);
		doubleNode = new GenericNode<Double>();
		doubleNode.setData(303.303);
		doubleList.addNode(doubleNode);

		// Create stringList
		GenericLinkedList<String> stringList = new GenericLinkedList<String>();
		// Create nodes for stringList
		GenericNode<String> stringNode = new GenericNode<String>();
		stringNode.setData("A string.");
		stringList.addNode(stringNode);
		stringNode = new GenericNode<String>();
		stringNode.setData("Another string.");
		stringList.addNode(stringNode);
		stringNode = new GenericNode<String>();
		stringNode.setData("Last string.");
		stringList.addNode(stringNode);

		// Print the data in each list
		System.out.println("\nintegerList:");
		GenericNode<Integer> integerHead = integerList.getList();
		do {
			System.out.println(integerHead.getData());
			integerHead = integerHead.getNextNode();
		} while (integerHead != null);

		System.out.println("\ndoubleList:");
		GenericNode<Double> doubleHead = doubleList.getList();
		do {
			System.out.println(doubleHead.getData());
			doubleHead = doubleHead.getNextNode();
		} while (doubleHead != null);

		System.out.println("\nstringList:");
		GenericNode<String> stringHead = stringList.getList();
		do {
			System.out.println(stringHead.getData());
			stringHead = stringHead.getNextNode();
		} while (stringHead != null);

	}// end main

}// end class
