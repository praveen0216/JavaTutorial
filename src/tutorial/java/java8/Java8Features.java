package tutorial.java.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Java8Features {

	public static void main(String[] args) {
	
		ArrayList<Integer> marks=getMarksList();
		System.out.println(marks);
		
		printEvenNumberList(marks);
		addMarks(marks,5);
		printCountOnFilters(marks,30);
		defaultNaturalOrderSort(marks);
		comparatorSort(marks);
		printIncreasingLength(getNamesList());
		printIncreasing(getSNamesList());

	}
	
	private static ArrayList<Integer> getMarksList() {
		return new ArrayList<Integer>(Arrays.asList(new Integer[] {70,45,10,20,15,38}));
	}

	private static void printEvenNumberList(ArrayList<Integer> marks) {
		System.out.println(marks.stream().filter(i->i%2==0).collect(Collectors.toList()));
		
	}

	private static void addMarks(ArrayList<Integer> marks, int i) {
		System.out.println(marks.stream().map(r->r+i).collect(Collectors.toList()));
		
	}

	private static void printCountOnFilters(ArrayList<Integer> marks, int i) {
		System.out.println(marks.stream().filter(r->r>i).count());
		
	}

	private static void printIncreasing(ArrayList<String> sNamesList) {
		Comparator<String> asc=(s1,s2)->{
			if(s1.length()<s2.length()) {
				return -1;
			}
			else if(s1.length()>s2.length()) {
				return 1;
			}
			else {
				return s1.compareTo(s2);
			}
		};
		Comparator<String> desc=(s1,s2)->{
			if(s1.length()<s2.length()) {
				return 1;
			}
			else if(s1.length()>s2.length()) {
				return -1;
			}
			else {
				return -s1.compareTo(s2);
			}
		};
		System.out.println(sNamesList.stream().sorted(asc).collect(Collectors.toList()));
		System.out.println(sNamesList.stream().sorted(desc).collect(Collectors.toList()));
		
	}
	
	private static ArrayList<String> getSNamesList(){
		return new ArrayList<String>(Arrays.asList(new String[] {"A","AAAA","AAA","AA","XXX","AAA"}));
	}

	@SuppressWarnings("deprecation")
	private static void printIncreasingLength(ArrayList<String> names) {
		System.out.println(names.stream().sorted((s1,s2)->
		(new Integer(s1.length())).compareTo(s2.length())).collect(Collectors.toList()));	
	}
	
	private static ArrayList<String> getNamesList(){
		return new ArrayList<String>(Arrays.asList(new String[] {"Praveen Kumar Sharma","Rahul Yadav","Puneet Sharma","Ruma Rath","KK Singh","Arvind Gupta"}));
	}
	
	private static void comparatorSort(ArrayList<Integer> marks) {
		System.out.println(marks.stream().sorted((i1,i2)->(i1>i2)?-1:(i1<i2)?1:0).collect(Collectors.toList()));
	}
	
	private static void defaultNaturalOrderSort(ArrayList<Integer> marks) {
		System.out.println("NSO--> "+marks.stream().sorted().collect(Collectors.toList()));
		System.out.println("compareTo: ASC i1.compareTo(i2)--> "+marks.stream().sorted((i1,i2)->i1.compareTo(i2)).collect(Collectors.toList()));//ASC
		System.out.println("compareTo: DESC i2.compareTo(i1)--> "+marks.stream().sorted((i1,i2)->i2.compareTo(i1)).collect(Collectors.toList()));//DESC
		System.out.println("compareTo: DESC -i1.compareTo(i2)--> "+marks.stream().sorted((i1,i2)->-i1.compareTo(i2)).collect(Collectors.toList()));//DESC
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
