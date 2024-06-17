package LinkedList;

public class LinkedList {
	private IntListNode head;
	
	public LinkedList() {
		head=null;
	}
	
	public IntListNode getHead() {
		return head;
	}

	public void setHead(IntListNode head) {
		this.head = head;
	}

	public int insertFirst(int data) {
		IntListNode newNode=new IntListNode(data);//heap 10|null//1000
		
		if(head==null) { //heap  head=null
			head=newNode;//10/null
			return data;
		}
		
			newNode.setNext(head);//head=1000
			head=newNode;  //20|1000
			return data;
			
		
	}
	public void insertLast(int data) {
		IntListNode newNode= new IntListNode(data);
		
		if(head==null) {
			head=newNode;
		return;
		}
		
		//last la insert so itr of node created//head la intr krt nahi
		IntListNode itr=head;
		while(itr.getNext()!=null) {
			itr=itr.getNext();
			
		}
		
		itr.setNext(newNode);
		return;
	}
	public void insertByPos(int data,int pos) {
		IntListNode newNode=new IntListNode(data);
		if(head==null)
			head=newNode;
		
		if(pos==1) {
			newNode.setNext(head);
			head=newNode;
		}
		
	IntListNode itr=head;
	for(int i=1;i<pos-1 && itr.getNext()!=null;i++) {
		itr=itr.getNext();
	}
	newNode.setNext(itr.getNext());
	itr.setNext(newNode);
	}
	public void insertBofore(int data,int before) {
		IntListNode newNode=new IntListNode(data);
		if(head==null)
			head=newNode;
		
		if(head.getData()==before) {
			newNode.setNext(head);
			head=newNode;
		}
		IntListNode itr=head;
		while((itr.getNext()!=null)&&itr.getNext().getData()!=before)
			itr=itr.getNext();
		
		
		newNode.setNext(itr.getNext());
		itr.setNext(newNode);
		return;
	}
	public void insertSorted(int data) {
		IntListNode newNode=new IntListNode(data);
		if((head==null)||data<head.getData()) {
			newNode.setNext(head);
			head=newNode;
			return;
		}
		IntListNode itr=head;
		while((itr.getNext()!=null)&&(data>itr.getNext().getData()))
			itr=itr.getNext();
		
		newNode.setNext(itr.getNext());
		itr.setNext(newNode);
		return;
		
	}
	public void insertDes(int data) {
		IntListNode newNode=new IntListNode(data);
		if((head==null)|| data>head.getData()){
			newNode.setNext(head);
			head=newNode;
			return;
		}
		IntListNode itr=head;
		while(itr.getNext()!=null&&data<itr.getNext().getData())
			itr=itr.getNext();
		
		newNode.setNext(itr.getNext());
		itr.setNext(newNode);
		return;
	}
	public int deleteFirst() {
		int d=-999;
		IntListNode deleted;
		if(head==null)
			return d;
		
		if(head.getNext()==null) {//if have one node only
			d=head.getData();
			head=null;
			return d;
		}
		deleted=head;
		d=deleted.getData();
	     head=head.getNext();
	     deleted=null;
	     return d;
	}
	public int deleteLast() {
		int d=-999;
		IntListNode deleted;
		if(head==null)
			return d;
		
		if(head.getNext()==null) {
			d=head.getData();
			head=null;
			return d;
		}
		IntListNode itr=head;
		while(itr.getNext().getNext()!=null)//deleted node ke pahile node tk jana
			itr=itr.getNext();
		
		deleted=itr.getNext();
		d=deleted.getData();
		itr.setNext(null);
		deleted=null;
		return d;
	}
	public int deletedByPos(int pos) {
		int d=-999;
		IntListNode deleted;
		if(head==null)
			return d;
		
		if(pos==1) {
			d=head.getData();
			deleted=head;
			head=head.getNext();
			deleted=null;
					return d;
		}
		IntListNode itr=head;
		for(int i=1;i<pos-1&&itr.getNext()!=null;i++) {
			itr=itr.getNext();
		} 
		
		deleted=itr.getNext();
		d=deleted.getData();
		itr.setNext(itr.getNext().getNext());
		deleted=null;
		return d;
		
	}
	public void displayAlternate() {
		if(head==null)
			System.out.println("List is Empty");
		IntListNode itr=head;
		while(itr!=null) {
			System.out.println(itr.getData()+" ");
			if(itr.getNext()!=null) {
				itr=itr.getNext().getNext();
			}else {
				itr=itr.getNext();
			}
		}
	}
	public int CountNode() {
		int count=0;
		IntListNode itr=head;
		while(itr!=null) {
			count++;
			itr=itr.getNext();
		}
		return count;
	}
	
	public void insertAfter(int data,int after) {
		IntListNode newNode=new IntListNode(data);
		if(head==null) {
			head=newNode;
		return;}
		
		
		IntListNode itr=head;   
		while((itr.getNext() !=null)&&(itr.getData()!=after))
			itr=itr.getNext();
		
		if((itr.getNext()!=null))
			newNode.setNext(itr.getNext());
		itr.setNext(newNode);
		return;
		
		
	}
	public void Concat(LinkedList list2) {
		IntListNode itr= head;
		while(itr.getNext()!=null)
			itr=itr.getNext();
		
		itr.setNext(list2.getHead());
		return;
	}
	public static LinkedList ConcatInThiredList(LinkedList list1,LinkedList list2) {
		LinkedList list3=new LinkedList();
		IntListNode itr=list1.getHead();
		IntListNode itr1=list2.getHead();
		while(itr.getNext()!=null) {
			list3.insertLast(itr.getData());
			itr=itr.getNext();
		}
		list3.insertLast(itr.getData());
		
		while(itr1.getNext()!=null) {
			list3.insertLast(itr1.getData());
			itr1=itr1.getNext();
		}
		list3.insertLast(itr1.getData());
		
		return list3;
	}
	public void reverseList() {
		IntListNode prev,next,itr;
		prev=null;
		itr=head;
		while(itr!=null) {
			next=itr.getNext();
			itr.setNext(prev);
			prev=itr;
			itr=next;
		}
		head=prev;
	}
	public int length(IntListNode p) {
		if(p==null)
			return 0;
		return 1+length(p.getNext());
	}
	public int sumOfNodes(IntListNode p) {
		if(p==null)
			return 0;
		return p.getData()+sumOfNodes(p.getNext());
	}
	
	public String toString() {
		String str=new String(" ");
		if(head==null) {
			return "List is Empty";
		}
		
		IntListNode itr=head;
		str="list";
		while(itr!=null) {
			 str=str+"->"+itr.getData();
			 itr=itr.getNext();
		}
		return str;
	}

}
