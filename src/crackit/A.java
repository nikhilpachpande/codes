package crackit;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;

public class A {
	
	 public static void main(String[] args) {
		 
		 LocalDateTime t1= LocalDateTime.now();
		 
		 Object o1= new Object();
		 Object o2= new Object();
		 
		 String s1= new String("nikhil");
		 String s2 = new String("nikhil");
		 
		 String s3= "nikhil";
		 String s4=s3;
		 
		 
		 System.out.println(o1==o2);
		 
		 LinkedList<Integer> list = new LinkedList<>();
		 
		 LocalDateTime t2= LocalDateTime.now();
		 
		 System.out.println(t1.toLocalDate());
		 
		 B a= ()->System.out.println("num");
		 
		 try {
			 int x=8/0;
		 }
		 catch(Exception e) {System.out.println(e);}
		 finally {System.out.println(true);}
		 
		 int num =103;
		 int res=0;
		 while(num>0) {
			 
			 res= (res*10)+(num%10);
			 
			num=num/10;
		 }
		 
		 System.out.println(res);
		 
		 int [] prr= {1,2,4};
		 
		 int n = prr.length+1;
		 
		 int sum=0;
		 for (int i :prr) sum = sum+i;
		 
		 int x= (n*(n+1))/2;
		 
		 System.out.println(x-sum);
		 
		 
		 
		 
		 
		 
		 
		 
	 }

}

interface B{void add();}
