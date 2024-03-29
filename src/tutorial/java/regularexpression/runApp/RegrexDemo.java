package tutorial.java.regularexpression.runApp;


import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

	public class RegrexDemo {

	  public static void main(String[] args) {
		  Supplier<String> supplier=()-> {
			  List<String> s = Arrays.asList("Praveen Kumar Sharma","Rahul Yadav","Puneet Sharma","Ruma Rath","KK Singh",
					  "Arvind Gupta","Ronit Sandhu","Nishant Jaiswal","Divya","Ankit Sinha1","@nkur","Litty");
			  return s.get((int)(Math.random()*(s.size())));
		
		  };
		  String str=supplier.get();
		 System.err.println(str);
	    Pattern pattern = Pattern.compile(str, Pattern.CASE_INSENSITIVE);
	    Matcher matcher = pattern.matcher("@nkur");
	    boolean matchFound = matcher.find();
	    if(matchFound) {
	      System.err.println("Match found");
	    } else {
	      System.err.println("Match not found");
	    }
	  }
	}