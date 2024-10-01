package crackit;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CollectionsPractice {
	
	public static void main(String[] args) {
		
		List<Student> list = Arrays.asList(
			    new Student(1, "Rohit", "Mall", 30, "Male", "Mechanical Engineering", 2015, "Mumbai", 122),
			    new Student(2, "Pulkit", "Singh", 56, "Male", "Computer Engineering", 2018, "Delhi", 67),
			    new Student(3, "Ankit", "Patil", 25, "Female", "Mechanical Engineering", 2019, "Kerala", 164),
			    new Student(4, "Satish Ray", "Malaghan", 30, "Male", "Mechanical Engineering", 2014, "Kerala", 26),
			    new Student(5, "Roshan", "Mukd", 23, "Male", "Biotech Engineering", 2022, "Mumbai", 12),
			    new Student(6, "Chetan", "Star", 24, "Male", "Mechanical Engineering", 2023, "Karnataka", 90),
			    new Student(7, "Arun", "Vittal", 26, "Male", "Electronics Engineering", 2014, "Karnataka", 324),
			    new Student(8, "Nam", "Dev", 31, "Male", "Computer Engineering", 2014, "Karnataka", 433),
			    new Student(9, "Sonu", "Shankar", 27, "Female", "Computer Engineering", 2018, "Karnataka", 7),
			    new Student(10, "Shubham", "Pandey", 26, "Male", "Instrumentation Engineering", 2017, "Mumbai", 98));
		
		
		
		//===================================================================================
	Optional<Student> s=list.stream().sorted(Comparator.comparing(Student::getRank)).skip(1).findFirst();
	
	System.out.println(s);
	
	String str="nikhilllllllll";
	String[] arr = str.split("");
	
	Arrays.stream(arr).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().forEach(System.out::println);

// select * from Employee e inner join Student  s on  e.id=s.id 
	
	// third highest salary
	// select * from Employee order by salary desc limit 2,1
	// select sum(salary) ,departmentName group by departmentname;
	
	int n=3;
	int sum = (n*(n+1))/2;
	System.out.println(sum);
	
	//select * from employee order salary desc limit 2,1;
	// select * from employee e join student s on s.id = e.id;
	//select sum(salary) from employee grouping by department having sum(salary)>1000;
	

	
	Optional<Student> r=list.stream().sorted((a,b)->Integer.compare(a.getRank(), b.getRank())).reversed()).findFirst();
	System.out.println(r);
		
		
		
		
	}

}
