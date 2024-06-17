package LinkedList;

import java.util.Scanner;

public class linkedLitmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * LinkedList list=new LinkedList(); list.insertFirst(10); list.insertFirst(20);
		 * list.insertFirst(30); System.out.println(list);
		 */
		Scanner sc=new Scanner(System.in);
		LinkedList ll=new LinkedList();
		LinkedList ll2=new LinkedList();
		int ch,ch1,ch2;
		int data,pos,after,before;
		do {
			System.out.println("1.insertFirst");
			System.out.println("2.InsertLast");
			System.out.println("3.InsertByPos");
			System.out.println("4.InsertBfore");
			System.out.println("5.InsertAfter");
			System.out.println("6.InsertSort");
			System.out.println("7.InsertDesSort");
			System.out.println("8.Display");
			System.out.println("9.DeletedFirst");
			System.out.println("10.DeleteLAst");
			System.out.println("11.DeleteByPos");
			System.out.println("12.DisplayAlternateNode");
			System.out.println("13.CountNode ");
			System.out.println("14.reverseList");
			System.out.println("15.concat");
			System.out.println("16.ConcatInThirdList");
			System.out.println("17.length");
			System.out.println("18.SumOfNodes");
			System.out.println("19.exit ");
			System.out.println("Enter your choice");
			
			ch=sc.nextInt();
			switch(ch) {
			case 1:
				System.out.println("Enter data");
				data=sc.nextInt();
				ll.insertFirst(data);
				break;
			case 2:
				do {
					System.out.println("1.insert In List1");
					System.out.println("2.Insert In List2");
					System.out.println("3.Exit");
					System.out.println("Enter your choice");
					ch1 = sc.nextInt();
					switch (ch1) {
					case 1:
						System.out.println("Enter data");
						data = sc.nextInt();
						ll.insertLast(data);
						break;
					case 2:
						System.out.println("Enter data");
						data = sc.nextInt();
						ll2.insertLast(data);
						break;
					case 3:
						System.out.println("exit!!!!");
					}
				} while (ch1 != 3);
				break;
			case 3:
				System.out.println("Enter data and pos");
				data=sc.nextInt();
				pos=sc.nextInt();
				ll.insertByPos(data, pos);
				break;
			case 4:
				System.out.println("Enter data and before");
				data=sc.nextInt();
				before=sc.nextInt();
				ll.insertBofore(data, before);
				break;
			case 5:
				System.out.println("Enter data and after");
				data=sc.nextInt();
				after=sc.nextInt();
				ll.insertAfter(data, after);
				break;
			case 6:
				System.out.println("Enter data");
				data=sc.nextInt();
				ll.insertSorted(data);
				System.out.println("List1"+ll);
				break;
			case 7:
				System.out.println("Enter data");
				data=sc.nextInt();
				ll.insertDes(data);
				System.out.println("List2"+ll);
				break;
			case 8:
				System.out.println(ll.toString());
				System.out.println(ll2);
				break;
			case 9:
				data=ll.deleteFirst();
				System.out.println(data+" DeletedFirst");
				break;
			case 10:
				data=ll.deleteLast();
				System.out.println(data+" DeletedLast");
				break;
			case 11:
				System.out.println("Enter pos");
				pos=sc.nextInt();
				data=ll.deletedByPos(pos);
				System.out.println(data+" Deleted");
				break;
			case 12:
				ll.displayAlternate();
				break;
			case 13:
				System.out.println(ll.CountNode());
				break;
			case 14:
				//System.out.println("Exit!!!");
				ll.reverseList();
				break;
			case 15:
				ll.Concat(ll2);
				
				System.out.println("Done");
				break;
			case 16:
				LinkedList list3=LinkedList.ConcatInThiredList(ll, ll2);
				
				System.out.println("list1"+ll);
				System.out.println("list2"+ll2);
				System.out.println("list3"+list3);
				break;
			case 17:
				System.out.println("Length Of List "+ll.length(ll.getHead()));
				break;
			case 18:
				System.out.println("SumOfList Of List "+ll.sumOfNodes(ll.getHead()));
				break;
			case 19:
				System.out.println("Exit!!!");
				break;
			}
			
		}while(ch!=19);

	}

}
