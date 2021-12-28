package TestAnnotation;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.Retention;
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface TestAnnotation {
	String value();
 
}

public class Test {
String str;
	
	Test(){
		System.out.println("this is annotation demo");
	}
	void testcase(String str) {
		this.str=str;
	}
	
public static void main(String[] args) {
		
	Test obj=new Test();
		

	}

}
