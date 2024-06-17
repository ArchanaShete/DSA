package tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
	private BinaryNode root;

	public BinaryTree() {
		root = null;
	}

	public BinaryNode getRoot() {
		return root;
	}

	public void setRoot(BinaryNode root) {
		this.root = root;
	}

	public BinaryNode createNode(int d) {
		//BinaryNode newNode=new BinaryNode(d);
		//return newNode;
		return new BinaryNode(d);
	}

	public void preOrder() {
		PreOrderTravesal(root);

	}

	public void PreOrderTravesal(BinaryNode start) {
             if(start==null) {
            	 return;
             }
             System.out.println(start.getData());
             PreOrderTravesal(start.getLeft());
             PreOrderTravesal(start.getRight());
		
	}
	public void inOrder() {
		inOrderTravesal(root);

	}

	public void inOrderTravesal(BinaryNode start) {
             if(start==null) {
            	 return;
             }
             inOrderTravesal(start.getLeft());
             System.out.println(start.getData());
             inOrderTravesal(start.getRight());
		
	}
	public void postOrder() {
		postOrderTravesal(root);

	}

	public void postOrderTravesal(BinaryNode start) {
             if(start==null) {
            	 return;
             }
            
             postOrderTravesal(start.getLeft());
             
             postOrderTravesal(start.getRight());
             System.out.println(start.getData());
		
	}
	public void insertLevel(int data) {
		BinaryNode newNode=new BinaryNode(data);
		if(root==null) {
			root=newNode;
			return;
		}
		BinaryNode itr=root;
		BinaryTreeQueueLL q=new BinaryTreeQueueLL();
		q.insert(itr);
		while(!q.isEmpty()) {
			itr=q.remove();
			if(itr.getLeft()==null) {
				itr.setLeft(newNode);
				return;
			}else {
				q.insert(itr.getLeft());
			}
			
			if(itr.getRight()==null) {
				itr.setRight(newNode);
				return;
			}
			else {
				q.insert(itr.getRight());
			}
		}
	}
	
	public void traversal(){
		//BinaryNode newNode=new BinaryNode();
		if(root==null) {
			System.out.println("Empty..data.!!!");
			return;
		}
		BinaryNode itr=root;
		BinaryTreeQueueLL q=new BinaryTreeQueueLL();
		q.insert(itr);
		while(!q.isEmpty()) {
			itr=q.remove();
			System.out.print(itr.getData()+" ");
			if(itr.getLeft()!=null) {
				q.insert(itr.getLeft());
			}
			
			if(itr.getRight()!=null) {
				q.insert(itr.getRight());
			}
		}
	}
	public void sumOfLeafNode(){
		//BinaryNode newNode=new BinaryNode();
		if(root==null) {
			System.out.println("Empty..data.!!!");
			return;
		}
		BinaryNode itr=root;
		int sum=0;
		BinaryTreeQueueLL q=new BinaryTreeQueueLL();
		q.insert(itr);
		while(!q.isEmpty()) {
			itr=q.remove(); 
			//System.out.print(itr.getData()+" ");
			if(itr.getLeft()==null&&itr.getRight()==null) {
				sum=sum+itr.getData();
				
			}
			if(itr.getLeft()!=null) {
				q.insert(itr.getLeft());
			}
			
			if(itr.getRight()!=null) {
				q.insert(itr.getRight());
			}
			
		}
		System.out.println(sum);
	}
	public void sumOfNotLeafNode(){
		//BinaryNode newNode=new BinaryNode();
		if(root==null) {
			System.out.println("Empty..data.!!!");
			return;
		}
		BinaryNode itr=root;
		int sum=0;
		BinaryTreeQueueLL q=new BinaryTreeQueueLL();
		q.insert(itr);
		while(!q.isEmpty()) {
			itr=q.remove();
			//System.out.print(itr.getData()+" ");
			if(itr.getLeft()!=null ||  itr.getRight()!=null) {
				System.out.println(itr.getData());
				sum=sum+itr.getData();
				
			}
			if(itr.getLeft()!=null) {
				q.insert(itr.getLeft());
			}
			
			if(itr.getRight()!=null) {
				q.insert(itr.getRight());
			}
			
		}
		System.out.println(sum);
	}
	public static boolean isIdentical(BinaryTree t1,BinaryTree t2) {
		BinaryNode itr1=t1.getRoot();
		BinaryNode itr2=t2.getRoot();
		if((t1.getRoot()==null) || (t2.getRoot()==null)) {
			return false;
		}
		Queue<BinaryNode> q1=new LinkedList<BinaryNode>();
		Queue<BinaryNode> q2=new LinkedList<BinaryNode>();
		q1.add(itr1);
		q2.add(itr2);
		while(!q1.isEmpty()&&!q2.isEmpty()) {
			itr1=q1.remove();
			itr2=q2.remove();
			if(itr1.getData()!=itr2.getData())
				return false;
			
			if(itr1.getLeft()!=null) {
				q1.add(itr1.getLeft());
			}
			if(itr1.getRight()!=null) {
				q2.add(itr1.getRight());
			}
			if(itr2.getLeft()!=null) {
				q2.add(itr2.getLeft());
			}
			if(itr2.getRight()!=null) {
				q2.add(itr2.getRight());
			}
		}
		if(q1.isEmpty()&&q2.isEmpty()) {
			return true;
		}else {
			return false;
		}
	}
	
	
	public void swap(BinaryNode p) {
		BinaryNode temp;
		temp=p.getLeft();
		p.setLeft(p.getRight());
		p.setLeft(temp);
	
} 
	public void Mirror_image() {
		BinaryNode itr=root;
		if(root==null)
			return;
		
		Queue<BinaryNode> q=new LinkedList<BinaryNode>();
		q.add(itr);
		while(!q.isEmpty()) {
			itr=q.remove();
			System.out.println(itr.getData());
			swap(itr);
			
			if(itr.getLeft()!=null) {
				q.add(itr.getLeft());
			}
			if(itr.getRight()!=null) {
				q.add(itr.getRight());
			}
		}
		return;
	}
	public int Count() {
		BinaryNode itr=root;
		if(root==null) {
			return -1;
		}
		int cnt=-1;
		BinaryNode demmy=new BinaryNode(-99);
		
		Queue<BinaryNode> q=new LinkedList<BinaryNode>();
		q.add(itr);
		q.add(demmy);
		while(!q.isEmpty()) {
			itr=q.remove();
			if(itr.getData()==-99) {
				cnt=cnt+1;
				q.add(demmy);
				itr=q.remove();
			}
			if(itr.getLeft()!=null) {
				q.add(itr.getLeft());
			}
			if(itr.getRight()!=null) {
				q.add(itr.getRight());
			}
		}
		return cnt;
		
	}
}
