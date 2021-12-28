import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class xyz
{
	int id;
	double salary;
	xyz(int e1,double s2)
	{
		id=e1;
		salary=s2;
		
	}
}
public class HashMap2 {
	public static void main(String arg[])
	{
		HashMap<Integer,xyz>hm=new HashMap<Integer,xyz>();
		xyz x1=new xyz(1,12.000);
		xyz x2=new xyz(4,17.000);
		xyz x3=new xyz(8,19.000);
		xyz x4=new xyz(3,12.000);
		xyz x5=new xyz(2,18.000);
		xyz x6=new xyz(6,29.000);
		xyz x7=new xyz(5,67.000);
		xyz x8=new xyz(7,89.000);
		xyz x9=new xyz(9,32.000);
		xyz x11=new xyz(0,45.000);
		hm.put(1, x1);
		hm.put(2, x2);
		hm.put(3, x3);
		hm.put(4, x4);
		hm.put(5, x5);
		hm.put(6, x6);
		hm.put(7, x7);
		hm.put(8, x8);
		hm.put(9, x9);
		hm.put(10, x11);
		//hm.put(1, x1);
		Iterator trav=hm.entrySet().iterator();
		while(trav.hasNext())
		{
			Map.Entry record=(Map.Entry)trav.next();
			xyz j=(xyz)record.getValue();
			System.out.println(record.getKey()+" "+j.id+" "+j.salary);;
		}
		
	}
	

	

}