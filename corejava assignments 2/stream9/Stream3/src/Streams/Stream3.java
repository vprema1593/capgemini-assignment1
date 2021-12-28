package Streams;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


public class Stream3 {
	public static void main(String[] args) {
	      List<Transaction> transaction=Arrays.asList(
	    		 new Transaction("Jute",2000,210),
	    		 new Transaction("Iron",2019,210),
	    		 new Transaction("cotton",1990,210),
	    		 new Transaction("steel",2011,210),
	    		 new Transaction("copper",2011,210)
	    		  
	    		  );
	    		
	      
	     Optional<Object> c=transaction.stream()
	    		 .max(Comparator.comparing(Transaction::getValue))
	    	     .map(p->p.value);
	    		 System.out.println(c);
	    		 
	    		 Optional<Object> c1=transaction.stream()
	    	    		 .min(Comparator.comparing(Transaction::getValue))
	    	    	     .map(p->p.value);
	    	    		 System.out.println(c1);
	    	    		 
	    	    		 List<String>c2=transaction.stream()
	    	    				 .map(p->p.toString())
	    	    				 .collect(Collectors.toList());
	    	    		 System.out.println(c2);
	    	    		 	 
	    	    		 List<String>c3=transaction.stream()
	    	    				 .filter(p->p.year==2011)
	    	    				 .sorted((o1,o2)->(o1.getValue()-o2.getValue()))
	    	    				 .map(p->p.toString())
	    	    				 .collect(Collectors.toList());
	    	    		 System.out.println(c3);
	    	    		
	    		 
		}


}
