package TestAnnotation;
import static java.lang.annotation.RetentionPolicy.CLASS;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Retention(CLASS)
@Target(ElementType.FIELD)
public @interface Execute1 {
	
	public abstract int Sequence1()  ;
	public abstract int Sequence2() ;
	public abstract int Sequence3() ;


}