package stackDemo;

import java.util.Scanner;

public class TwoStckMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		TwoCStack t=new TwoCStack(3);
		int ch=0;
		int data;
		do {
			System.out.println("1.TopA");
			System.out.println("2.TopB");
			System.out.println("3.exit");
			System.out.println("Enter your choice");
			ch=sc.nextInt();
			switch(ch) {
			case 1:
				int ch1=0;
				do {
					System.out.println("1.push");
					System.out.println("2.pop");
					System.out.println("3.peek");
					System.out.println("4.exit");
					System.out.println("enter your Choice");
					ch1=sc.nextInt();
					switch(ch1) {
					case 1:
						System.out.println("Enter data");
						data=sc.nextInt();
						t.pushA(data);
						break;
					
					case 2:
						data=t.popA();
						System.out.println(data+" poped");
						break;
					case 3:
						data=t.peekA();
						System.out.println(data+" peeked");
						break;
					case 4:
						System.out.println("exit!!!");
						
						break;
					}
				}while(ch1!=4);
						break;
				
				case 2:
					int ch2=0;
					do {
						System.out.println("1.push");
						System.out.println("2.pop");
						System.out.println("3.peek");
						System.out.println("4.exit");
						System.out.println("enter your Choice");
						ch2=sc.nextInt();
						switch(ch2) {
						case 1:
							System.out.println("Enter data");
							data=sc.nextInt();
							t.pushB(data);
							break;
						
						case 2:
							data=t.popB();
							System.out.println(data+" poped");
							break;
						case 3:
							data=t.peekB();
							System.out.println(data+" peeked");
							break;
						case 4:
							System.out.println("exit!!!");
							break; 
						}
					}while(ch2!=4);
							
					break;
			}
			
		}while(ch!=4);

	}

}
