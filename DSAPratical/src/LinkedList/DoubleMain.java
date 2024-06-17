package LinkedList;

import java.util.Scanner;

public class DoubleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		DoubleLinkedLL ll=new DoubleLinkedLL();
		int ch;
		int data=0,pos,after,before;
		do {
			System.out.println("1.insertFirst");
			System.out.println("2.InsertLast");
			System.out.println("3.InsertByPos");
			System.out.println("4.InsertBfore");
			System.out.println("5.AddEmpty");
			System.out.println("6.CreateList");
			System.out.println("7.DeletedFirst");
			System.out.println("8.DeleteLAst");
			System.out.println("9.DeleteByPos");
			System.out.println("10.Display");
			System.out.println("11.exit ");
			System.out.println("Enter your choice");
			
			ch=sc.nextInt();
			switch(ch) {
			case 1:
				System.out.println("Enter data");
				data=sc.nextInt();
				ll.insertFirst(data);
				break;
			case 2:
				System.out.println("Enter data");
				data=sc.nextInt();
				ll.insertLast(data);
				break;
			case 3:
				System.out.println("Enter data and pos");
				data=sc.nextInt();
				pos=sc.nextInt();
				ll.insertByPos(data, pos);
				break;
			case 5:
				System.out.println("Enter data");
				data=sc.nextInt();
				ll.addEmpry(data);
				break;
			case 6:
				System.out.println("Enter the value of n");
				int n=sc.nextInt();
				for(int i=1;i<=n;i++) {
					System.out.println("Enter data");
					data=sc.nextInt();
				}
				ll.createList(data);
				break;
			case 7:
				data=ll.deleteFirst();
				System.out.println(data+" DeletedFirst");
				break;
			case 8:
				data=ll.deleteLast();
				System.out.println(data+" DeletedLast");
				break;
			case 9:
				System.out.println("Enter pos");
				pos=sc.nextInt();
				data=ll.deleteByPos(pos);
				System.out.println(data+" Deleted");
				System.out.println(ll);
				break;
			case 10:
				System.out.println(ll);
				break; 
			case 11:
				System.out.println("Exit!!!");
				break;
			}
			
		}while(ch!=11);

	}


}
