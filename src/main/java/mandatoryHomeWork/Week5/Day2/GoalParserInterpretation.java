package mandatoryHomeWork.week5.day2;

import org.junit.Test;

public class GoalParserInterpretation {
//	LeetCode: 1678
//	You own a Goal Parser that can interpret a string command. The command consists of an alphabet of "G", "()" and/or "(al)" in some order. 
//	The Goal Parser will interpret "G" as the string "G", "()" as the string "o", and "(al)" as the string "al". The interpreted strings are then concatenated in the original order.
//	Given the string command, return the Goal Parser's interpretation of command.

//	Input: command = "G()(al)"
//			Output: "Goal"
	
//Pseudo Code:
//1) Iterate the loop from 0 to command.length()
//2) Create a empty stringbuilder to append the char values.
//3) check the condition  if the command.charAt(i)=='G' then append the value in string builder.
//4) else if the condition command.charAt(i)=='(' && command.charAt(i+1)==')' is true then append 'o' in the stringBuilder.
//5) Then point the i values to current position using i=i+2;
//6) else append the string "al" to the stringBuilder
//7) Then point the i values to current position using i=i+4;

//Time: O(n)
//Space: O(n)
@Test
	public void example()
	{
		String command = "G()(al)";
		System.out.println(findGoalParser(command));
	}
	
	@Test
	public void example1()
	{
		String command = "G()()()()(al)";
		System.out.println(findGoalParser(command));
	}
	
	@Test
	public void example2()
	{
		String command = "(al)G(al)()()G";
		System.out.println(findGoalParser(command));
	}

	private String findGoalParser(String command) {
		StringBuilder sb = new StringBuilder();
		int i=0;
		while(i<command.length())
		{
			if(command.charAt(i) =='G'){
				sb.append('G');
				i++;
			}else if(command.charAt(i) =='(' && command.charAt(i+1) ==')'){
				sb.append('o');
				i=i+2;
			}else{
				sb.append("al");
				i=i+4;
			}
		}
		return sb.toString();
	}
}
