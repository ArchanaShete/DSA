package stackDemo;

public class TwoCStack {
	private int topA,topB;
	private int a[];
	public TwoCStack() {
		topA=-1;
		topB=4;
		a=new int[4];
	}
	public TwoCStack(int s) {
		topA=-1;
		topB=s;
		a=new int[s];
	}
	public boolean isfull() {
		if(topB-topA==1) 
			return true;
		else
			return false;
	}
	public boolean isEmptyA() {
		if(topA==-1)
			return true;
		else
			return false;
	}
	public boolean isEmptyB() {
		if(topB==a.length) 
		  return true;
		else 
			return false;
		
	}
	public void pushA(int data) {
		if(isfull()) {
			System.out.println("stack overflow");
			return ;
			
		}
		topA=topA+1;
		a[topA]=data;
		return;
	}
	public void pushB(int data) {
		if(isfull()) {
			System.out.println("stack overflow");
			return ;
			
		}
		topB=topB-1;
		a[topB]=data;
		return;
	}
	
	public int popA() {
		int data=-999;
		if(isEmptyA()) {
			System.out.println("stcak underflow");
			return data;
		}
		data=a[topA];
		topA=topA-1;
		return data;
	}
	public int popB() {
		int data=-999;
		if(isEmptyB()) {
			System.out.println("stcak underflow");
			return data;
		}
		data=a[topB];
		topB=topB+1;
		return data;
	}
	public int peekA() {
		int data=-999;
	
		if(isEmptyA()) {
			System.out.println("stcak underflow");
			return data;
		}
		data=a[topA];
		
		return data;
	}
	public int peekB() {
		int data=-999;
		if(isEmptyB()) {
			System.out.println("stcak underflow");
			return data;
		}
		data=a[topB];
		
		return data;
	}
}
