package unspportedexception;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class UnsupportedOperation {

	public static void main(String[] args) {
		String str[]= {"Apple","Banana"};
	       List<String> list=Arrays.asList(str);
	       List<String> l=new ArrayList<>(list);
	       
	       l.add("Mango");
	       for(String s:l)
	    	   System.out.println(s);
		// TODO Auto-generated method stub

	}

}
