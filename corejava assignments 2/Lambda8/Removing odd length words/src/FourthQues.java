import java.util.ArrayList;
import java.util.Arrays;
public class FourthQues {
	interface Stringlength{
		int getLength(String str);
		}





		public static void main(String[] args) throws CloneNotSupportedException
		{
		ArrayList<String> names = new ArrayList<>(Arrays.asList("sarayu","Saanvitha","raja","leela","prema"));





		names.removeIf((String str)-> str.length()%2 == 1 );





		System.out.println(names);
		}

}
