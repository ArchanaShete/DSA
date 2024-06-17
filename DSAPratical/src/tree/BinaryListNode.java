package tree;

public class BinaryListNode {
	private BinaryNode data;
	private BinaryListNode next;
	
	public BinaryListNode() {
		data=null;
		next=null;
	}
	public BinaryListNode(BinaryNode data) {
		this.data=data;
		next=null;
	}
	public BinaryNode getData() {
		return data;
	}
	public void setData(BinaryNode data) {
		this.data = data;
	}
	public BinaryListNode getNext() {
		return next;
	}
	public void setNext(BinaryListNode next) {
		this.next = next;
	}
	

}
