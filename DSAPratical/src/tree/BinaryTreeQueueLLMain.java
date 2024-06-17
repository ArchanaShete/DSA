package tree;

import java.util.Scanner;

public class BinaryTreeQueueLLMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	      BinaryTreeQueueLL st=new BinaryTreeQueueLL();
			int ch;
			BinaryNode data = null;
			do {
				System.out.println("1.insert");
				System.out.println("2.remove");
				System.out.println("3.peek");
				System.out.println("4.exit");
				System.out.println("enter your Choice");
				ch=sc.nextInt();
				switch (ch) {
				case 1:
					System.out.println("Enter the data");
					//data;
					st.insert(data);
					break;
				case 2:
					data= st.remove();
					if(data!=null) {
						System.out.println(data+" Poped");
					} 
					break;
				
				case 4:
					System.out.println("exit!!!");
					break;

				default:
					break;
				}
				
		}while(ch!=4);
		}

	}
