package queueDemo;

public class SimpleQueue {
	private int front,rear;
	private int a[];
	public SimpleQueue() {
		front=rear=-1;
		a=new int[4];
		
	}
	public SimpleQueue(int s) {
		front=rear=-1;
		a=new int[s];
		
	}
	public boolean isfull() {
		if(rear==a.length-1) {
			return true;
		}else {
			return false;
		}
	}
	public boolean isEmpty()
	{
		if((front==-1) || (front==rear+1))
			return true;
		else
			return false;
	}
	public void insert(int data) {
		if(isfull()) {
			System.out.println("queue overflow");
			return ;
		}
		if(front==-1)
			front=0;
		rear=rear+1;
		a[rear]=data;
				return;
	}
	public int remove() {
		int d=-999;
		if(isEmpty()) {
			System.out.println("queue underflow");
			return  d;
		}
		d=a[front];
		front=front+1;
		return d;
	}
	public int peek() {
		int d=-999;
		if(isEmpty()) {
			System.out.println("queue underflow");
			return  d;
		}
		d=a[front];
		
		return d;
	}

}
