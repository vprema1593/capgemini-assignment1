import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class arraylist {
	public static void main(String[] args) {
		String a ="A\n"+"quick\n"+"brown\n"+"fox\n"+"jumps\n"+"over\n"+"lazy\n"+"dog\n";
		a.lines().forEach(System.out::println);
		Stream<String> sts =a.lines();
		List<String> list=sts.collect(Collectors.toList());
		System.out.println(list);



		}


}
