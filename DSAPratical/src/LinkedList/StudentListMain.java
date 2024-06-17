package LinkedList;

import java.util.Scanner;

public class StudentListMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		StudentList st=new StudentList();
		int ch;
		Student s=new Student(1,"Arhana","Course");
		do {
			System.out.println("1.insertFirst");
			System.out.println("2.display");
			System.out.println("Enter data");
			ch=sc.nextInt();
			switch(ch) {
			case 1:
				st.insertFirst(s);
				 System.out.println(s);
				break;
			case 2:
				System.out.println(st.toString());
			}
		}while(ch!=3);

	}

}
