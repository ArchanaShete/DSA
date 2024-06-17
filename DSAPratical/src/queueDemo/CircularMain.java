package queueDemo;

import java.util.Scanner;

public class CircularMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
        Circularqueue st=new Circularqueue();
		int ch;
		int data = 0;
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
				data=sc.nextInt();
				st.insert(data);
				break;
			case 2:
				data= st.remove();
				if(data!=-999) {
					System.out.println(data+" Poped");
				} 
				break;
			case 3:
				st.peek();
				if(data!=-999) {
					System.out.println(data+" Peekd");
				}
				break;
			case 4:
				System.out.println("exit!!!");
				break;

			default:
				break;
			}
			
	}while(ch!=5);
	}


}
