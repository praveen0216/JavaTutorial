package tutorial.java.interview.base;

import java.util.*;
import java.util.stream.Collectors;


public class StreamsTest {
    public static void main(String[] args) {
        StreamsTest streamsTest = new StreamsTest();
        streamsTest.solution();
    }

    private void solution() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("AAA",111,"D1",1000));
        employees.add(new Employee("BBB",222,null,2000));
        employees.add(new Employee("CCC",333,"D2",3000));
        employees.add(new Employee("DDD",444,"D3",4000));
        employees.add(new Employee("EEE",555,"D2",5000));
        employees.add(new Employee("FFF",666,"D2",6000));

 

        System.out.println(employees);
        //TODO print all employee names belongs to dept "D2" -  using streams functions
        employees.stream().filter(e-> e.getDeptno() != null && e.deptno.equals("D2")).forEach(System.out::println);

 

 

        //TODO Print the sum of all employees salaries using streams -  expected to print 21000
        System.out.println("sum of salaries " + employees.stream().map(e-> e.salary).reduce((a,b) -> a+b).get());
 

 

		//TODO Given a sentence, find the word that has the highest length using Streams. expected to print "Welcome"
		String  input = " Welcome to Java world";
        System.out.println(Arrays.stream(input.split(" ")).max(Comparator.comparingInt(String::length)).get());

 

 

	    //TODO Should print most repeated number from the array, using streams or Java 7 features
        // number 5 repeated most of the (3)times, Should print 5 and not 3
        int numbers[] = {5, 7, 5, 7, 5, 2, 7, 7};

        int mostRepeatedNumber = Arrays.stream(numbers)
                .boxed()
                .collect(Collectors.groupingBy(Integer::intValue, Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .get()
                .getKey();
        System.out.println(mostRepeatedNumber);



		/*if(employees==null){
			throw new RuntimeException();
		}else{
			processEmp(employees);
		}*/

        Optional.ofNullable(employees).orElseThrow(() -> new RuntimeException("Employees cannot be null"));


 

 

    }
    private void processEmp(List<Employee> employees) {

    }
    private class Employee {

 

        private String name;
        private int id;
        private String deptno;
        private int salary;
		private List<String> addresses;

 

        public Employee(String name, int id, String deptno, int salary) {
            this.name = name;
            this.id = id;
            this.deptno = deptno;
            this.salary = salary;
        }

 

        @Override
        public String toString() {
            return name + "::" + id + "::" + deptno + "::" + salary;
        }

 

        public String getName() {
            return name;
        }

 

        public int getId() {
            return id;
        }

 

        public String getDeptno() {
            return deptno;
        }

 

        public int getSalary() {
            return salary;
        }

 

    }
}

 