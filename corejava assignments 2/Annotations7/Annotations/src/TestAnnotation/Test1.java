package TestAnnotation;
import java.lang.reflect.Method;

public class Test1 {
	@Info(developerId=1, developername="jhon",developerSupervisor="abc", developerTime="1:00:00",NumericalVersion=1,date="10-10-2018")
	public void myMethod1() {
		System.out.println("myMethod1..");
	}
	@Info(developerId=2, developername="jon",developerSupervisor="xyz", developerTime="2:00:00",NumericalVersion=2,date="10-12-2018")
	public void myMethod2() {
		System.out.println("myMethod2..");
	}

	public static void main(String[] args) throws NoSuchMethodException,SecurityException {
		System.out.println("welcome @ developers info annotation");
		Method method=new Test1().getClass().getMethod("myMethod1");
		Method method1=new Test1().getClass().getMethod("myMethod2");
	Info annotation=method1.getAnnotation(Info.class);
	Info annotation1=method.getAnnotation(Info.class);

	System.out.println(annotation.developerId()+"\n"+annotation.developername()+"\n"+annotation.developerSupervisor()+"\n"+annotation.developerTime()+"\n"+annotation.NumericalVersion()+"\n"+annotation.date());
	System.out.println(annotation1.developerId()+"\n"+annotation1.developername()+"\n"+annotation1.developerSupervisor()+"\n"+annotation1.developerTime()+"\n"+annotation1.NumericalVersion()+"\n"+annotation1.date());


	}

}
