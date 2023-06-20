package mandatoryHomeWork.week1.day5;

import java.util.Arrays;

public class Max69 {
	public static void main(String[] args) {
		int num = 9669;
		String[] s = String.valueOf(num).split("");
		
		for(int i=0;i<s.length-1;i++)
		{
			System.out.println(s[i]);
			if(s[i]=="6")
			{
				s[i] = "9";
				break;
			}
		}
		System.out.println(Arrays.toString(s));
	}

}
