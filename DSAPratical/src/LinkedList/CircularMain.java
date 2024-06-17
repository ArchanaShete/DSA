package LinkedList;

import java.util.Scanner;

public class CircularMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		CirculaeList cl=new CirculaeList();
		int ch;
		int data,pos,after,before;
		do {
			
			System.out.println("\n1.insertFirst");
			System.out.println("2.InsertLast");
			System.out.println("3.InsertByPos");
			System.out.println("4.Display");
			System.out.println("5.DeleteFirst");
			System.out.println("6.deleteLast");
			System.out.println("7.InsertBefore");
			System.out.println("8.insertAfter");
			System.out.println("9.reverseList");
			System.out.println("10.Length");
			System.out.println("11.SumOfList");
			System.out.println("12.Exit");
			System.out.println("Enter your choice");
			ch=sc.nextInt();
			switch(ch) {
			case 1:
				System.out.println("Enter data");
				data=sc.nextInt();
				cl.insertFirst(data);
				break;
			case 2:
				System.out.println("Enter data");
				data=sc.nextInt();
				cl.insertLast(data);
				break;
			case 3:
				System.out.println("Enter data and pos");
				data=sc.nextInt();
				pos=sc.nextInt();
				cl.insertByPos(data, pos);
				break;
			case 4:
				cl.display();
				break;
			case 5:
				data=cl.deleteFirst();
				System.out.println(data+" DeletedFirst");
				break;
			case 6:
				data=cl.deleteLast();
				System.out.println(data+" DeletedLast");
				break;
			case 7:
				System.out.println("Enter data and before");
				data=sc.nextInt();
				before=sc.nextInt();
				cl.insertBefore(data, before);
				break;
			case 8:
				System.out.println("Enter data and after");
				data=sc.nextInt();
				after=sc.nextInt();
				cl.insertafter(data, after);
				break;
				
			case 9:
				cl.reverseList(cl.getLast().getNext());
				break;
			case 10:
				System.out.println("length Of List is = "+cl.length(cl.getLast().getNext())); 
				
				break;
			
			case 11:
				System.out.println("length Of List is = "+cl.sumOfNodes(cl.getLast().getNext())); 
				
				break;
			case 12:
				System.out.println("Exit!!");
				
				 break;
			}
			
	}while(ch!=12);
	}
}
