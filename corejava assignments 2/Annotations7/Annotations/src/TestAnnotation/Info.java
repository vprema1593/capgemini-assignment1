package TestAnnotation;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface Info {
	public abstract int developerId();
	public abstract String developername();
	public abstract String developerSupervisor();
	public abstract String developerTime();
	public abstract int NumericalVersion();
	public abstract String date();
	
	

}