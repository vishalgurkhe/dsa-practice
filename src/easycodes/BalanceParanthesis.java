package easycodes;

import java.util.Iterator;
import java.util.Stack;

public class BalanceParanthesis {

		public static boolean isBalancedParenthisis(String str) {

		    Stack<Character> stack = new Stack<>();

		    for (char c : str.toCharArray()) {

		        // Push opening brackets
		        if (c == '(' || c == '{' || c == '[') {
		            stack.push(c);
		        } 
		        // Handle closing brackets
		        else if (c == ')' || c == '}' || c == ']') {

		            // If stack is empty → invalid
		            if (stack.isEmpty()) {
		                return false;
		            }

		            char top = stack.pop();

		            // Check matching
		            if ((c == ')' && top != '(') ||
		                (c == ']' && top != '[') ||
		                (c == '}' && top != '{')) {
		                return false;
		            }
		        }
		    }

		    // Final check
		    return stack.isEmpty();	
	}

	public static void main(String[] args) {
		boolean balancedParenthisis = isBalancedParenthisis("{[]()}");
		System.out.println("" + balancedParenthisis);
	}
}
