package LinkedList;

public class StudentNode {
	private Student data;
	private StudentNode next;
	public StudentNode() {
		data=null;
		next=null;
	}
	
	public StudentNode(Student data) {
		
		this.data = data;
		next=null;
	}

	public Student getData() {
		return data;
	}
	public void setData(Student data) {
		this.data = data;
	}
	public StudentNode getNext() {
		return next;
	}
	public void setNext(StudentNode next) {
		this.next = next;
	}
	

}
