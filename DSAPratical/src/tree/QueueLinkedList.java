package tree;

import LinkedList.IntListNode;

public class QueueLinkedList {
	IntListNode front,rear;
	
	public void insert(int data) {//insertlast
		IntListNode newNode=new IntListNode(data);
		if(front==null) {
			front=rear=newNode;
					return;
		}
		rear.setNext(newNode);
		rear=newNode;
		return;
	}
	public Boolean isEmpty() {
		if(front==null)
			return true;
		else
		 	return false;
	}
	public int remove() {
		int d=-999;
		if(isEmpty()) {
			return d;
		}
		d=front.getData();
		front=front.getNext();
		return d;
	}
	public int peek() {
		int d=-999;
		if(isEmpty()) {
			return d;
		}
		d=front.getData();
		return d;
	}
	

}
