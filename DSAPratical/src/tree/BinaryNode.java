package tree;

public class BinaryNode {
 private int data;
 private BinaryNode left,right;
 public BinaryNode() {
	 data=0;
	 left=right=null;
 }
 public BinaryNode(int data) {
	 this.data=data;
	 left=right=null;
 }
public int getData() {
	return data;
}
public void setData(int data) {
	this.data = data;
}
public BinaryNode getLeft() {
	return left;
}
public void setLeft(BinaryNode left) {
	this.left = left;
}
public BinaryNode getRight() {
	return right;
}
public void setRight(BinaryNode right) {
	this.right = right;
}
}
