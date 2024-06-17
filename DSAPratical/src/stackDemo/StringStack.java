package stackDemo;

public class StringStack {
	private int top;
	private String a[];
	public StringStack() {
		top=-1;
		a=new String[3];
	}
	public StringStack(int s) {
		top=-1;
		a=new String[s];
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
public void push(String data) {
	if(isfull()) {
		System.out.println("stack overflow");
		return ;
	}
	top=top+1;
	a[top]=data;
      return;
}
public String pop() {
	String d="stack";
	if(isEmpty()) {
		System.out.println("stack underflow");
		return d;
	}
	
	d=a[top];
	top=top-1;
	return d;
}
public String peek() {
	String d="stack";
	if(isEmpty()) {
		System.out.println("stack underflow");
		return d;
	}
	
	d=a[top];
	
	return d;
}
	

}
