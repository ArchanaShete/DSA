package tree;

import java.util.Scanner;

public class BinaryTreeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//BinaryTree bt=new BinaryTree();
		/*
		 * bt.setRoot(bt.createNode(10)); bt.getRoot().setLeft(bt.createNode(20));
		 * bt.getRoot().setRight(bt.createNode(30));
		 * bt.getRoot().getLeft().setLeft(bt.createNode(40));
		 * //bt.getRoot().getRight().setLeft(bt.createNode(50));
		 * System.out.println("Tree preOrder Traversal....."); bt.preOrder();
		 * System.out.println("Tree inOrder Traversal....."); bt.inOrder();
		 * System.out.println("Tree postOrder Traversal....."); bt.postOrder();
		 */
		
		Scanner sc=new Scanner(System.in);
		BinaryTree bt=new BinaryTree();
		int ch;
		int data;
		do {
		System.out.println("1.insertLevel");
		System.out.println("2.PreOrder");
		System.out.println("3.InOrder");
		System.out.println("4.Travesal");
		System.out.println("5.PostOrder");
		System.out.println("6.SumOfLeaf");
		System.out.println("7.SumOfNotLeaf");
		System.out.println("8.IsIdentical");
		System.out.println("9.MirrorImage");
		System.out.println("10.Count");
		System.out.println("11.exit..");
		System.out.println("Enter Choice");
		ch=sc.nextInt();
		switch(ch) {
		case 1:
			System.out.println("Enter data");
			data=sc.nextInt();
			bt.insertLevel(data);
			break;
		case 2:
			System.out.println("PreOrderTraversal");
			bt.preOrder();
			break;
		case 3 :
			System.out.println("PreOrderTraversal");
			bt.inOrder();
			break;
		
	  case 4:
		System.out.println("List Traversal");
		bt.traversal();
		break;
	  case 5:
		  System.out.println("PreOrderTraversal");
		  bt.postOrder();
		  break;
	  case 6:
		  System.out.println("Sum of Leaf Node");
		  bt.sumOfLeafNode();
		  break;
	  case 7:
		  System.out.println("Sum of  not Leaf Node");
		  bt.sumOfNotLeafNode();
		  break;
	  case 8:
	  case 9:
		  bt.Mirror_image();
		  break;
	  case 10:
		  bt.Count();
		  break;
	  case 11:
		  System.out.println("Exit!!!");
		  break;
	}
		
	}while(ch!=11);
	}
}
