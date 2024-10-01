package crackit;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class CollectionsPracticeTest {
	
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
		
		
//		//  Find list of students whose first name starts with alphabet A
//		
//		List<Student> ans=list.stream().filter(x->x.getFirstName().startsWith("A")).toList();
//		ans.forEach(System.out::println);
//		
//		//Group The Student By Department Names
		
//		Map<String, List<Student>> ans2=list.stream().collect(Collectors.groupingBy(Student::getDepartmantName));
//		ans2.entrySet().forEach(System.out::println);
		
		// Find the total count of student using stream
		
		list.stream().collect(Collectors.groupingBy(Student::getGender,Collectors.averagingDouble(Student::getAge))).entrySet().forEach(System.out::println);
	}
	
	@GetMapping("/test/")
	public ResponseEntity<?> getEmpkoyee(@QueryParam(value="product",required=false) String str ){
		
		Product = service.getEmployee
		
				return ResponseEnrity.ok(product);
		?product=name
				
				ResponseEnriry<>("String",HttpStatus.not_found)
				
				@REstControllerAdvidce
				
				@Exceptionhandler)(exe.class){
					public dto bla(Exe e) {
						
						return dto.builder.status.body(e.gemessate).statscode(httpStatu.internalservereror)
								
								Logger log= LoggerFactor4y.getLogger(name.class);
					}
				}
	}
	
	

}
