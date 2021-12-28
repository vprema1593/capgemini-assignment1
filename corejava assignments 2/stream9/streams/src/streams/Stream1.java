package streams;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream1 {
	public static void main(String[] args) {
	     List<Fruit> fruits= Arrays.asList(
	     new Fruit("Apple",100,45,"Red"),
	     new Fruit("banana",20,49,"yellow"),
	     new Fruit("Mango",100,150,"yellow"),
	     new Fruit("greps",10,60,"green"));
	     
	     //decending order of colories
	     List<Integer> c=fruits.stream().filter(p->p.calories<100).sorted((o1,o2)->(o2.getCalories()-o1.getCalories())).map(p->p.calories)
	    		 .collect(Collectors.toList());
	     System.out.println(c);
	    		 
	     //displaying color
	     List<String> c1=fruits.stream()
	    		 .sorted((o1,o2) ->(o1.getColor().compareTo(o2.getColor())))
	    		 .map(p->p.color)
	             .collect(Collectors.toList());
	             System.out.println(c1);
	//displying red color fruit price ascending order
	             List<String>c2=fruits.stream()
	            		 .filter(p->p.getColor().equals("Red"))
	            		 .sorted((o1,o2)->(o1.getColor().compareTo(o2.getColor())))
	            		 .map(p->p.toString())
	            		 .collect(Collectors.toList());
	             System.out.println(c2);
		}

}
