package tutorial.java.hackerrank.arrays;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

class IndexedArrayResult {

    /*
     * Complete the 'arrayManipulation' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. 2D_INTEGER_ARRAY queries
     */

    public static long arrayManipulation(int n, List<List<Integer>> queries) {
        // Write your code here

        List<Integer>[][] ansArr = new ArrayList[queries.size()+1][n];
        initialize2DArray(ansArr, n, queries.size() + 1);

        for (int i = 0 ; i < queries.size(); i ++) {
        }

        return 1L;

    }

    private static void initialize2DArray(List<Integer>[][] ansArr, int columnSize , int rowSize) {
        for(int i = 0 ; i < rowSize; i ++ ) {
        }
    }

}

public class IndexedArrayTest {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("indexArrayInput.txt"));
        PrintWriter printWriter =  new PrintWriter("indexArrayOutput.txt");

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int m = Integer.parseInt(firstMultipleInput[1]);

        List<List<Integer>> queries = new ArrayList<>();

        IntStream.range(0, m).forEach(i -> {
            try {
                queries.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        long result = IndexedArrayResult.arrayManipulation(n, queries);

        printWriter.println(result);
        printWriter.flush();

        bufferedReader.close();
        printWriter.close();
    }
}

