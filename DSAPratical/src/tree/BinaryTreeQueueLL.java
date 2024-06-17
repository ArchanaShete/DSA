package tree;



public class BinaryTreeQueueLL {
	
private BinaryListNode front,rear;

  public void insert(BinaryNode data) {//insertlast
	BinaryListNode newNode=new BinaryListNode(data); 
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
public BinaryNode remove() {
	BinaryNode d=null;
	if(isEmpty()) {
		return d;
	}
	d=front.getData();
	front=front.getNext();
	return d;
}


}
