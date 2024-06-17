package LinkedList;

public class CirculaeList {
	private IntListNode last;//because of time compleity is O(1)
	
	public CirculaeList() {
		last=null;
	}

	public IntListNode getLast() {
		return last;
	}

	public void setLast(IntListNode last) {
		this.last = last;
	} 
	
	public void insertFirst(int data) {
		IntListNode newNode=new IntListNode(data);
		
		if(last==null) {
			last=newNode;
			last.setNext(last); //10|100
		}
		
		newNode.setNext(last.getNext());
		last.setNext(newNode);
		return;
	}
	 public void insertLast(int data) {
		 IntListNode newNode=new IntListNode(data);
		 
		 if(last==null) {
			 last=newNode;
			 last.setNext(last);
			 return;
		 }
		 
		 newNode.setNext(last.getNext());
		 last.setNext(newNode);
		 last=newNode;
		 return;
	 }
	 public void insertByPos(int data,int pos) {
		 IntListNode newNode=new IntListNode(data);
		 if(last==null) {
			 last=newNode;
			 last.setNext(last);
			 return;
		 }
		 if(pos==1) {
			 newNode.setNext(last.getNext());
			 last.setNext(newNode);
			 return;
		 }
		 IntListNode itr=last.getNext();
		 int i=1;
		 do {
			
		   if(i<pos-1) {
			   itr=itr.getNext();
			   i=i+1;
		   }else {
			   newNode.setNext(itr.getNext());
				 itr.setNext(newNode);
				 if(itr==last)
					 last=newNode;
				 return; 
		   }
		 }while(itr!=last.getNext());
		 System.out.println("Invalid Position ");
		
	 }
	 public int deleteFirst() {
		 int d=-999; 
		 if(last==null)
			 return d;
		 IntListNode deleted=last.getNext();
		 d=deleted.getData();
	     last.setNext(deleted.getNext());
	     deleted.setNext(null);
	     if(last.getNext()==last)
	    	 last.setNext(null);
	     last=null;
	     deleted=null;
	     return d;
	 
	 }
	 public int deleteLast() {
		 int d=-999;
		 IntListNode deleted;
		 if(last==null) {
			 return d;
		 }
		 if(last.getNext()==last) {
			 d=last.getData();
			 last.setNext(null);
			 last=null;
			 return d;
		 }
			/*
			 * deleted=last.getNext(); while(deleted.getNext()!=last)
			 * deleted=deleted.getNext();
			 * 
			 * 
			 * deleted.setNext(last.getNext()); d=last.getData(); last=deleted;
			 * deleted=deleted.getNext(); deleted.setNext(null); deleted=null; return d;
			 */
		 IntListNode itr=last.getNext();
		 while(itr.getNext()!=last) {
			 itr=itr.getNext();
		 }
		 deleted=itr.getNext();
		 itr.setNext(last.getNext());
		 d=deleted.getData();
		 last=deleted;
		
		 
		 deleted=null;
		 return d;
	 }
	 public void insertBefore(int data,int before) {
		 IntListNode newNode=new IntListNode(data);
		 if(last==null) {
			 last=newNode;
		 last.setNext(last);
		 return ;
		 }
		 if(last.getNext().getData()==before) {
			 newNode.setNext(last.getNext());
			 last.setNext(newNode);
			 return;
		 }
		 IntListNode itr=last.getNext();
		 do {
		if(itr.getNext().getData()!=before)
		{
			 itr=itr.getNext();
		}else {
		 
		 newNode.setNext(itr.getNext());
		 itr.setNext(newNode);
		 return;
		}
		 }while(itr!=last);
	 }
	 public void insertafter(int data,int after) {
		 IntListNode newNode=new IntListNode(data);
		 if(last==null) {
			 last=newNode;
		 last.setNext(last);
		 return ;
		 }
		 IntListNode itr=last.getNext();
			
		
		 if(last.getData()==after) {
			 newNode.setNext(last.getNext());
			 last.setNext(newNode);
			 last=newNode;
			 return;
		 }
		 do {
		 if(itr.getData()!=after) {
			 itr=itr.getNext();
		 }else {
			 newNode.setNext(itr.getNext());
			 itr.setNext(newNode);
			 return;
		 }
		 }while(itr!=last);
	 }
		
	 
	 public void reverseList(IntListNode temp) {
		
		 if(temp==last) {
			 System.out.print("List->"+last.getData());
			 return;
			 }
		  
		 reverseList(temp.getNext());
       System.out.print("->"+temp.getData());		 
	 }
	 public int length(IntListNode p) {
			if(p==last)
				return 1;
			return 1+length(p.getNext());
		}
	 public int sumOfNodes(IntListNode p) {
			if(p==last)
				return last.getData();
			return p.getData()+sumOfNodes(p.getNext() );
		}
	 public void display() {
		 IntListNode itr=last.getNext();
		 System.out.print("List");
		 do {
			 System.out.print("->"+itr.getData());
			 
			 itr=itr.getNext();
		 }while(itr!=last.getNext());
	 }
	

}
