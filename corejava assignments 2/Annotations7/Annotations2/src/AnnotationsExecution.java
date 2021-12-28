import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;@Retention(RUNTIME)
@Target(METHOD)
@interface Execute{
int sequence();
}
class myClass{
@Execute(sequence=3)
public void method1(String name) {
System.out.println("name"+name);
}
@Execute(sequence=1)
public void method2(String email) {
System.out.println("email"+email);}
@Execute(sequence=2)
public void method3(int id) {
System.out.println("id"+id);
}
}
public class AnnotationsExecution {
	public static void main(String[] args) {
		myClass c = new myClass();
		c.method2("abc@gmail.com");
		c.method3(1);
		c.method1("ABC"); 

	}

}
