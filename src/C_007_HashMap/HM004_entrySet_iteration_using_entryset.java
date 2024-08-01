package C_007_HashMap;
import java.util.HashMap;
import java.util.Map;

public class HM004_entrySet_iteration_using_entryset {
	public static void main(String[] args) {
		HashMap <String, String > cp = new HashMap<>();
		cp.put("England","London");
		cp.put("Germany", "Berlin");
	    cp.put("Norway", "Oslo");
	    cp.put("USA", "Washington DC");

	    System.out.println(cp);
	    System.out.println(cp.entrySet());
//{USA=Washington DC, Norway=Oslo, England=London, Germany=Berlin}
//[USA=Washington DC, Norway=Oslo, England=London, Germany=Berlin]

	    for(Map.Entry<String, String> e : cp.entrySet())
	    {
	    	System.out.println(e.getKey()+" "+e.getValue());
	    }
	}

}
