package linkedlist;

/**
 * This class models a linked list in which each node has a pointer to the node
 * after it, except the tail which does not have a node after. Each linked list 
 * has its internal data stored as a parameterized type which is a placeholder
 * for any type of object.
 * 
 * @author rkelley/njohnson/lschoch Programming Project 1 Start Project CS131ON
 */
public class GenericLinkedList<T> {

	private GenericNode<T> head; // generic node to represent the head of the list
	private GenericNode<T> tail; // generic node to represent the tail (end) of the list
	private int length; // variable to keep track of the number of elements in the list

	/**
	 * The constructor for this object, initializes the list such that it is an
	 * empty (no head or tail) node.
	 */
	public GenericLinkedList() {
		head = null;
		length = 0;
		tail = head;
	}// end empty-argument constructor

	/**
	 * Method to see if there are any elements in the list.
	 * 
	 * @return boolean true/false, true if the list is empty
	 */
	public boolean isEmpty() {
		if (head == null) {
			return true;
		} else
			return false;
	}// end isEmpty

	/**
	 * This method returns the generic head node of the list from which you can
	 * traverse the entire list by following generic node links.
	 * 
	 * @return the pointer to the head of the list
	 */
	public GenericNode<T> getList() {
		return head;
	}// end getList

	/**
	 * This method adds a new generic node to the list. It first checks to see if
	 * the list is empty. If so, it sets the head and the tail nodes to the generic
	 * node passed in. If the list is not empty it places the generic node at the
	 * end of the list and updates the pointers in the tail. This implementation
	 * does not support adding entries to the middle of the list.
	 * 
	 * @param aNode the generic node passed in, to be added to the list
	 */
	public void addNode(GenericNode<T> aNode) {
		if (isEmpty()) {
			head = aNode;
			tail = head;
			return;
		}

		tail.setNextNode(aNode);
		tail = tail.getNextNode();
		tail.setNextNode(null);
		length++;

	}// end addNode

}// end class
