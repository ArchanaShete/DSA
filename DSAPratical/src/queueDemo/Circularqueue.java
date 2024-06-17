package queueDemo;

public class Circularqueue {
	private int front,rear;
	private int a[];
	public Circularqueue() {
		front=rear=-1;
		a=new int[5];
		
	}
	public Circularqueue(int s) {
		front=rear=-1;
		a=new int[s];
		
	}
	public boolean isFull() {
		if(  (front==0) && (rear==a.length-1) || (front==rear+1)) {
			return true;
		}else {
			return false;
		}
	}  
	public boolean isEmpty() {
		if((front==-1))
			return true;
		else
			return false;
	}
	public void insert(int data) {
		if(isFull()) {
			System.out.println("queue overflow");
			return;
		}
		if(front==-1)
			front=0;
		
		if(rear==a.length-1)
		{
			rear=0;
		}
		else {
			rear=rear+1;
		}  
		
		a[rear]=data;
		return;
	}
	
	public int remove() {
		int d=-999;
		if(isEmpty()) {
			System.out.println("queue underflow");
			return d;
		}
		d=a[front];
		if(front==a.length-1)
		{
			front=0;
		}
		else if(front==rear)
		{
			front=-1;
			rear=-1;
		}
		else {
				front=front+1;
		}
		return d;
	}
public int peek() {
	int d=-999;
	if(isEmpty()) {
		System.out.println("queue underflow");
		return d;
	}
	d=a[front];
	return d;
}
	
}
