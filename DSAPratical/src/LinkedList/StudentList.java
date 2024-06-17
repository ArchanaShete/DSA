package LinkedList;

public class StudentList {
	private StudentNode head;
	public StudentList() {
		head=null;
	}
	
	public StudentNode getHead() {
		return head;
	}

	public void setHead(StudentNode head) {
		this.head = head;
	}

	public void insertFirst(Student data) {
		StudentNode newNode=new StudentNode(data);
		
		if(head==null) {
			head=newNode;
		}
		newNode.setNext(head);
		head=newNode;
		return;
		
	}
	public String toString() {
		String str=new String(" ");
		if(head==null) {
			return "List is Empty";
		}
		
		StudentNode itr=head;
		str="list";
		while(itr!=null) {
			 str=str+"->"+itr.getData();
			 itr=itr.getNext();
		}
		return str;
		

}
}