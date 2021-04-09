package tutorial.java.regularexpression;


	import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.regex.Matcher;
	import java.util.regex.Pattern;

	public class RegrexDemo {
	  public static void main(String[] args) {
		  Supplier<String> supplier=()->{
			  List s=new ArrayList<String>(Arrays.asList(new String[] {"Praveen Kumar Sharma","Rahul Yadav","Puneet Sharma","Ruma Rath","KK Singh",
					  "Arvind Gupta","Ronit Sandhu","Nishant Jaiswal","Divya","Ankit Sinha1","@nkur","Litty"}));
			  return (String)s.get( (int)(Math.random()*(s.size())));
		
		  };
		  String str=supplier.get();
		 System.out.println(str);
	    Pattern pattern = Pattern.compile(str, Pattern.CASE_INSENSITIVE);
	    Matcher matcher = pattern.matcher("@nkur");
	    boolean matchFound = matcher.find();
	    if(matchFound) {
	      System.out.println("Match found");
	    } else {
	      System.out.println("Match not found");
	    }
	  }
	}