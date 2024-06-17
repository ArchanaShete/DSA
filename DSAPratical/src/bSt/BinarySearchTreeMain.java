package bSt;

import java.util.Scanner;

public class BinarySearchTreeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySerTree bst=new BinarySerTree();
		Scanner sc=new Scanner(System.in);
		int ch;
		int data;
		do {
			System.out.println("1.insert_nonReac");
			System.out.println("2.search");
			System.out.println("3.PreOrderTravesal");
			System.out.println("4.findMin");
			System.out.println("5.findMax");
			System.out.println("6.Insert Data Rec");
			System.out.println("7.Height");
			System.out.println("8.exit");
			System.out.println("Enter your choice"
					+ "z");
			ch=sc.nextInt();
			switch(ch) {
			case 1:
				System.out.println("Enter data");
				data=sc.nextInt();
				bst.insert_Bst(data);
				break;
			case 2:
				System.out.println("Enter data");
				data=sc.nextInt();
				
				System.out.println(bst.search_NonRec(data));
				break;
			
			case 3:
				bst.PreOrder();
			break;
			case 4:
				System.out.println("Min of tree "+bst.findMin());
				break;
				
		case 5:
			System.out.println("Min of tree "+bst.findMax());
			break;
			
			case 6:
				System.out.println("Enter n value");
				int n=sc.nextInt();
				for(int i=1;i<=n;i++) {
					System.out.println("Enter data");
					data=sc.nextInt();
					bst.insert(data);
				}
				
				break;
			case 7:
				System.out.println(bst.findHeight(bst.getRoot()));
				
			}
		}while(ch!=8);

	}

}
