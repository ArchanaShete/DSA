package bSt;

import java.sql.PreparedStatement;

import tree.BinaryNode;

public class BinarySerTree {
	private BinaryNode root;

	public BinarySerTree() {
		root = null;
	}

	public BinaryNode getRoot() {
		return root;
	}

	public void setRoot(BinaryNode root) {
		this.root = root;
	}

	public void insert_Bst(int data) {
		BinaryNode newNode = new BinaryNode(data);
		if (root == null) {
			root = newNode;
			return;
		}
		BinaryNode parent, itr;
		parent = itr = root;
		while (itr != null) {
			parent = itr;
			if (data < itr.getData()) {
				itr = itr.getLeft();
			} else if (data > itr.getData()) {
				itr = itr.getRight();
			} else {
				System.out.println("Duplicate data");
			}

		}
		if (data < parent.getData()) {
			parent.setLeft(newNode);
		} else {
			parent.setRight(newNode);
		}
		return;
		
	}

	public int search_NonRec(int data) {
		BinaryNode itr=root;
if(root==null) {
	return 0;
}
	
	while(itr!=null) {
		if(itr.getData()==data)
			return itr.getData();
		if(data<itr.getData())
			itr=itr.getLeft();
		else 
		  itr=itr.getRight();
}
	System.out.println("Data Not Found");
return 0;
	}
	public void PreOrder() {
		PreOrderTraversal(root);
	}
	private void PreOrderTraversal(BinaryNode start) {
		if(start==null)
			return;
		System.out.println(start.getData());
		PreOrderTraversal(start.getLeft());
		PreOrderTraversal(start.getRight());
		return;
	}
	public int findMin() {
		if(root==null) {
			return 0;
		}
		BinaryNode itr=root;
		while(itr!=null) {
			if(itr.getLeft()!=null)
			itr=itr.getLeft();
		}
		
		return itr.getData();
	}
	public int findMax() {
		if(root==null) {
			return 0;
		}
		BinaryNode itr=root;
		while(itr!=null) {
			if(itr.getRight()!=null)
			itr=itr.getRight() ;
		}
		
		return itr.getData();
	}
	public void insert(int data) {
		 root=inser_rec(root,data);
	}
	
	private BinaryNode inser_rec(BinaryNode r,int data) {
		 
		if(r==null) {
			r=new BinaryNode(data);
		}
		else if(data<r.getData())
			r.setLeft(inser_rec(r.getLeft(), data));
		else if(data>r.getData())
			r.setRight(inser_rec(r.getRight(), data));
		else
			System.out.println("Duplicate data");
		return r;
	}
	public int findHeight(BinaryNode r) {
		int h_left,h_right;
		if(r==null)
			return 0;
		h_left=findHeight(r.getLeft());
		h_right=findHeight(r.getRight());
		if(h_left>h_right)
			return 1+h_left;
		else
			return 1+h_right;
		}
}
	
