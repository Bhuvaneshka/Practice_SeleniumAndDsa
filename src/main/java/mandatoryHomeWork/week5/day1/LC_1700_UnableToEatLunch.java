package mandatoryHomeWork.week5.day1;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class LC_1700_UnableToEatLunch {
//	https://leetcode.com/problems/number-of-students-unable-to-eat-lunch/	
	
	@Test
	public void example1()
	{
		int[] students = {1,1,0,0};
		int[] sandwiches = {0,1,0,1};
		System.out.println(countStudents(students,sandwiches));
		
	}
	
	@Test
	public void example2()
	{
		int[] students = {1,1,1,0,0,1};
		int[] sandwiches = {1,0,0,0,1,1};
		System.out.println(countStudents(students,sandwiches));
		
	}
	
	 public int countStudents(int[] students, int[] sandwiches) {
	        
	        List<Integer> studentsList = new ArrayList<>();
	        for(Integer each : students)
	        {
	            studentsList.add(each);
	        }

	        List<Integer> sandWichesList = new ArrayList();
	         for(Integer each1 : sandwiches)
	        {
	            sandWichesList.add(each1);
	        }

	        int left = 0;
	        int count = 0;
	        while(left<studentsList.size())
	        {
	            if(count==studentsList.size())
	            {
	                return studentsList.size();
	            } else if(studentsList.get(left)==sandWichesList.get(left))
	            {
	                studentsList.remove(left);
	                sandWichesList.remove(left);
	                count=0;
	            }
	            else {
	                int removeValue = studentsList.remove(left);
	                studentsList.add(removeValue);
	                count++;
	            }  
	        }
	        return studentsList.size();

	    }

}
