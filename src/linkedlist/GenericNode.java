package linkedlist;

/**
 * This class models a GenericNode object which contains data and a pointer to
 * the next generic node in the list. Each generic node has its internal data
 * stored as a parameterized type which is a placeholder for any type of object.
 * 
 * @author rkelley/njohnson/lschoch Programming Project 1 Start Project CS131ON
 */
public class GenericNode<T> {

	private T data; // data that the object stores
	private GenericNode<T> nextNode; // pointer to the next generic node in the LinkedList

	/**
	 * Constructor build GenericNode object. Initializes nextNode and data to null.
	 */
	public GenericNode() {
		setNextNode(null);
		data = null;

	}// end empty-argument constructor

	/**
	 * This method sets the data of the object.
	 * 
	 * @param data the node's parameterized data object
	 */
	public void setData(T data) {
		this.data = data;

	}// end setData

	/**
	 * This method returns the data of the object.
	 * 
	 * @return data the node's parameterized data object
	 */
	public T getData() {
		return this.data;
	}// end getData

	/**
	 * This method returns itself to the caller.
	 * 
	 * @return
	 */
	public GenericNode<T> getNode() {
		return this;

	}// end getNode

	/**
	 * This method updates the pointer for the next node.
	 * 
	 * @param nextNode the pointer to the next node in the list
	 */
	public void setNextNode(GenericNode<T> nextNode) {
		this.nextNode = nextNode;
	}// end setNextNode

	/**
	 * This method returns the node stored in the next node pointer.
	 * 
	 * @return Node the pointer to the next node in the list
	 */
	public GenericNode<T> getNextNode() {
		return nextNode;

	}// end getNextNode

}// end class
