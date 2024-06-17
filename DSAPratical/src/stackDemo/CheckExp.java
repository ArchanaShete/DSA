package stackDemo;

import java.util.Scanner;

public class CheckExp {
	private String exp;

	public CheckExp(String exp) {
		this.exp = exp;
	}

	public boolean match(char p1, char p2) {
		if ((p1 == '[') && (p2 == ']'))
			return true;
		if ((p1 == '{') && (p2 == '}'))
			return true;
		if ((p1 == '(') && (p2 == ')'))
			return true;

		return false;
	}

	public boolean check(String exp) {
		char ch1, ch2;
		CharStack st = new CharStack();
		for (int i = 0; i < exp.length(); i++) {
			ch1 = exp.charAt(i);
			if ((ch1 == '[') || (ch1 == '{') || (ch1 == '('))
				st.push(ch1);
			if ((ch1 == ']') || (ch1 == '}') || (ch1 == ')'))
			{
				if (st.isEmpty())// check whether stack is empty or not
				{
					System.out.println("closing tag is more than opening");
					return false;
				}
				
			ch2 = st.pop();
			if (!(match(ch2, ch1))) { 
				System.out.println("mismatched");
				return false;
			}
		}
	}
		
		if (st.isEmpty()) {
			return true;
		}
		else {
			System.out.println("opening tag is more than closing");

		return false;
		}
		}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the exp");
		String exp = sc.next();
		CheckExp ch = new CheckExp(exp);
		if (ch.check(exp)) {
			System.out.println("Valid Exp");
		} else {
			System.out.println("invalid Exp");
		}
	}
}
