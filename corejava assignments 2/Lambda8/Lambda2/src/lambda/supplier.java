package lambda;
import java.time.LocalDateTime;
import java.util.function.Supplier;


public class supplier {
	public static void main(String[] args) {
	     Supplier<LocalDateTime> supplier =()->LocalDateTime.now();
	     System.out.println(supplier.get());
		}


}
