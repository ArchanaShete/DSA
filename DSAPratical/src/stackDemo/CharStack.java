 package stackDemo;

public class CharStack {
	private int top;
	private char a[];
	
	public  CharStack() {
		top=-1;
		a=new char[3];
	}
	public CharStack(int s) {
		top=-1;
		a=new char[s];
	}
	
	public boolean isfull() {
		if(top==a.length-1) {
			return true;
		}else
		{
			return false;
		}
	}
public boolean isEmpty() {
	if(top==-1) {
		return true;
	}else {
		return false;
	}
}
public void push(char data) {
	if(isfull()) {
		System.out.println("stack overflow");
		return ;
	}
	top=top+1;
	a[top]=data;
      return;
}
public char pop() {
	char d='z';
	if(isEmpty()) {
		System.out.println("stack underflow");
		return d;
	}
	
	d=a[top];
	top=top-1;
	return d;
}
public char peek() {
	char d='z';
	if(isEmpty()) {
		System.out.println("stack underflow");
		return d;
	}
	
	d=a[top];
	
	return d;
}
}
