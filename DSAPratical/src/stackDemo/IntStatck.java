package stackDemo;

public class IntStatck {
	private int top;
	private int a[];
	public IntStatck() {
		top=-1;
		a=new int[3];
		
	}
	public IntStatck(int s) {
		top=-1;
		a=new int[s];
	}
	public boolean isFull() {
		if(top==a.length-1)
			return true;
		else
			return false;
	}
	public boolean isEmpty() {
		if(top==-1)
			return true;
		else
			return false;
	}
	public void push(int data) {
		if(isFull()) {
			System.out.println("Stack is overflow");
			return;
		}
		top=top+1;
		a[top]=data;
		return;
	}
	public int pop() {
		int data=-999;
		if(isEmpty()) {
			System.out.println("stack underflow");
			return data;
		}
		data=a[top];
		top=top-1;
		return data;
	}
	public int peek() {
		int data=-999;
		if(isEmpty()) {
			System.out.println("stack underflow");
			return data;
		}
		data=a[top];
		
		return data;
	}

}
