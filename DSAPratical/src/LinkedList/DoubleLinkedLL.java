package LinkedList;

public class DoubleLinkedLL {
	DoubleNode head;

	public DoubleLinkedLL() {
		head = null;
	}

	public DoubleNode getHead() {
		return head;
	}

	public void setHead(DoubleNode head) {
		this.head = head;
	}

	public void insertFirst(int data) {
		DoubleNode newNode = new DoubleNode(data);
		if (head == null) {
			head = newNode;
			return;
		}

		newNode.setNext(head);
		head.setPrev(newNode);
		head = newNode;
		return;

	}

	public void insertLast(int data) {
		DoubleNode newNode = new DoubleNode(data);
		if (head == null) {
			head = newNode;
			return;
		}

		DoubleNode itr = head;
		while (itr.getNext() != null) {
			itr = itr.getNext();
		}

		newNode.setPrev(itr);
		itr.setNext(newNode);
		return;

	}

	public void insertByPos(int data, int pos) {
		DoubleNode newNode = new DoubleNode(data);
		if (head == null) {
			head = newNode;
			return;
		}
		if (pos == 1) {
			newNode.setNext(head);
			head.setPrev(newNode);
			return;
		}
		DoubleNode itr = head;
		for (int i = 1; i < pos - 1 && itr.getNext() != null; i++)
			itr = itr.getNext();

		newNode.setNext(itr.getNext());
		newNode.setPrev(itr);
		itr.setNext(newNode);
		itr.getNext().setPrev(newNode);
		return;
	}

	public int deleteFirst() {
		int d = -999;
		if (head == null)
			return d;

		DoubleNode deletd;
		deletd = head;
		d = deletd.getData();
		head = head.getNext();
		if (head != null)
			head.setPrev(null);
		deletd = null;
		return d;
	}

	public int deleteLast() {
		int d = -999;
		if (head == null)
			return d;

		if (head.getNext() == null) {
			d = head.getData();
			head = null;
			return d;
		}
		DoubleNode itr = head;
		while (itr.getNext() != null)
			itr = itr.getNext();
		DoubleNode deleted = itr;
		d = deleted.getData();
		// itr.setPrev(null);
		itr.getPrev().setNext(null);
		deleted = null;
		return d;
	}

	public int deleteByPos(int pos) {
		int d = -999;
		DoubleNode deleted;
		if (head == null)
			return d;

		if (pos == 1) {
			deleted = head;
			d = deleted.getData();
			head = head.getNext();
			if (head != null)
				head.setPrev(null);
			deleted = null;
			return d;

		}
		DoubleNode itr = head;
		for (int i = 1; i < pos - 1 && itr.getNext() != null; i++)
			itr = itr.getNext();

		deleted = itr.getNext();
		d = deleted.getData();
		itr.setNext(deleted.getPrev());
		deleted.setPrev(deleted.getPrev());
		deleted = null;
		return d;
	}

	public void addEmpry(int data) {
		DoubleNode newNode = new DoubleNode(data);
		if (head == null) {
			newNode.setNext(head);
			head = newNode;
			return;
		}else
		{
			System.out.println("DLL is Not Empty");
		}

	}
	public void createList(int data) {
		insertLast(data);
	}

	public String toString() {
		String str = new String(" ");
		if (head == null)
			return "List is Empty";

		DoubleNode itr = head;
		str = "List";
		while (itr != null) {

			str = str + "->" + itr.getData();
			itr = itr.getNext();
		}
		return str;
	}
}
