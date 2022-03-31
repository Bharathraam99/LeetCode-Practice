import java.util.*;

public class Parenthesis {

	public static void main(String[] args) {

		Stack<Character> s = new Stack<Character>();
		Map<Character, Character> j = new HashMap<Character, Character>();
		j.put(')', '(');
		j.put('}', '{');
		j.put(']', '[');
		String x = "(";
		for (int i = 0; i < x.length(); i++) {
			char a = x.charAt(i);
			if (a == '(' || a == '{' || a == '[') {
				s.push(a);
			} else if (a == ')' || a == '}' || a == ']') {
				if (s.peek().equals(j.get(a))) {
					s.pop();
				} else {
					System.out.println("Imbalanced");
					return;
				}
			} else
				continue;
		}
		if(s.isEmpty())
		System.out.println("Balanced"+s.toString());
		else
			System.out.println("Imbalanced"+s.toString());
	
	}
}
